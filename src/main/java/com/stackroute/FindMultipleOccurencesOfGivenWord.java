package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOccurencesOfGivenWord {
    public String findmultipleOccurencesOfGivenString(String s,String find)
    {
        if(s==null){
            return null;
        }
        int count=0;
        List<int[]> list = new ArrayList<int[]>();
        Pattern p = Pattern.compile(""+find+"");
        Matcher m= p.matcher(s);
        StringBuilder finals= new StringBuilder();
        int flag=0;
        while(m.find())
        {
            flag=1;
            finals.append("Found at: "+m.start()+"-"+m.end()+" ");
//            list.add(new int[]{m.start(),m.end()});
        }
        if (flag==0){
            return null;
        }

        return finals.toString();
    }
}
