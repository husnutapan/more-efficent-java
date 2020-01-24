package com.asked.stackoverflow;

import java.util.Collections;
import java.util.stream.Collectors;

//https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string-in-java
public class StringRepeatUsage {

    //Note:this function introduced on Java 11 version,You cant found under version.
    public static void main(String[] args) {
        String variable = "test";
        //with fulfill repeat function
        String repeatedTest = variable.repeat(10);
        //with collection helper nCopies function
        String nCopiesTest = Collections.nCopies(10, variable).stream().collect(Collectors.joining());
        System.out.println(repeatedTest);
        System.out.println(nCopiesTest);

        //brute force(recursively)
        System.out.println(repeatTest(10,"test"));
    }

    private static String repeatTest(int copySize, String text) {
        if (copySize <= 0) {
            return "";
        } else {
            copySize--;
            return text + repeatTest(copySize, text);
        }
    }
}
