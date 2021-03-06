package com.github.lucifer.leetcode.easy;

/**
 * Given two strings <strong>s</strong> and <strong>t</strong> which consist of only lowercase letters.
 * <p>String <strong>t</strong> is generated by random shuffling string <strong>s</strong> and then add one more letter at a random position.
 * <p>Find the letter that was added in <strong>t</strong>.
 * <p><strong>Example:</strong>
 * <pre>
 * Input:
 * s = "abcd"
 * t = "abcde"

 * Output:
 * e

 * Explanation:
 * 'e' is the letter that was added.
 * </pre>
 * 
 * @author Lucifer
 */
public class FindTheDifferenceSolution {

    public static void main(String[] args) {
        FindTheDifferenceSolution solution = new FindTheDifferenceSolution();
        System.out.println(solution.findTheDifference("abcd", "abcde"));
        System.out.println(solution.findTheDifference("", "a"));
        System.out.println(solution.findTheDifference("abcd", "afbcd"));
    }

    public char findTheDifference(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("s or t should not be null");
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int diff = 0;
        for (char c : sArray) {
            diff = diff ^ c;
        }
        for (char c : tArray) {
            diff = diff ^ c;
        }
        return (char) diff;
    }
}
