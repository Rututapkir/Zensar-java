import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyarraylistUserdefined {
    public static void main(String args[]){
       // List<Employee>list = new ArrayList<Employee>();
       Set<Employee> set = new LinkedHashSet<Employee>();

        Employee emp1 = new Employee(101,"Ram","Pimpri");
        Employee emp2 = new Employee(102,"Sham","Pune");
        Employee emp3 = new Employee(103,"Jam","AhmedNagar");
        Employee emp4 = new Employee(104,"Tam","Nagar");

        
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        set.add(emp4);
        System.out.println(set);
        
        for(Employee emp: set){
            System.out.println(emp);
        }
    }
}
class Employee{
    private int EmpId;
    private String name;
    private String address;
   
    public Employee(int EmpId, String name, String address) {
    }
    // getter and setter method 
    public int getEmpId(){
        return EmpId;
    }
    public void setEmpid(int cId){
        this.EmpId = EmpId;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getaddress(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
}
