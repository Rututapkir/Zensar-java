public class AreaShape {
    public static void main(String args[]){
   
Square s = new Square(shapeName);
   
}
class Shape{
    protected String shapeName;
    double calArea(){
        return 0.0;
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
}
