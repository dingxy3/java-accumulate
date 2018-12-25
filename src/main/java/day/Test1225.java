package day;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2018/12/25]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test1225 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.forEach(i->{

            if (i.equals("2")){
                return;//退出本次循环
            }
                    System.out.println(i);
           }

        );
        String[] arr = null;
        String[] arr2 = null;
        String[] arr3 = null;
        StringBuilder errMsg = new StringBuilder();
        errMsg.append(arr[0]);
    }
}
