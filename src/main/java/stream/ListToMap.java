package stream;

import bean.Org;
import com.alibaba.fastjson.JSON;
import remove.TestRemove;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * ============================
 *
 * @version [版本号, 2018/12/3]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class ListToMap {

    public static void main(String[] args) {
         List<Org> list = TestRemove.get();
         //
         List<String> l=  list.stream().map(org -> org.getName()).collect(toList());
         System.out.println("==="+ JSON.toJSONString(l));
       // list.stream().filter(org -> org.getName()).collect(toList());git

       //list to mao
        Map<String,Org> map = list.stream().collect(Collectors.toMap(o -> o.getId(), o->o));
        System.out.println("==="+ JSON.toJSONString(map));

        Map<String,Org> map1 = list.stream().collect(Collectors.toMap(Org::getId, org ->
        org));
        System.out.println("==="+ JSON.toJSONString(map1));

        //lis转map，如果key1等于key2只取key1
        Map<String,Org> map2 = list.stream().collect(Collectors.toMap(Org::getId, org -> org,(key1,key2)->key1));
        System.out.println("==="+ JSON.toJSONString(map1));

        list.stream().map(org -> org.getId()+"001");
        System.out.println("map==="+ JSON.toJSONString(list));
      //  list.stream().flatMap();
        System.out.println("map==="+ JSON.toJSONString(list));
    }
}
