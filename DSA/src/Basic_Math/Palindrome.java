package Basic_Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Palindrome :");
        int n = sc.nextInt();

        int dup = n;
        int revNum = 0;

        while (n > 0){
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if (revNum == dup){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
