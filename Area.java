import java.util.*;
public class Area {static void menu(){
    System.out.println("Get area of : \n 1)Square\t2)Rectangle\t3)Circle\nEnter Your Choice : ");
    try (Scanner sc = new Scanner(System.in)) {
        int choice = sc.nextInt();
        String shape_name;
        double ans;
        switch (choice) {
            case 1:
                shape_name = "Square";
                System.out.println("Enter length of a side : ");
                int side = sc.nextInt();
                Square sq = new Square(shape_name);
                ans = sq.calculateArea(side);
                System.out.println("Area : " + ans);
                break;
        
            case 2:
                shape_name = "Rectangle";
                System.out.println("Enter length : ");
                int length = sc.nextInt();
                System.out.println("Enter breadth : ");
                int breadth = sc.nextInt();
                Rectangle rect = new Rectangle(shape_name);
                ans = rect.calculateArea(length,breadth);
                System.out.println("Area : " + ans);
                break;
        
            case 3:
                shape_name = "Circle";
                System.out.println("Enter radius : ");
                int radius = sc.nextInt();
                Circle circle = new Circle(shape_name);
                ans = circle.calculateArea(radius);
                System.out.println("Area : " + ans);
                break;
        
            default:
                break;
        }
    }
}

public static void main(String[] args) {
    menu();
}
}
class Shape {

    final float PI = 3.14f;

    protected String shapeName;

    double calculateArea(){
         return 0.0;
         }

    Shape(String shapeName){
        this.shapeName = shapeName;
    }

}

class Square extends Shape{
    
    int side;
    
    Square(String shapeName) {
        super(shapeName);
        //TODO Auto-generated constructor stub
    }

    double calculateArea(int side){
        double area = side * side;
        return area;
    }

}

class Rectangle extends Shape{

    int length , breadth;

    Rectangle(String shapeName) {
        super(shapeName);
        //TODO Auto-generated constructor stub
    }

    double calculateArea(int length, int breadth){
        double area = length * breadth;
        return area;
    }

}

class Circle extends Shape{

    int radius;

    Circle(String shapeName) {
        super(shapeName);
        //TODO Auto-generated constructor stub
    }

    double calculateArea(int radius){
        double area = PI * ( radius * radius );
        return area;
    }
}

