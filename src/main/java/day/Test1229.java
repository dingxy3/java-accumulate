package day;

import bean.Org;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import remove.TestRemove;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ============================
 *
 * @version [版本号, 2018/12/29]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test1229 {
    public static void main(String[] args) {
       List<Org> list = TestRemove.get();
        Org org = new Org();
        tree0(org, list, "0");
        System.out.println(JSON.toJSONString(org));
       /* JSONArray array =  treeRecursionDataList(list(),  "4");
        System.out.println(JSON.toJSONString(array));*/
        // tree();
    }

    //2层循环替代递归
    public static void tree() {
        List<Org> list = TestRemove.get();
        Org trees = new Org();
        long a = System.currentTimeMillis();
        for (Org o : list) {
            if ("0".equals(o.getPid())) {
                trees = o;
            }
            for (Org o1 : list) {
                if (o1.getPid().equals(o.getId())) {
                    if (o.getChild() == null) {
                        o.setChild(new ArrayList<>());
                    }
                    o.getChild().add(o1);
                }
            }
        }
        long b = System.currentTimeMillis();
        System.out.println(JSON.toJSONString(trees));
        System.out.println("tree()耗时：" + (a - b));
    }

    public static void tree0(Org org, List<Org> list, String pid) {
        for (Org o : list) {
            if (pid.equals(o.getPid())) {
                tree0(org, list, o.getId());
                if (org.getChild() == null) {
                    org.setChild(new ArrayList<>());
                }
                org.getChild().add(o);


            }


        }
    }
    public static List<Map<String, Object>> list(){
        List<Map<String, Object>> list  = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("id","1");
        map.put("pid","2");
        Map<String, Object> map1 = new HashMap<>();
        map1.put("id","2");
        map1.put("pid","3");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("id","3");
        map2.put("pid","4");
        list.add(map);
        list.add(map1);
        list.add(map2);
        return list;

    }

    public static JSONArray treeRecursionDataList(List<Map<String, Object>> treeList, String parentId) {
        JSONArray childMenu = new JSONArray();
        for (Object object : treeList) {
            JSONObject jsonMenu = JSONObject.parseObject(JSON.toJSONString(object));
            String menuId = jsonMenu.getString("id");
            String pid = jsonMenu.getString("pid");
            if (parentId.equals(pid)) {
                JSONArray c_node = treeRecursionDataList(treeList, menuId);
                jsonMenu.put("children", c_node);
                childMenu.add(jsonMenu);
            }
        }
        return childMenu;
    }
}

