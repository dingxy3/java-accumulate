package concurrent;

import java.util.concurrent.Callable;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * @Date: Created in  2019/7/28
 **/
public class CallableDemo implements Callable<Integer> {

    private  int  id ;

    private  String name ;


    public  CallableDemo(int id , String name){
        this.id = id ;
        this.name = name ;
    }

    @Override
    public Integer call() throws Exception {

        //Thread.sleep(2000);
        System.out.println(id);
        System.out.println(name);
        return 2019;
    }
}
