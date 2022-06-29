package com.mispruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testSuma()
    {
        // arrange
        App app = new App();
        // act
        int suma = app.Suma(3,4);
        int expected = 7;
        // assert
        assertEquals(expected, suma );
    }

    @Test
    public void testSumaDouble()
    {
        // arrange
        App app = new App();
        // act
        double suma = app.Suma(3.5,4.5);
        double expected = 8.0;
        // assert
        assertEquals(expected, suma , 0);
    }

    @Test
    public void testSumaDoubleFailed()
    {
        // arrange
        App app = new App();
        // act
        double suma = app.Suma(5.6,5.8);
        double expected = 11.4; //11.39999999
        // assert
        assertEquals(expected, suma , 0.01);
    }
}
