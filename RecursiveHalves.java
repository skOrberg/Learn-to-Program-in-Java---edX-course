/*
BJP4 Self-Check 12.3: mystery1
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/s3-mystery1



 */

import java.util.Scanner;

public class RecursiveHalves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The program will return sequence of numbers that are halves of the input integer.\nThe numbers in a sequence will start from 1 and will be separated with comma.\nThe value you will enter will be also included.\nPlease enter integer: ");
        int num = input.nextInt();
        recursiveHalves(num);
    }

    public static void recursiveHalves (int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            recursiveHalves(n / 2);
            System.out.print(", " + n);
        }
    }
}