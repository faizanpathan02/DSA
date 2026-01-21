package Recursion;

import java.util.Scanner;

public class sum_of_first_n_numbers {
    static void func(int i , int sum){
        if (i<1){
            System.out.println("The sum of numbers is " + sum);
            return;
        }
        func(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        func(n,0);

    }
}
