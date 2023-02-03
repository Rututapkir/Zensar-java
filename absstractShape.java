/*Write a program to calculate the area of the given shape using a menu driven application.
Create a base class called?Shape. Data members: protected String shapeName;Methods:
calculateArea() -?Return type of this method is Double.?This method should return the value O. ? Constructor:
Create a single argument constructor that initializes the shapeName. Create a class called?Square?that extends Shape Data members:
side of type Integer.Methods: calculateArea()- calculates and returns the area of the square. The return
type of this method is Double. Constructor:Create a constructor that initializes the side. (1-argument constructor).
Call the super class constructor to initialize the shapeName as &quot;Square&quot;.Create a class called? Rectangle? that
extends Shape Data members: length of type Integer. breadth of type Integer.Methods: calculateArea() - calculates and
The returns the area of the Rectangle. type of this method is Double.Constructor:Create a constructor that initializes the length and breadth. (2-argument
constructor). Call the super class constructorto initialize the shapeName as &quot;Rectangle&quot;. */



import java.util.*;
public class absstractShape {
    
    
        static void menu(){
        System.out.println("Get area of : \n 1)Square\t2)Rectangle\t3)Circle\nEnter Your Choice : ");
        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();
            String shapeName;
            double ans;
            switch (choice) {
                case 1:
                    shapeName = "Square";
                    System.out.println("Enter length of a side : ");
                    int side = sc.nextInt();
                    Square sq = new Square(shapeName);
                    ans = sq.calArea(side);
                    System.out.println("Area : " + ans);
                    break;
            
                case 2:
                    shapeName = "Rectangle";
                    System.out.println("Enter length : ");
                    int length = sc.nextInt();
                    System.out.println("Enter breadth : ");
                    int breadth = sc.nextInt();
                    Rectangle rect = new Rectangle(shapeName);
                    ans = rect.calArea(length,breadth);
                    System.out.println("Area : " + ans);
                    break;
            
                case 3:
                    shapeName = "Circle";
                    System.out.println("Enter radius : ");
                    int radius = sc.nextInt();
                    Circle circle = new Circle(shapeName);
                    ans = circle.calArea(radius);
                    System.out.println("Area : " + ans);
                    break;
            
                default:
                System.out.println("Unavailable Choice");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
    }
class Shape{
    protected String shapeName;
    double calArea(){
        return 0;
    }
    Shape(String shapeName){
        this.shapeName = shapeName;
    }
    

}
class Square extends Shape{
    int side;
   
    double calArea(int side) {
       
       return side*side;
    }
    Square(String shapeName){
     super(shapeName);
    }
}

    class Rectangle extends Shape{
        int length;
         int breadth;
        
        double calArea(int length , int breadth) {
            
            return length*breadth;
        }
        Rectangle(String shapeName){
            super(shapeName);
        }
    }
    
class Circle extends Shape{
    int radius;

    double calArea(int radius) {
         
        return 3.14*(radius*radius);
    }
    Circle(String shapeName){
        super(shapeName);


}
}
