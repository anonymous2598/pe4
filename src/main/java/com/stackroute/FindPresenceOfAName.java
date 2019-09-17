package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPresenceOfAName {
    public boolean findPresenceOfAName(String s)
    {
        if(s==null){
            return false;
        }
        Pattern p = Pattern.compile("\\bHenry\\b");
        Matcher m= p.matcher(s);
        if(m.find()){return true;}
        return false;
    }
}
