package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindMultipleOccurencesOfGivenWordTest {
    FindMultipleOccurencesOfGivenWord fm;
    @Before
    public void startup()
    {
        fm= new FindMultipleOccurencesOfGivenWord();
    }
    @After
    public void teardown()
    {
        fm=null;
    }
    @Test
    public void givenStringShouldReturnPositionsOfAString()
    {
        String s="Found at: 4-6 Found at: 10-12 Found at: 27-29 ";
        assertEquals(s,fm.findmultipleOccurencesOfGivenString("She sells seashells by the seashore","se"));
        String s2="Found at: 2-4 ";
        assertEquals(s2,fm.findmultipleOccurencesOfGivenString("I am inevitable","am"));
        assertNull(fm.findmultipleOccurencesOfGivenString("jaffa","x"));

    }
    @Test
    public void givenStringShouldReturnPositionsOfAStringFailure()
    {
        String s="Found at: 4-6 Found at: 10-12 Found at: 27-29 ";
        assertNotEquals(s,fm.findmultipleOccurencesOfGivenString("She sells eahells by the sashore","se"));


    }

}
