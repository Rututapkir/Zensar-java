public class ExceptionHandling {
   public static void main(String args[]){
    System.out.println("IN main Start");
    
   
    Division obj1 = new Division();
    obj1.division(10, 0);
   
    System.out.println("In main end");
   } 
    
}
 class Division{

    public Division(){
        System.out.println("its a constructor");
    }

    public void division(int a,int b){
        try{
            String name = null;
            System.out.println("Length of name is "+ name.length());
        int div= a/b;
        System.out.println("Division: "+div);
        // System.out.println
    }catch(ArithmeticException e){
        System.out.println("Divide by zero is not possible ");
       // e.printStackTrace();
    }
    catch(NullPointerException e){
        System.out.println("Given String is null");
    }catch(Exception e){    // General catch box
        System.out.println("In catch "+ e.getMessage());
    }finally{
        System.out.println("Its a finally");
    }
    System.out.println("After catch box");

}
}
 
 
