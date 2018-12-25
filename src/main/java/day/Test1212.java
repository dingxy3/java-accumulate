package day;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2018/12/12]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test1212 {

    /**
     * 验证 装箱拆箱业务
     * @param args
     */
    public static void main(String[] args) {
        long a = 1800L;
        Long b = 1600L;
        System.out.println(a>b);

        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        System.out.println(list.size());
    }
}
