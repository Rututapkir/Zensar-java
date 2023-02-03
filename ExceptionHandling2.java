public class ExceptionHandling2 {

   
    public static void main(String args[]){
       
      Addition add = new Addition();
      add.sum(10, 20);
      int sum = Addition.sum(10,30);
      System.out.println("sum of two num is "+ sum); 
      
      Person p = new Person();
      p.display();
      p.work();
}
}
class Addition{
    public static int sum(int a , int b){
        return a+b;
    }
}
class Person{
    

     public void display(){
        System.out.println("Displaying in person class");
    }
    @Deprecated

    public void work(){
        System.out.println("work for Family");

    }
}
class Employee extends Person{
      
    @Override

     public void display(){
        System.out.println("Displaying in Employee class ");
    }
}