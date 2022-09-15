package MyJavaTest.generic;

import org.testng.annotations.Test;

public class GenericTest1 {
    @Test
    public void test1(){
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        Order<String> order1 = new Order<String>("OrderAA",1001,"order:AA");

        order1.setOrderT("AA:hello");
    }
}
