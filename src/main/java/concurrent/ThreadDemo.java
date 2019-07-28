package concurrent;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * @Date: Created in  2019/7/28
 **/
public class ThreadDemo  implements Runnable{

    private  int  id ;

    private  String name ;


    public  ThreadDemo(int id , String name){
        this.id = id ;
        this.name = name ;
    }

    @Override
    public void run() {
        System.out.println("========="+id);
        System.out.println("========"+name);
    }
}
