package day;

import com.alibaba.fastjson.JSON;

/**
 * ============================
 *
 * @version [版本号, 2019/4/26]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test0426 {

    public static void main(String[] args) {
        String a = "a,b";
       String [] b = a.split(",");
        System.out.println(JSON.toJSONString(b));
    }
}
