package com.stackroute;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TransposeString {
    public String transposeGivenString(String s)
    {
        if (s==null){return null;}
        String s1[] = s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            StringBuilder sb = new StringBuilder(s1[i]);
            s1[i]=sb.reverse().toString();
        }
        String s2 =Arrays.toString(s1);
        s2 = s2.substring(1, s2.length()-1).replace(",", "");

        return s2;
    }

}
