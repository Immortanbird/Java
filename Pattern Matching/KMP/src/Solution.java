/*
* An implementation of KMP algorithm.
*
* Really hard to understand.
* 1. The definition of prefix and postfix.
* 2. The meaning of next[].
* 3. The method of travers and traceback.
* */

import java.util.Arrays;

public class Solution {
    private static int[] preprocess(String pattern) {
        int[] next = new int[pattern.length()];

        for (int i=1, k=0; i<pattern.length(); i++) {
            while (k > 0 && pattern.charAt(k) != pattern.charAt(i))
                k = next[k];
            if (pattern.charAt(k) == pattern.charAt(i))
                k++;
            next[i] = k;
        }

        System.out.println("next[] = " + Arrays.toString(next));

        return next;
    }

    public static int KMP(String text, String pattern) {
        int[] next = preprocess(pattern);

        int j = 0;

        for (int i=0; i<text.length(); i++) {
            while (j > 0 && pattern.charAt(j) != text.charAt(i))
                j = next[j - 1];
            if (pattern.charAt(j) == text.charAt(i))
                j++;
            if (j == pattern.length())
                return i - pattern.length() + 1;
        }

        return -1;
    }
}
