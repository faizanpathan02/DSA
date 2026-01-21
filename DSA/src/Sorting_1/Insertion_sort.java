package Sorting_1;

public class Insertion_sort {
    public static void insertionSort(int arr[], int n){
        for (int i = 0; i <= n-1; i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.print("After Insertion sort  : ");
        for (int i = 0; i <= n-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.print("Before Inserion sort  : ");
        for (int i = 0; i <= n-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSort(arr,n);
    }
}
