public class Constructor1 {
    public Constructor1(){
        System.out.println("In consstructor");
    }
    public void display(){
        System.out.println("It is displaying method");

    }
    public class Testconst{
        public static void main(String args[]){
            System.out.println("in main starting executing ");
             Constructor1 constructor = new Constructor1();
             constructor.display();
        }
    }
    
} 
