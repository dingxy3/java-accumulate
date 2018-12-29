package day;

/**
 * ============================
 *
 * @version [版本号, 2018/12/28]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class Test1228 {

    static   class  Dog extends Test1228 {

    }
    static class  Cat extends Test1228 {
        public  void hello(){
            System.out.println("Hello,cat");
        }
    }

    public void say(Test1228 dog){
        System.out.println("Hi,Test1228");
    }

    public void say(Dog dog){
        System.out.println("Hi,dog");
    }
    public void say(Cat cat){
        System.out.println("Hi,cat");
    }

    public  void hello(){
        System.out.println("Hello,test1228");
    }
    public static void main(String[] args) {
        Test1228 dog = new Dog();
        Test1228 cat = new Cat();
        dog.say(dog);
        cat.say(cat);

        cat.hello();

    }
}
