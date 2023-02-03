public class reflection {
    public static void main(String args[]){
        Employee emp = new Employee(0, null, 0);
        MyReflection.display(emp);
    }
}
 class MyReflection{
   static public void display(Employee emp)
     System.out.println("In display");
     Class c = emp.getClass();
     System.out.println(c.getPackageName());
     System.out.println(c.getName());
     int num[]= {10,30,40,50};
}
class Employee implements Operation{

    @Override
    public void addition(int a, int b) {
        // TODO Auto-generated method stub
        
    }
    public void 
}
