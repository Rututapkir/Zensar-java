public class minOf3 {
    public static void main(String args[]){
        int num1=12;
        int num2=14;
        int num3=3;
        
        
        if(num1<=num2&&num1<=num3){
            System.out.println("smallest num is "+num1);
        }else if(num2<=num1&&num2<=num3){
            System.out.println("smallest num is "+ num2);
        }else 
        {
            System.out.println("smallest num is "+num3);
        }
    }
    
}
