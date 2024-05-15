package Thread;
class Counter{
    int count=0;
    public synchronized void increment(){  // synchronized can make the method thread safe because more than tqo thread
         count++;                          // cant call the method simultaneously...
    }
}
class ThreadSafety{
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread thread1=new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    counter.increment();
                }
            }
        });
        Thread thread2=new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    counter.increment();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.count);
    }
}

