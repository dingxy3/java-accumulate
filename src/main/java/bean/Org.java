package bean;

/**
 * ============================
 *
 * @version [版本号, 2018/12/3]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Org {
    private  String id ;

    private  String pid ;

    private  String name ;

    private  Long a = 0L ;

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
