public class multilevelinheritance {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setname("Rutuja"); 
        System.out.println("name of Student is "+ s1.name);
        s1.address="Pimpri";
        System.out.println("addresss of student is "+s1.address);
        s1.display();
         Student1 s2 = new Student1();
         s2.setname("Jaara");
         System.out.println(s2.name);
         
         
     }
      class Person{
        Person(){
            System.out.println("In non parameterized constructor");        }
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
        Student(){
            System.out.println("In student non parameterized constructoe");
        }
      public String Branch;
      public void display(){
         super.display();
         System.out.println("study ");
      }
         
     }
     class Student1 extends Student{
        Student1(){
            System.out.println("In studeent2 non parameterized constructor");
        }
        public int marks;
        public void setmarks(int marks){
            this.marks=marks;
        }
        public int getmarks(){
            return marks;
        }
     }
     
    
    }
