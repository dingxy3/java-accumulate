package day;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2018/12/25]
 * @Auther: dingxy
 * @Description:验证
 * @since [产品/模块版本]
 * =============================
 */
public class Test1225 {
    public static void main(String[] args) {
        //list.foreach退出本次循环
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.forEach(i->{

            if (i.equals("2")){
               return;//退出本次循环
             //   break;//不能用在这边
                // continue;//不能用在这边
            }
                    System.out.println(i);
           }

        );
        //验证空指针
      /*  String[] arr = null;
        String[] arr2 = null;
        String[] arr3 = null;
        StringBuilder errMsg = new StringBuilder();
        errMsg.append(arr[0]);*/
    }
}
