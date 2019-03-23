package day;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * @Date: Created in  2019/1/6
 **/
public class Test20190106 {

    public  Test20190106(){
        System.out.println("我是父亲，我先初始化");
    }
    protected void doSomething(){
        System.out.println("father do");
    }

    public static void main(String[] args) {
        Test20190106 test = new Son();
        test.doSomething();
    }

}
class Son extends  Test20190106{
    @Override
    public void doSomething(){
        System.out.println("son do");
    }
}

