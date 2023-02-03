import java.util.*;
public class conditonal1 {
    public static void main(String args[]){
        int accountBalance=10000;
        Scanner sc = new Scanner(System.in);
        int withdraw=sc.nextInt();
         if(withdraw<=accountBalance){
                System.out.println("Congratulation your amount is withdrawal successfully"+withdraw);
            }else{

               System.out.println("Insufficient balance");
            }
     
}
    
}
