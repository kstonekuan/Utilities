package org.utils;

import org.utils.exceptions.InvalidStringInputException;
import org.utils.stringutils.StringParser;

import java.util.Arrays;
import java.util.List;

public class MyUtils {

    public static void main(String[] args) {
        StringParser sp = new StringParser();

        String str = "Hello|World|How are|you all";

        List<String> stringParts = null;
        try {
            stringParts = sp.splitString(str, "\\|");
        } catch (InvalidStringInputException e) {
            System.out.println("Invalid input given, please check your input.");
        }

        for (String part : stringParts) {
            System.out.println(part);
        }
    }

}
