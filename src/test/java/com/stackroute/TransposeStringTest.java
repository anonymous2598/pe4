package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString ts;

    @Before
    public void setUp() throws Exception {
        ts = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        ts=null;
    }
    @Test
    public void givenStringShouldReturnTransposedString()
    {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",ts.transposeGivenString("a quick brown fox jumps over the lazy dog"));
        assertNull(ts.transposeGivenString(null));
    }
    @Test
    public void givenStringShouldReturnTransposedStringFailure()
    {
        assertNotEquals("god yzal eht revo spmuj xof nworb kciuq a",ts.transposeGivenString("a quick brown fox jumps over the lazy dog"));
    }
}
