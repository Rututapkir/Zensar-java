public class practiceQs7 {
    public static  void main(String args[]){
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(344);
        System.out.println(Book.count);

    }
}
class Book{
    int price;
    static int count; // static variable can access directly from class also 
    
    public Book(int price){
        this.price = price;
        count ++;
    }
}
