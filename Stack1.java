import java.util.List;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        List<String>list = new Stack<String>();
        list.add("Ram");
        list.add("Jam");
        list.add("Tam");
        System.out.println(list);
        String removedName = ((Stack<String>) list).pop();
        System.out.println(removedName);
}
}