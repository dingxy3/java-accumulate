package day;

import java.util.ArrayList;

/**
 * ============================
 *
 * @version [版本号, 2018/12/29]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class T {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        table(sum / 2, array);
    }

    static void table(int avg, int[] array) {
        int n = array.length;
        int[][] f = new int[n + 1][avg + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= avg; j++) {
                if (j >= array[i - 1]) {
                    f[i][j] = Math.max(f[i - 1][j - array[i - 1]] + array[i - 1], f[i - 1][j]);
                } else {
                    f[i][j] = f[i - 1][j];
                }
            }
        }
        int x = avg;
        ArrayList<Integer> array2 = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            array2.add(array[i]);
        }
        System.out.print("第一组:");
        for (int i = n; i > 0; i--) {
            if (f[i][x] > f[i - 1][x]) {
                int v = array[i - 1];
                System.out.print(v + "\t");
                x -= v;
                if (array2.indexOf(v) > -1) {
                    array2.remove(array2.indexOf(v));
                }
            }
        }
        System.out.print("\n第二组:");
        for (int i = 0; i < array2.size(); i++) {
            System.out.print(array2.get(i) + "\t");
        }
    }
}
