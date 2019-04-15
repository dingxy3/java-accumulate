package day;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ============================
 *
 * @version [版本号, 2019/4/15]
 * @Auther: dingxy
 * @Description:add 和addAll引起的误会，
 * add直接把set加进去了，就是一个set  addAll把每个元素加进去，这个是在mybatisforeach的时候出错
 * @since [产品/模块版本]
 * =============================
 */
public class Test0415 {


    public static void main(String[] args) {

        List list = new ArrayList() ;
        list.add(1) ;
        list.add(1) ;
        list.add(2) ;
        list.add(3) ;
        list.add(2) ;

        Set set1 = new HashSet(list);
        List list1 = new ArrayList();
        list1.add(set1);

        Set set2 = new HashSet(list);
        List list2 = new ArrayList();
        list2.addAll(set2);
    }
}
