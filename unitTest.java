import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
public class unitTest {
public class TestOperation{
    public static void main(String args[]){
@Test
public void testDivision(){
    //testing logic 
    Operation1 ob = new Operation1();
    assertEquals(2,ob.division(10,5));//failed 
}
@Test 
public void testAddition(){
    Operation1 obj = new Operation1();
    assertEquals(30,obj.addition(10,30));


}
}

}

class Operation1{
    public static void main(String args[]){
    int division(int num1 , int num2){
        return num1*num2;
    }
    public int addition(int a,int b){
        return a+b;
    }


    }
}
}