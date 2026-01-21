package Basic_Math;

import java.util.Scanner;

public class count_digits {
    public static int countDigits(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("N: " + n);
        int digits = countDigits(n);
        System.out.println("Number of Digits in N: " + digits);
    }
}
