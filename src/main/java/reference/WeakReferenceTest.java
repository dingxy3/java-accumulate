package reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * ============================
 *
 * @version [版本号, 2018/12/5]
 * @Auther: dingxy
 * @Description:弱引用
 * @since [产品/模块版本]
 * =============================
 */
public class WeakReferenceTest {

    public static void main(String[] args) {
        String str = new String("Hello,Weak");
        ReferenceQueue queue = new ReferenceQueue();
        WeakReference<String> weak = new WeakReference<String>(str);

        WeakReference<String> weakQueue = new WeakReference<String>(str,queue);

        str = null ;
      //  queue =null;

        System.gc();

        System.out.println(weak.get());
        System.out.println(weakQueue.get());
    }
}
