import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;


public class MySerializationD {
    public static void main(String args[]){
        SerializationDesrialization obj = new SerializationDesrialization();
        obj.writeFile();
        obj.readFile();
    }
}
class SerializationDesrialization{
    public void writeFile(){
        try {
            FileOutputStream fout = new  FileOutputStream ("C:/Users/user/OneDrive/Desktop/Zensar java/StudentProperties.txt");
            ObjectOutputStream objectoutstream = new ObjectOutputStream(fout); 

            Employee emp = new Employee(102, "Rutuja",50000, "rutu@123");
            objectoutstream.writeObject(emp);
            System.out.println("Write operation Done ");
            objectoutstream.close();
            fout.close();

        } catch (Exception e) {
           System.out.println(e);
            
           }
           
        }
        public void readFile(){
            try {
                FileInputStream finputstream = new  FileInputStream ("C:/Users/user/OneDrive/Desktop/Zensar java/StudentProperties.txt");
                ObjectInputStream objectinputstream = new ObjectInputStream(finputstream); 
                Employee emp = (Employee)objectinputstream.readObject();
                System.out.println(emp);
                objectinputstream.close();
                finputstream.close();


            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }class Employee implements Serializable{
    private int empId;
    private String empName;
    private int empSallary;
    private transient String password;
    static private String Company = "Dy";
    public static String getcompany(){
         return Company;
    }
    public String getPass(){
        return password;
    }
    public void setPass(String password){
     this.password= password;
    }
    public int getEmpsallary(){
        return empSallary;
    }
    public void setEmpsallary(int empSallary){
        this.empSallary = empSallary;
    }
    public String getname(){
        return empName;
    }
    public void setName(String empName){
        this.empName = empName;
    }
    public int getEmpid(){
        return empId;
    }
    public void setEmpid(int empId){
        this.empId=empId;
    }
    public Employee(int empId,String empName, int empSallary,String password ){
        this.empId = empId;
        this.empName = empName;
        this.empSallary = empSallary;
        this.password = password;
    }
    @Override
    public String toString(){
        return empId+" "+empName+" "+empSallary+" "+password+" "+Company;
    }
}



