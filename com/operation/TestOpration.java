package com.operation;
import JunitTest.operation;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOpration<JunitTest> {
    @Test
public void testDivision(){
    //testing logic 
    JunitTest ob = new JunitTest ();
    assertEquals(2,ob.division(10,5));//failed 
}
@Test 
public void testAddition(){
    JunitTest obj = new JunitTest();
    assertEquals(30,obj.addition(10,30));


}
    
}
