package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CountOccurencesOfGivenCharacterTest {
    CountOccurencesOfGivenCharacter countOccurencesOfGivenCharacter;
    @Before
    public void setUp() throws Exception {
        countOccurencesOfGivenCharacter  = new CountOccurencesOfGivenCharacter();
    }

    @After
    public void tearDown() throws Exception {
        countOccurencesOfGivenCharacter = null;

    }
    @Test
    public void givenStringShouldReturnTheOccurencesOfACharacterWithoutLoop()
    {
      assertEquals("Output mismatch!",10,countOccurencesOfGivenCharacter.countOccurenesOfGivenCharacterWthoutLoop("Java is java again java again",'a'));
      assertEquals("Output mismatch",0,countOccurencesOfGivenCharacter.countOccurenesOfGivenCharacterWthoutLoop("the quick brown fox",'a'));
    }
    @Test
    public void givenStringShouldReturnTheOccurencesOfACharacterWithoutLoopFailure()
    {
        assertNotEquals("Output mismatch!",10,countOccurencesOfGivenCharacter.countOccurenesOfGivenCharacterWthoutLoop("the quick brown fox jumped over the lazy dog", 'z'));
    }
}
