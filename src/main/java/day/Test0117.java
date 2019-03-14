package day;

import java.util.ArrayList;
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
public enum  Test0117 {
    USER_PARTY_TAG(1L, "党员标识"),
    USER_SERVICE_AGREEMENT(2L, "用户服务协议"),
    USER_PRIVACY_AGREEMENT(4L, "用户隐私协议"),
    USER_MEMBER_AGREEMENT(8L, "运满满会员服务协议"),
    USER_AGENT(16L, "经纪人标识"),
    DEFINED_CAR(32L, "定义车"),
    USER_NOT_PARTY(64L, "不是预报名党员");

    private long code;
    private String desc;

    private Test0117(long code, String param4) {
        this.code = code;
        this.desc = desc;
    }

    public long getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public static Test0117 getUserTagByCode(Long code) {
        Test0117[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            Test0117 e = arr$[i$];
            if(e.getCode() == code.longValue()) {
                return e;
            }
        }

        return null;
    }

    public static List<Test0117> getEnumsByUserTag(Long userTag) {
        List<Test0117> result = new ArrayList();
        Test0117[] arr$ = values();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            Test0117 userTagEnum = arr$[i$];
            if(isUserTagEnum(userTagEnum, userTag)) {
                result.add(userTagEnum);
            }
        }

        return result;
    }

    public static boolean isUserTagEnum(Test0117 userTagEnum, Long userTag) {
        return null != userTag && null != userTagEnum?(userTagEnum.getCode() & userTag.longValue()) != 0L:false;
    }
}
