package pack;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Coder: yuyang
 * Date: 2019/11/10
 * Description:
 * Version:
 */
public class T1 {



      public  static void main(String[] args){

          Object o;
//          HashMap hashMap = new HashMap();
//          hashMap.put("1", "2");
//
//          Object put = hashMap.put("1", "3");
//          System.out.println(put);

          System.out.println("MainThreadId:" + Thread.currentThread().getId());

          Thread thread = new Thread(){
              @Override
              public void run() {
                  super.run();
                  for (int i=0; i<10000; i++) {

                      if (Thread.interrupted()) {
                          //
                          return;
                      }
                      try {
                          Thread.sleep(2000);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                          //收尾
                          return;
                      }
                      System.out.println("number:" + i + "  ThreadId:" + Thread.currentThread().getId());

                  }
              }
          };

          thread.start();

          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }

          thread.interrupt();

      }

      HashMap j;
      //使用Executors 类
    ExecutorService fix = Executors.newFixedThreadPool(3);

    ScheduledExecutorService sc = Executors.newScheduledThreadPool(5);

    // 1. 创建可缓存线程池对象
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();


    // 1. 创建单线程化线程池
    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

}
