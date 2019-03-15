package day;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2018/12/14]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test1214 {

    public static int a = 1;
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
          //  String item = (String) arrayList.get(i);
            System.out.println( String.valueOf(arrayList.get(i)));

        }
         int c =1;
         String d =   "1";
         String e =  String.valueOf(1);
        short a = 1;
        int b = a ;
    }
}
