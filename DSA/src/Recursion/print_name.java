package Recursion;

import java.util.Scanner;

public class print_name {
    static void func(int i , int n){

        if (i > n) return;
        System.out.println("Faizan");
        func(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        func(1,n);

    }
}
