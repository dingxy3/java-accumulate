/*
package day;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashMap;

*/
/**
 * ============================
 *
 * @version [版本号, 2019/3/25]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 *//*

public class Test0325 {
     static class MyBean extends HashMap<String, String> {
        public String city;
    }

    public static class MyBeanSerializer implements JsonSerializer<MyBean> {

        @Override
        public JsonElement serialize(MyBean myBean, Type type, JsonSerializationContext context) {
            JsonObject object = new JsonObject();
            object.add("map", context.serialize(new HashMap<String, String>(myBean)));
            object.add("city", context.serialize(myBean.city));
            return object;
        }

    }
    */
/**
     * @param args
     *//*

    public static void main(String[] args) {
       MyBean bean = new MyBean();
        bean.city = "some city";

   */
/*      Gson gson = new Gson();

        String json = gson.toJson(bean);
        System.out.println(json);*//*

        Gson gson = new GsonBuilder().registerTypeAdapter(MyBean.class, new MyBeanSerializer()).create();
        String json = gson.toJson(bean);
        System.out.println(json);
    }
}
*/
