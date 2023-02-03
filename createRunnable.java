public class createRunnable {
    public static void main(String args[]){
     System.out.println("In main Start");
     myThread2 thread2 = new myThread2();
     System.out.println("In main method ends");
    }
}
class myThread2 implements Runnable{
    Thread t ;
    public myThread2(){
        System.out.println("Constructor starts");
           t = new Thread(this);
        t.start();
    }
    public void run(){
        t = new Thread();
        try {
            for(int i = 65; i<= 90; i++){
                System.out.print((char)i+" ");
               Thread.sleep(500);
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
