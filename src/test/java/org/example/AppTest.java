package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
    public void addは3と4で7を返す(){
        Calculator sut = new Calculator();
        assertThat(sut.add(3,4),is(7));
    }

    @Test
    public void addは5と1で6を返す(){
        Calculator sut = new Calculator();
        assertThat(sut.add(5,1),is(6));
    }
}
