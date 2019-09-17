package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDLTest {
    ReplaceAllDL replaceAllDL;
    @Before
    public void setUp() throws Exception {
        replaceAllDL = new ReplaceAllDL();
    }

    @After
    public void tearDown() throws Exception {
        replaceAllDL=null;
    }
    @Test
    public void givenStringShouldReturnStringAfterReplacingAllDLWithFT()
    {
        assertEquals("Output Strings do not match","faity fry",replaceAllDL.replaceAllDL("daily dry"));
        assertEquals("Output Strings do not match","my fog",replaceAllDL.replaceAllDL("my dog"));

    }
    @Test
    public void givenStringShouldReturnStringAfterReplacingAllDLWithFTFailure()
    {
        assertNotEquals("Output Strings do not match","daity fry",replaceAllDL.replaceAllDL("daily dry"));
    }
}
