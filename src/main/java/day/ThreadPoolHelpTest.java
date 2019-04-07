package day;

import java.util.HashMap;
import java.util.Map;

/**
 * ============================
 *
 * @version [版本号, 2019/4/4]
 * @Auther: dingxy
 * @Description:验证单例线程池关闭后是否还有线程可以执行
 * @since [产品/模块版本]
 * =============================
 */
public class ThreadPoolHelpTest {

    public static final Map<String ,String> h = new HashMap();
    static {
        h.put("1","2");
        h.put("2","3");
    }
    public static void main(String[] args) {
        ThreadPoolHelp.exeHelp().execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 2 ;i++)
                {
                    System.out.println(h.get(String.valueOf(i)));
                }
            }
        });
       ThreadPoolHelp.exeHelp().shutdown();
         //如果上面关闭了，那么线程池就没呢，下面代码不会执行
        ThreadPoolHelp.exeHelp().execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 1 ; i <= 2 ;i++)
                {
                    System.out.println("hah"+h.get(String.valueOf(i)));
                }
            }
        });
    }
}
