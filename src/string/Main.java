package string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.areAnagrams2("ABCD", "AABC"));

        var first = "XYZ";
        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        for (var i = 0; i < first.length(); i++)
            frequencies[first.charAt(i) - 'a']++;

        System.out.println(first.charAt(0));
    }
}
