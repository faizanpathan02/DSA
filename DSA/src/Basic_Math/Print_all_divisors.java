package Basic_Math;

public class Print_all_divisors {
    public static void printDivisors(int n){
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        int n = 36;
        printDivisors(n);
    }
}
