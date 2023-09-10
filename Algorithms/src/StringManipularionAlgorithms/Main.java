package StringManipularionAlgorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    }

    public static int countVowels(String sentence) {
        if (sentence == null)
            return 0;

        String vowels = "aeiou";
        int countOfVowels = 0;
        for (var ch : sentence.toLowerCase().toCharArray())
            if (vowels.indexOf(ch) != -1)
                countOfVowels++;

        return countOfVowels;
    }

    public static String reverse(String sentence) {
        if (sentence == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (int i = sentence.length() - 1; i >= 0; i--)
            reversed.append(sentence.charAt(i));

        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static String removeDuplicates(String word) {
        if (word == null)
            return "";

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (var ch : word.toCharArray()) {
            if (!seen.contains(ch))
                result.append(ch);

            seen.add(ch);
        }

        return result.toString();
    }

    public static char mostRepeatedCharacter(String str) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        final int ASCII_SIZE = 256;
        int[] frequency = new int[ASCII_SIZE];
        for (var ch : str.toCharArray())
            frequency[ch]++;

        var count = Integer.MIN_VALUE;
        var mostRepeatedCharacter = ' ';
        for (int i = 0; i < frequency.length; i++)
            if (frequency[i] > count) {
                count = frequency[i];
                mostRepeatedCharacter = (char) i;
            }

        return mostRepeatedCharacter;
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        String[] words = str
            .trim()
            .replaceAll(" +", " ")
            .split(" ");
        for (var i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()
                + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null ||
            first.length() != second.length())
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = first.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static boolean areAnagram(String first, String second) {
        if (first == null || second == null)
            return false;

        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        for (int i = 0; i < first.length(); i++)
            frequencies[first.charAt(i) - 'a']++;

        second = second.toLowerCase();
        for (int i = 0; i < second.length(); i++) {
            var index = second.charAt(i) - 'a';
            if (frequencies[index] == 0)
                return false;

            frequencies[index]--;
        }

        return true;
    }

    public static boolean areRotations(String str1, String str2) {
        return (str1.length() == str2.length()) && (str1 = str1).contains(str2);
    }

}
