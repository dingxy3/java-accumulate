package day;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
    Test1214 we = new Test1214();
    public  void a (){
    }
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
        list.stream().anyMatch(Predicate.isEqual("2") );
        //验证空指针
      /*  String[] arr = null;
        String[] arr2 = null;
        String[] arr3 = null;
        StringBuilder errMsg = new StringBuilder();
        errMsg.append(arr[0]);*/
    }
}
