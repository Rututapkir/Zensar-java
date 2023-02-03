public class inheritances1 {


    public class inheritances {
        public static void main(String args[]){
             Fish shark = new Fish();
    
            shark.eat();
            shark.color="blue";
           System.out.println(shark.color);
          
        }
        
    }
    class Animal{
        String color;
        
        void eat(){
    System.out.println("Animal Eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
    }
    
    class Fish extends Animal{
        int fins;
        
        void swim(){
            System.out.println("swims");
        }
    }
    
    
}
