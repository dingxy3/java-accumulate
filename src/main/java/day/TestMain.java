package day;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ============================
 *
 * @version [版本号, 2019/1/17]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class TestMain {
    public static void main(String[] args) {
       //System.out.print(Test0117.isUserTagEnum(Test0117.USER_AGENT,15L));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       System.out.println(simpleDateFormat.format(new Date(1548099999*1000L)));
        System.out.println(new Date(1548099999L*1000));
        Long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp);

        Date signTime = new Date(Long.valueOf("1548099999")*1000);
        System.out.println(signTime);

        Long i =1L;
        System.out.println(i == 1);
    }

}
