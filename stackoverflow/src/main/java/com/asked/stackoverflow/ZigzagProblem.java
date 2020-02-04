package com.asked.stackoverflow;

import java.util.ArrayList;
import java.util.List;

/**
 * you should obtain this detail pattern write up to down text.
 * <p>
 * H       A
 * U    T  P
 * S  U    A
 * N       N
 */

public class ZigzagProblem {


    public String convert(String text, int rowCount) {
        List<StringBuilder> allRowText = new ArrayList<>();

        for (int i = 0; i < rowCount; i++) {
            allRowText.add(new StringBuilder());
        }

        int counter = 0;
        boolean down = false;
        if (text.length()==1) return text;
        for (int i = 0; i < text.toCharArray().length; i++) {
            allRowText.get(counter).append(text.charAt(i));
            if (counter == 0 || counter == rowCount - 1) {
                down = !down;
            }
            if (down) counter++;
            else counter--;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder b : allRowText) {
            result.append(b.toString());
        }
        return result.toString();

    }


    public static void main(String[] args) {
        System.out.println(new ZigzagProblem().convert("HUSNUTAPAN", 4));
    }

}
