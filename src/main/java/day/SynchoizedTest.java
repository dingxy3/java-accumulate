package day;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ============================
 *
 * @version [版本号, 2019/3/15]
 * @Auther: dingxy
 * @Description:
 * @since [产品/模块版本]
 * =============================
 */
public class SynchoizedTest {

    public synchronized void testMethod(String threadName){
        for(int i = 0;i < 10;i++)
        {
            System.out.println("testMethod is running!" + threadName);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public  synchronized void  testMethod2(String threadName){
        for(int i = 0;i < 10;i++)
        {
            System.out.println("testMethod2 is running!" + threadName);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public synchronized static void staticMethod1(String threadName){                     //静态方法1
        for( int i = 0; i < 10 ; i++)
        {
            System.out.println("static method1 is running!" + threadName);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public synchronized static void staticMethod2(String threadName){                      //静态方法2
        for( int i = 0; i < 10 ; i++)
        {
            System.out.println("static method2 is running!" + threadName);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public   void staticMethod3(String threadName){                      //静态方法2
        for( int i = 0; i < 10 ; i++)
        {
            System.out.println("static method3 is running!" + threadName);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        //同一个对象在两个线程中分别访问该对象的两个同时是静态或者两个同时是非晶态的同步方法.会产生互斥
       SynchoizedTest test = new SynchoizedTest();
       /*  Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                test.testMethod("method1");
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                test.testMethod2("method2");
            }
        });
        ExecutorService excute = Executors.newScheduledThreadPool(1000);
        try
        {
            excute.submit(t1);
            excute.submit(t2);
        }catch (Exception e)
        {

        }finally {
            excute.shutdown();
        }*/
        //2、同一个对象在两个线程中分别访问该对象的一个静态同步方法和非静态同步方法,不会产生互斥。2个锁不同
        //
       /* SynchoizedTest test1 = new SynchoizedTest();
        Thread t3= new Thread(new Runnable()
        {
            @Override
            public void run() {
                test.testMethod("method1");
            }
        });
        Thread t4 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                staticMethod1("staticMethod1");
            }
        });
        ExecutorService excute1 = Executors.newScheduledThreadPool(1000);
        try
        {
            excute1.submit(t3);
            excute1.submit(t4);
        }catch (Exception e)
        {

        }finally {
            excute1.shutdown();
        }*/
        //3、不同对象在两个线程中调用同一个非静态同步方法。因为非静态方法的锁是对象锁。不同对象不同锁
        SynchoizedTest test1 = new SynchoizedTest();
        Thread t3= new Thread(new Runnable()
        {
            @Override
            public void run() {
                test1.testMethod("method1");
            }
        });
        Thread t4 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                test1.staticMethod3("method不同对象");
            }
        });
        ExecutorService excute1 = Executors.newScheduledThreadPool(1000);
        try
        {
            excute1.submit(t3);
            excute1.submit(t4);
        }catch (Exception e)
        {

        }finally {
            excute1.shutdown();
        }

       /*SynchoizedTest test1 = new SynchoizedTest();
        Thread t3= new Thread(new Runnable()
        {
            @Override
            public void run() {
                test1.testMethod("method1");
            }
        });
        Thread t4 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                new SynchoizedTest().testMethod("method不同对象");
            }
        });
        ExecutorService excute1 = Executors.newScheduledThreadPool(1000);
        try
        {
            excute1.submit(t3);
            excute1.submit(t4);
        }catch (Exception e)
        {

        }finally {
            excute1.shutdown();
        }*/
    }
}
