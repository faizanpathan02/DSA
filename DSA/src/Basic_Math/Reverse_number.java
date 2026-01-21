package Basic_Math;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed :");
        int n = sc.nextInt();
        int revNum = 0;
        while (n > 0){
            int ld = n % 10 ;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        System.out.println("The reversed number is :" + revNum);
    }
}
