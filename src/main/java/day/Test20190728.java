package day;

import concurrent.CallableDemo;
import concurrent.ThreadDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @param
 * @Author: dingxy3
 * @Description:线程之间的值传递
 * @Date: Created in  2019/7/28
 **/
public class Test20190728 {


   public static    ExecutorService executorService = new ThreadPoolExecutor(2, 2, 0, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue(2), new ThreadFactory() {
        private final AtomicLong THREAD_COUNT = new AtomicLong(0L);
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName("tread:" + this.THREAD_COUNT.getAndIncrement());
            t.setDaemon(false);
            return t;
        }
    },new ThreadPoolExecutor.AbortPolicy());

    /**
     * 实现runable接口
     */
    private static   void consumerRunnable(){


        executorService.submit(new ThreadDemo(1,"jack"));

        try {

        }
        catch (Exception e)
        {

        }
        finally {
            executorService.shutdown();
        }

    }
    /**
     * 实现runable接口
     */
    private static   void consumerCallable(){

        //如果不提交线程池执行get一直会阻塞在哪边
      // FutureTask<Integer> task = new FutureTask<Integer>(new CallableDemo(1,"jack001"));
        //测试task.get()方法阻塞线程
        FutureTask<Integer> task2 = new FutureTask<Integer>(new CallableDemo(2,"jack002"));
        //Future<Integer> f= executorService.submit(new CallableDemo(1,"jack001"));
        executorService.submit(task2);

        //.get()会一直等待线程池执行完，注释当前线程
     try {
            System.out.println(task2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        try {

        }
        catch (Exception e)
        {

        }
        finally {
          //随手shutdown
            executorService.shutdown();
        }

    }



    public static void main(String[] args) {

        Rpcservice rpc = new Rpcservice();
        System.out.println("123");
        //consumerRunnable();
        consumerCallable();
        String i ="" ;
        System.out.println("1234");
        /*executorService.submit(new Runnable() {
            @Override
            public void run() {
                rpc.getRpcResult(i);
            }
        });
        executorService.submit(()->rpc.getRpcResult(i));
        HttpService http = new HttpService();
        Map a = new HashMap();
       Future<Map<String,Object>> f = executorService.submit(()->http.http(a));*/
    }

    static class Rpcservice{
        Map<String, Object> getRpcResult(String i){
            return null;
        }
    }
    static  class  HttpService{
        Map<String, Object> http(Map map){
            return null;
        }
    }

}
