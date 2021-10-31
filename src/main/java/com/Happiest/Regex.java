package com.Happiest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern  p = Pattern.compile("abcde");
        Matcher m = p.matcher("defe");

        if(m.matches()){
            System.out.println("matched");
        }
        else
            System.out.println("not matched");

    }
}
