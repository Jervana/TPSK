package com.example.lab31testprogramr;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberTest {

    @Test
    public void testQ () {
        Number n = new Number();
        int a =  n.q( 123 );
        int b = 1;
        assertEquals( a,b );
    }
    @Test
    public void testW(){
        Number n = new Number();
        int a =n.w( 123 );
        int b = 3;
        assertEquals( a,b );
    }
    @Test
    public void testE(){
        Number n = new Number();
        boolean a =n.e( 12 );
        boolean b = true;
        assertEquals( a,b );
    }
}