package day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @param
 * @Author: dingxy3
 * @Description:
 * @Date: Created in  2019/3/24
 **/
public class BlockQueue<E> {

    private LinkedList<E> container = new LinkedList<>();

    private volatile int size ;

    private volatile int capacity ;

    private Lock lock = new ReentrantLock();

    private final Condition isNull = lock.newCondition();

    private final  Condition isFull = lock.newCondition();


    public  BlockQueue(int cap){
        this.capacity=cap;
    }

    public void  add(E data) throws InterruptedException {
        if (data == null)
        {
            throw new NullPointerException();
        }
        lock.lockInterruptibly();
        try
        {
                while (size == capacity)
                {
                    //队列满了需要阻塞
                    isFull.await();
                }
                ++size;
                container.add(data);
                isFull.signal();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }finally
        {
          lock.unlock();
        }



    }

    public E take() throws InterruptedException {

        lock.lockInterruptibly();
        try {
            while (size == 0)
            {
               //如果队列是空的，阻塞不让取值
                isNull.await();

            }
            --size;
            E e = container.pop();
            isNull.signal();
            return e ;
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return  null ;
    }

}
