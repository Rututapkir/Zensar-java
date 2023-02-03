import java.util.*;
public class primeException {
    public static void main(String args[]){
      IsPrime obj = new IsPrime();
      obj.isPrime();
    }
}
class IsPrimeException extends Exception{

    public IsPrimeException (String message){
        super(message);
    }

}class IsPrime {
    public void isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();
        boolean isPrime =true ;
        if(n==2){
            System.out.println("Given num is prime");
         }
         if(n%2 !=0){
            System.out.println("Given num is Prime");
         }
        try{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    //n is multiple of i (i not equal to 1 or n)
                    throw new IsPrimeException("Given num is not Prime");
                   
                }
        }
    }catch(IsPrimeException e){
        System.out.println("passed a prime num");
        
    }
}
}