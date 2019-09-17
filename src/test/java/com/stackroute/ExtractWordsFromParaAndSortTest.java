package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExtractWordsFromParaAndSortTest {
    ExtractWordsFromParaAndSort extractWordsFromParaAndSort;
    @Before
    public void setUp() throws Exception {
        extractWordsFromParaAndSort = new ExtractWordsFromParaAndSort();
    }

    @After
    public void tearDown() throws Exception {
        extractWordsFromParaAndSort=null;
    }
    @Test
    public void givenStringShouldReturnSortedListOfWords()
    {
        List<String> list= new ArrayList<String>();
        list.add("apple");
        list.add("Ball");
        list.add("cat");
        list.add("dog");
        list.add("Eagle");
        assertEquals("List elements are not sorted",list,extractWordsFromParaAndSort.extractWordsFromPara("Eagle cat Ball dog apple"));
        assertNull("Should Return Null",extractWordsFromParaAndSort.extractWordsFromPara(null));
    }
    @Test
    public void givenStringShouldReturnSortedListOfWordsFailure()
    {
        assertNotNull("Shouldn't Return Null",extractWordsFromParaAndSort.extractWordsFromPara("b a c"));
    }
}
