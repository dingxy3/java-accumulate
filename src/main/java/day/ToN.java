package day;

import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2019/3/15]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class ToN {
    public static  String toN(int n){
        if (n == 1)
        {
            return "1";
        }
       // return n+","+toN(n-1).split(",")[n-2];

        if (n>2){
            return n + "," + toN(n-1).split(",")[n-2];
        }
        return "2,1";

    }

    private static void recursionData(List<Integer> old, List<Integer> result) {
        if (old.size() < 1)
            return;
        for (int i = 0; i < 2; i++) {
            if (i % 2 == 0) {
                result.add(old.get(i));
                old.remove(0);
            } else {
                if (old.size() > 0) {
                    int num = old.get(0);
                    old.remove(0);
                    old.add(num);
                }
            }
        }
        recursionData(old, result);

    }
    public static void main(String [] args){
       System.out.print(toN(4));
    }
}
