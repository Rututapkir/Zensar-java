public class inheritance {
    public static void main(String args[]){
   Student s1 = new Student();
   s1.setname("Rutuja");
   System.out.println("name of Student is "+ s1.name);
   s1.address="Pimpri";
   System.out.println("addresss of student is "+s1.address);
   s1.display();
    }
    
    
}
 class Person{
    public String name;
    public void setname(String name){
        this.name = name;
    }
    public int age;
    protected String address;
    public void display(){
        System.out.println("works for people ");
    }
    
}
 class Student extends Person{
 public String Branch;
 public void display(){
    super.display();
    System.out.println("study ");
 }
    
}

