import java.util.*;
public class switchcase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:System.out.println("your name is start with A - Amruta");
                
                break;
            case 2:System.out.println("your name is start with B - Ben");
                
                break;
            case 3:System.out.println("your name is start with D -Devi ");
                
                break;
            case 4:System.out.println("your name is start with J - Josh");
                
                break;

        
            default:System.out.println("Your name is not getting");
                break;
        }

    }
}