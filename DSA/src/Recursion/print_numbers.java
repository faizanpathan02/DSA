package Recursion;

public class print_numbers {
    static void func(int i , int n){

        if (i > n) return;
        System.out.println(i);
        func(i+1,n);
    }

    static void func1(int j , int n){

        if (j<1) return;
        System.out.println(j);
        func1(j-1,n);
    }

    public static void main(String[] args) {
        int n = 5;
       // func1(n,n);
        func(1,n);

    }
}
