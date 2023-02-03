public class practiceQs6 {
    public static void main(String args[]){
    Vehicle v = new Car();
     //v.display();  will thorws an error as vehicle or base class points towards only
     // base class properties
     Vehicle v1 = new Vehicle();
     v1.print();
 }
}
class Vehicle{
    void print(){
        System.out.println("parent class vehicle called");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("base class called");
    }
}