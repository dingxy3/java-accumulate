package day;

import bean.Org;
import com.sun.org.apache.xpath.internal.operations.Or;
import remove.TestRemove;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2018/12/7]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test1207 {

    /**
     * 验证break语句,是否跳出循环，continue结束本次循环
     * @param args
     */
    public static void main(String[] args) {
        List<Org> list = TestRemove.get();
        String type ="2" ;
        String a = "100" ;
        switch (type){
            case "2":
                   for (Org o :list){
                       if (o.getId().equals(type)){
                           a=o.getPid();
                           break;
                       }
                   }
                //    a= "99";
                    break;
            case "1":

                break;
            case "3":

                break;
                default:
                    break;

        }
        System.out.println(a);

        List<Org> list0 = TestRemove.get0();
        List<Org> list1 = new ArrayList<>();
        int b= 9/10;
        System.out.println(b);
    }
}
