package day;

/**
 * @param
 * @Author: dingxy3
 * @Description:类初始化加载顺序
 * 非静态代码块在类每次被使用或者实例化的时候被执行
 * 静态代码块只在第一次时执行一次
 * 静态代码块>非静态代码块>构造方法
 * @Date: Created in  2019/3/25
 **/
public class ClassLoaderOrder {

    public static void main(String args[]){
        run();
    }

    static ClassLoaderOrder demo = new ClassLoaderOrder();
    static
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public ClassLoaderOrder(){
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }
    public static void run(){
        System.out.println("4");
    }
    int a = 100;
    static int b = 200;
   // static ClassLoaderOrder demo = new ClassLoaderOrder();
}
