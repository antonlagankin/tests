package com.goodcodeschool.task1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SquareTest {
    
    
    private Square square;
    
    @Before
    public void init() {
        square = new Square();
    }
    
    @Test
    public void nominalTest() {
        double res = square.square(4);
        
        assertTrue(Double.valueOf(2.0).equals(res));
    }
    
    @Test
    public void negativeTest() {
        double res = square.square(4);
        
        assertTrue(Double.valueOf(2.0).equals(res));
    }
    
}
