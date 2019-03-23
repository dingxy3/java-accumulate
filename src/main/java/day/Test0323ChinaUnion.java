package day;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 * @Date: Created in  2019/3/23
 **/
public class Test0323ChinaUnion {

   private static String str = "";
    public static void print(int i){
        if (i == 0)
        {
            return ;
        }
        /**
         *     *
         *     **
         *     ***
         *     ****
         */

        System.out.println(str);
        str+="*" ;
        print(i-1);

        System.out.println(str.substring(i-1));
    }

    public static void main(String[] args) {
        print(4);
    }
}
