package day;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description 自定义线程池
 * @author  zhaiyq
 */
public class ThreadPoolHelp {
    /**
     * 机器内核数
     */
    private final static int  MACHINE_CORE_NUM = Runtime.getRuntime().availableProcessors();

    /**
     * 线程池核心线程数
     */
    private final static  int THREAD_CODE_NUM = 2 * MACHINE_CORE_NUM;

    /**
     * 线程池最大线程数
     */
    private final static  int THREAD_MAX_NUM = 3 * MACHINE_CORE_NUM;

    /**
     * 线程池队列长度
     */
    private final static int BLOCK_QUEUE_LENGTH = 500;

    /**
     * 初始化线程池
     */
    private static class Singleton{
        static ExecutorService executorService = new ThreadPoolExecutor(THREAD_CODE_NUM, THREAD_MAX_NUM, 5L, TimeUnit.MINUTES, new LinkedBlockingQueue<>(BLOCK_QUEUE_LENGTH), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            }
        });
    }

    /**
     *  获取线程池服务
     * @return
     */
    public static ExecutorService exeHelp() {
        return Singleton.executorService;
    }

}
