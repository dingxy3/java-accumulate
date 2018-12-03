package remove;

import bean.Org;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2018/12/3]
 * @Auther: dingxy
 * @Description:java.util.ConcurrentModificationException
 * @since [产品/模块版本]
 * =============================
 */
public class TestRemove {

    public static void main(String[] args) {
        List<Org> list = get();
        //java.util.ConcurrentModificationException
        for (Org d : list){
            if ("3".equals(d.getId())){
                list.remove(d);
            }
        }
        //java.util.ConcurrentModificationException
        Iterator<Org> it = list.iterator();
        while (it.hasNext()){
            Org d = it.next();
            if ("3".equals(d.getId())){
                list.remove(d);
            }

        }
        //就是如果同时存在2个id等于3的话，
        // 尤其最后一个在list尾巴，就会删除不了。
        for (int i =0 ;i<list.size();i++){
            if ("3".equals(list.get(i).getId())){
                list.remove(list.get(i));
            }
        }

        //正确操作做法
        Iterator<Org> it0 = list.iterator();
        while (it.hasNext()){
            Org d = it.next();
            if ("3".equals(d.getId())){
                it0.remove();
            }

        }

    }
    public static List<Org> get(){

        List<Org> list = new ArrayList<Org>();
        Org org = new Org();
        org.setId("1");
        org.setPid("2");
        org.setName("a");

        Org org1 = new Org();
        org1.setId("2");
        org1.setPid("3");
        org1.setName("b");

        Org org2 = new Org();
        org2.setId("3");
        org2.setPid("4");
        org2.setName("c");

        Org org3 = new Org();
        org3.setId("4");
        org3.setPid("5");
        org3.setName("d");

        Org org4 = new Org();
        org4.setId("5");
        org4.setPid("0");
        org4.setName("e");

        list.add(org);
        list.add(org1);
        list.add(org2);
        list.add(org3);
        list.add(org4);
        return list;

    }
}
