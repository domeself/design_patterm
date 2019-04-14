/**
 * @module javaSE
 * @ClassName Test
 * @Description
 * @Author superNove
 * @Date 2019/3/3 11:37
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        // 创建两个线程，执行 add() 操作
        Thread th1 = new Thread(()->{
            test.add10K();
        });
        th1.setName("thread1....");
        Thread th2 = new Thread(()->{
            test.add10K();
        });
        th2.setName("thread2....");
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        th2.join();
        System.out.println(test.count);

    }


        private volatile long count = 0;
        private   void  add10K() {
            int idx = 0;
            while(idx++ < 1000000) {
              // System.out.println(Thread.currentThread().getName()+"idxQ="+idx+",count="+count);
                count ++;
              // System.out.println(Thread.currentThread().getName()+"idxH="+idx+",count="+count);
            }
        }


}
