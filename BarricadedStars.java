/*
 BJP4 Self-Check 12.5: mystery3
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/s5-mystery3
 */

import java.util.Scanner;

public class BarricadedStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The program will return a * that will be barricaded as many times as provided integer will tell.\nPlease enter integer: ");
        int num = input.nextInt();
        barricadedStars(num);
    }

    public static void barricadedStars (int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            barricadedStars(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            barricadedStars(n - 1);
            System.out.print("]");
        }
    }
}