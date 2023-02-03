public class outer {
    
    public static void main (String args[]){
        Outer out = new Outer();
        out.display();
        //out.Show();
        


    }
    }
    
    class Outer {
        private int num;
        public Outer(){
            System.out.println("In Outer class constructor");
           int num = 10;
        }
        
        public void display(){
             System.out.println("Displaying in outer class");
        }
        class Inner {
            public Inner(){
                System.out.println("in inner class constructor");
            }
            public void Show(){
                display();
                System.out.println("num= "+ num);
            }
    
        }
    }
    

// to create object of inner class two things are need 
// one is we need outer class reference to resolved type
// 2. we need Outer class object reference 