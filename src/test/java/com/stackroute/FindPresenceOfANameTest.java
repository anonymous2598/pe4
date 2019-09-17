package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FindPresenceOfANameTest {
    private  FindPresenceOfAName fpn;

    @Before
    public void setup()
    {
        fpn = new FindPresenceOfAName();
    }
    @After
    public void teardown()
    {
        fpn=null;
    }
    @Test
    public void givenStringShouldReturnTrueIfContainsNameHenry()
    {
        assertEquals(true,fpn.findPresenceOfAName("I am Henry"));
        assertEquals(false,fpn.findPresenceOfAName("I am Chitti"));
    }
    @Test
    public void givenStringShouldReturnTrueIfContainsNameHenryFailure()
    {
        assertNotEquals(false,fpn.findPresenceOfAName("The winner Henry is dead"));

    }
}
