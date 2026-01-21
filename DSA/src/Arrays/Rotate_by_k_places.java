package Arrays;

public class Rotate_by_k_places {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 3;

        // Rotatetoright(arr , n , k);

        Rotatetoright(arr , n , k);
        System.out.print("Array after rotation : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.print(" ");

    }
    public static void Reverse(int arr[] , int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotatetoleft(arr , n , k);

//    public static void Rotatetoleft(int arr[] , int n , int k){
//        Reverse(arr , 0 , k-1);
//        Reverse(arr , k , n-1);
//        Reverse(arr, 0 , n-1);
//    }
    public static void Rotatetoright(int arr[] , int n , int k){
        Reverse(arr , n-k , n-1);
        Reverse(arr , 0 , n-k-1);
        Reverse(arr , 0 , n-1);
    }
}
