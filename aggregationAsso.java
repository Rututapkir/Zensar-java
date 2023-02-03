//import com.aggregation;

public class aggregationAsso {
    public static void main(String args[]){
        Department department = new Department();
        
        Employee employee = new Employee(department);
       
    }
    
}
 class Employee{
    private int empId;
    private String empName;
    private String empSallary;
    private Department department;
    public Employee(Department department){
        this.department = department;
    }

}
 class Department{
    private int deptId;
    private String deptName;
}
