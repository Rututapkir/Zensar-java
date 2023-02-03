import java.util.*;
 import java.util.HashSet;
public class Collection {
    public static void main(String args[]){
        //Set set = new HashSet();
        Set set = new TreeSet();
        set.add("Ram");
        set.add("Jam");
        set.add("Tam");
        System.out.println(set);
    
        System.out.println("Using Iterator");
       
       Iterator<String> iterator = set.iterator();
       while(iterator.hasNext()){
       //String name = (String)iterator.next();
        String name = iterator.next();
        System.out.println(name);
       }
    }
}
