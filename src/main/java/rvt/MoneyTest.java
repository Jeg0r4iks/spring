package rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
    
    @Test
    public void testPlusMethod() {
        Money mon1 = new Money(5, 10); 
        Money mon2 = new Money(5, 10);

        Money result1 = mon1.plus(mon2); 

        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());

    }
} 