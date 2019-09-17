package com.stackroute;

public class CountOccurencesOfGivenCharacter {
    public int countOccurenesOfGivenCharacterWthoutLoop(String s,char a)
    {
        String str = s;
        str=s.replaceAll(String.valueOf(a),"");
        return s.length()-str.length();
    }
}
