package Thread;
class AnotherMultiThread extends Thread{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println("This another the thread process ->"+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
public class MyMultiThread implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("This is start the thread process ->"+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
    public static void main(String[] args){
        MyMultiThread thread=new MyMultiThread();
        Thread thread1=new Thread(thread);
        AnotherMultiThread thread2=new AnotherMultiThread();
        thread1.start();
        thread2.start();
    }
}

