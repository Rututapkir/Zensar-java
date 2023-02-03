public class interfaces {
    public static void main(String args[]){
       // Operation obj = new Operation(); it will throws an error 
       Operation ref ;
       ref = new Demo();
       Operation obj = new Demo();
       obj.addition(10, 20);
       Demo1 D = new Demo1();

    }
}
interface Operation{
    void addition(int a ,int b);
}
class Demo implements Operation{
    public void addition(int a ,int b){
        int sum = a+b;
        System.out.println("Sum :"+sum);
    }
}
 
class Demo1 implements Operation{
    public void addition(int a,int b){
        System.out.println();
    }
}
