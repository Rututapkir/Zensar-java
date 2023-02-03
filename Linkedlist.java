import java.util.List;
import java.util.Vector;

public class Linkedlist {
    public static void main(String args[]){
        List<Integer>list = new Vector<Integer>();
       // Vector<Integer>list = new Vector<Integer>();
        System.out.println(list.size());
       // System.out.println(list.capacity());
        //Vector v = new Vector<>();
       

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        System.out.println(list.size());
       // System.out.println(list.capacity());
    }
}
