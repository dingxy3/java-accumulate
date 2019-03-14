package day;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Optional;

/**
 * ============================
 *
 * @version [版本号, 2019/1/4]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test0104 {
    private static String a = "{\"code\":\"0\",\"message\":\"请求成功\",\"data\":{\"pageIndex\":\"1\",\"pageSize\":\"1\",\"sortFiled\":\"contract_id\",\"sortOrder\":\"desc\",\"totalPages\":1,\"totalRecord\":1,\"results\":[{\"contractId\":\"2144051764599455752\",\"contractTitle\":\"dingxy测试API合同\",\"signOrdered\":false,\"contractStatus\":\"SENT\",\"notaryFlag\":null,\"sendTime\":1544425863000,\"finishTime\":null,\"signDeadline\":1544512259000,\"modifyTime\":null,\"contractType\":null,\"receivers\":[{\"receiverId\":\"2144051768978309122\",\"enterpriseName\":\"江苏满运软件科技有限公司天津分公司\",\"userName\":\"江苏满运软件科技有限公司天津分公司\",\"alreadySigned\":true,\"signStatus\":\"COMPLETE\",\"receiverType\":\"SENDER\",\"userAccount\":\"17501059948\",\"privateLetter\":null,\"requireIdentityAssurance\":false,\"forceHandWrite\":null,\"faceVerify\":null,\"routeOrder\":0},{\"receiverId\":\"2144051769011863558\",\"enterpriseName\":\"\",\"userName\":\"小兔兔\",\"alreadySigned\":false,\"signStatus\":\"BEING_CARRIED\",\"receiverType\":\"SIGNER\",\"userAccount\":\"15700000006\",\"privateLetter\":\"\",\"requireIdentityAssurance\":false,\"forceHandWrite\":true,\"faceVerify\":false,\"routeOrder\":0}]}]}}";
    public static void main(String[] args) {
        //不报错输出null
        JSONObject objectb = JSON.parseObject(a);
        Object objectb1 = Optional.ofNullable(objectb).map(o->o.get("code"));
        Object objectb2 = Optional.ofNullable(objectb).map(o->o.get("code")).orElse("没取到值");
    }
}
