public class dynamicDispatch {
    public static void main(String args[]){
        Vehicle v = new Car();
        v.print(); // method overriding 

        Vehicle v1 = new Vehicle();
        v1.print();

    }
}
class Vehicle{
    void print(){
        System.out.println("Base class vehicle");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class Car");
    }
}