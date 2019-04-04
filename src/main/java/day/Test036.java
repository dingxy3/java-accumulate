package day;

/**
 * ============================
 *
 * @version [版本号, 2019/3/26]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test036 {

    private  String id ;
    public  Test036(String id){
        this.id =id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Test036 test036 = new Test036("1");
        System.out.println(test036.getId());

    }
    public static void  test(Test036 test036){
        test036.setId("3");
    }
}

