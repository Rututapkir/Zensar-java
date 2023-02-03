import java.util.*;
public class typeCasting {
    public static void main(String []args){
        Scanner Sc = new Scanner (System.in);

        System.out.println("Enter value ");
        float a= Sc.nextFloat();
       
       int b=(int)a;
       System.out.println(b);
      
       char ch ='a';
       char ch2= 'b';
      
       int number = ch; // char to int 
       int number2= ch2;
       System.out.println(number);
       System.out.println(number2);

     int n = 5;
     int m = 2;
     int div = 5/2;
     System.out.println((float)div);

     int num = 50;
     double height = num;
     height = 55.6;
     num = (int)height;
     System.out.println("Height is "+ height+" , num is  "+num);
        }
}


