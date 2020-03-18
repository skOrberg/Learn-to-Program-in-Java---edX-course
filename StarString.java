/*
BJP4 Exercise 12.1: starString
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e1-starString

Write a method starString that accepts an integer parameter n and returns a string of stars (asterisks) 2^n long (i.e., 2 to the nth power).

For example:

Call	        Output	            Reason
starString(0);	"*"	                20 = 1
starString(1);	"**"	            21 = 2
starString(2);	"****"	            22 = 4
starString(3);	"********"	        23 = 8
starString(4);	"****************"	24 = 16

You should throw an IllegalArgumentException if passed a value less than 0.
 */

import java.util.Scanner;

public class StarString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(starString(num));
    }

    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return "*";
        }
        return starString(n-1) + starString(n-1);
        }
}