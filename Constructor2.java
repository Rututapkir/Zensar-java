public class Constructor2 {
    public Constructor2(int a,int b){
System.out.println(a+b);
}
public Constructor2(int a,int b,int c){
    System.out.println(a+b+c);
}
public static void main(String args[]){
    Constructor2 const1 = new Constructor2(4, 6);
    Constructor2 const2 = new Constructor2(3, 6, 8);
}
    
}
 