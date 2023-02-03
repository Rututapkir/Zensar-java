public class createThread {
    public static void main(String args[]){
        System.out.println("Starts in main");
      myThread thread1 = new myThread();
      System.out.println("Main method ends");
    }
}
 class myThread extends Thread{
 public myThread(){
    System.out.println("Constructor starts");
    start();
    System.out.println("Constructor ends");
 }
 public void run(){
    try {
        //logic 
        for(int i=1;i<=30;i++){
            System.out.print(" "+i);
            sleep(500);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
 }
}
