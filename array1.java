import java.util.*;

public class array1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]=new int[5];
        int i; 
        for( i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            
        }
        System.out.println("array of of given numm is");
             
         for( i=0;i<num.length;i++){
            System.out.print( num[i]);
            
        }
        

    }
    
}
