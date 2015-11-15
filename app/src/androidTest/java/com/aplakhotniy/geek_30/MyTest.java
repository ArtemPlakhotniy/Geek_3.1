package com.aplakhotniy.geek_30;

import com.aplakhotniy.geek_30.hw_2.HW_2;

import junit.framework.TestCase;

/**
 * Created by Кицюня on 11.11.2015.
 */
public class MyTest extends TestCase {

    public void testFactorial() throws Exception{
        assertEquals(0 , HW_2.factorial(0));
        assertEquals(1 ,HW_2.factorial(1));
        assertEquals(2 ,HW_2.factorial(2));
        assertEquals(120 ,HW_2.factorial(5));
        assertEquals(720 ,HW_2.factorial(6));
        assertEquals(479001600 ,HW_2.factorial(12));
    }

    public void testFibonachi() throws Exception{
        assertEquals(0, HW_2.fibonachi(0));
        assertEquals(1, HW_2.fibonachi(1));
        assertEquals(2, HW_2.fibonachi(2));
        assertEquals(3, HW_2.fibonachi(3));
        assertEquals(5, HW_2.fibonachi(4));
        assertEquals(8, HW_2.fibonachi(5));
        assertEquals(34, HW_2.fibonachi(8));
        assertEquals(89, HW_2.fibonachi(10));

    }
}

