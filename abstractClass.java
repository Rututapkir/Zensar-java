public class abstractClass {
    public static void main(String args[]){
     Students s1 = new Students();
     s1.work();
     Employees emp = new Employees();
     emp.work();
     emp.name="Rutuja";
     System.out.println("name of the Employee is: "+ emp.name);
    emp.age= 20;
    System.out.println("age of the Employee is :"+emp.age);
    // emp.address="Nagar"; //throws an error
    System.out.println(emp.address);
    Employees emp1 = new Employees();
    emp1.age = 21;
    System.out.println(emp1.age);
 // Persons p = new Persons() ;
   
}
}
abstract class Persons {
    abstract public void work ();
    String name;
    static int age;
    final String address="Pimpri";
}
class Students extends Persons{
public void work(){
    System.out.println("Study in school");
}
}
class Employees extends Persons{
    
    public void work (){
        System.out.println("works in company");
    }
}
