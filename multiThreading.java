public class multiThreading {
    public static void main(String args[]){
        System.out.println("In main ");
        JointAccount account = new JointAccount(5000);
        ParenThread parent = new ParenThread(account);
        ChildThread child = new ChildThread(account);
    }
}
class JointAccount{
    private double balance;
    public JointAccount(double balance){
        this.balance = balance;
    }
    synchronized public void withdraw(double amount){
        try {
            System.out.println("Balance Before Withdrawing  = "+ balance);

            balance = balance-amount;
            
            Thread.sleep(500);
            System.out.println("After withdrawing amount = " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class ParenThread extends Thread{
    private  JointAccount account;
    public ParenThread(JointAccount account){
        this.account = account;
        start();
    }
    public void run(){
        try {
            account.withdraw(5000);
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    private void account(Object withdraw) {
    }
    private Object withdraw(int i) {
        return null;
    }
}
class ChildThread extends Thread{
    private  JointAccount account;
    public ChildThread(JointAccount account){
        this.account = account;
        start();
    }
   
    public void run(){
        try {
            account.withdraw(3000);

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
   
}
