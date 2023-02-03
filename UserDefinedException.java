public class UserDefinedException {
    public static void main(String args[]){
    CartPayment obj = new CartPayment();
    obj.cartpayment(null);
    try {
        obj.divsion(3, 0);
        
    } catch (ArithmeticException e) {
       System.out.println("divide by zero cannot Possible");
    }
    
    }
}
class CartEmtptyException extends Exception{
    public CartEmtptyException(String message){
        super(message);
    }

}
class CartPayment{
    public void divsion(int num1 , int num2) throws ArithmeticException{
        int div = num1/num2;
        System.out.println("Division is :"+ div);
       
    }
    public void cartpayment(int cart[]){
       
        try{
        if(cart== null){
          throw new CartEmtptyException("Cart is Empty ");
        }
    } catch(CartEmtptyException e){
        System.out.println(e.getMessage());
    }catch(Exception e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("Its a Finally");
        }
        System.out.println("After a catch box");
}
}
