package com.stackroute;

import java.util.Arrays;
import java.util.List;

public class ExtractWordsFromParaAndSort {
    public List<String> extractWordsFromPara(String s)
    {
        if(s==null){return null;}
        String str[]= s.split(" ");
        Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
       List<String> list = Arrays.asList(str);
       return list;
    }
}
