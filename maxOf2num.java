import java.util.*;
public class maxOf2num {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1=12;
        int num2=34;
        int largest;

        if(num1>num2){
            largest=num1;
        }else{
            largest=num2;
        }
        System.out.println("largest num is "+largest);
    }
    
}
