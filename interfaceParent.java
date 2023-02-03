public class interfaceParent {
    public static void main(String args[]){
        Demo1 d = new Demo1();
      ParentInterface p = new ParentInterface();
      ParentInterface p = d.display();
interface ParentInterface{
    void display();
}
interface ChildInterface extends ParentInterface{
    void Show();
   default void ComplexLogic(){
        System.out.println();
    }
}
class Demo1 implements ChildInterface{
    public void display(){
        System.out.println("fdgj");
    }
    public void Show(){
        System.out.println("ugf");
    }
}