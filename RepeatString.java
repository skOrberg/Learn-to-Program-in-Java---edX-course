/*
BJP4 Exercise 12.11: repeat
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e11-repeat

Write a recursive method repeat that accepts a string s and an integer n as parameters and that returns a String
consisting of n copies of s.

For example:

Call	                    Value Returned
repeat("hello", 3)	        "hellohellohello"
repeat("this is fun", 1)	"this is fun"
repeat("wow", 0)	        ""
repeat("hi ho! ", 5)	    "hi ho! hi ho! hi ho! hi ho! hi ho! "

You should solve this problem by concatenating String objects using the + operator. String concatenation is an expensive
operation, so it is best to minimize the number of concatenation operations you perform. For example, for the call
repeat("foo", 500), it would be inefficient to perform 500 different concatenation operations to obtain the result.
Most of the credit will be awarded on the correctness of your solution independent of efficiency. The remaining credit
will be awarded based on your ability to minimize the number of concatenation operations performed.

Your method should throw an IllegalArgumentException if passed any negative value for n. You are not allowed to
construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to
solve this problem; you must use recursion.
 */

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();
        System.out.print("How many times should it be repeated?: ");
        int num = input.nextInt();
        System.out.println(repeat(text, num));
    }

    public static String repeat(String text, int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        if (num == 0) {
            return "";
        }
        return repeat(text, num-1) + text;
    }
}