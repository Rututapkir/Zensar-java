public class dynamicDispatch {
    public static void main(String args[]){
        Person p1 = new Person();
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
         Person p2 = new Student1();
         p2.display();

         
         
        Person p3 = new Person();
        p3.display();
        
        
        System.out.println(s2.marks);
       
    }
     }
      class Person{
         int marks = 10;       
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
      class Student1 extends Person{

       int marks = 30;
      public String Branch;
      public void display(){
         
         System.out.println("study ");
      }
      
         
     }
     class Student2 extends Person{
        
         int marks = 20;
        
        public void display(){
         
            System.out.println("study in library ");
         }
    
     }
     
    

