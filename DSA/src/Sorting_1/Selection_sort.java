package Sorting_1;

public class Selection_sort {
    public static void selectionSort(int arr[] , int n){
        for (int i = 0; i <= n-1; i++) {
            int mini = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.print("After Selection sort   : ");
        for (int i = 0; i <= n-1; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {13 , 46, 24, 52 , 20 , 9};
        int n = arr.length;
        System.out.println(" ");
        System.out.print("Before Selection sort  : ");
        for (int i = 0; i <= n-1; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
          selectionSort(arr, n);
    }
}
