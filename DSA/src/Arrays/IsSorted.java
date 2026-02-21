package Arrays;

public class IsSorted {

 //   -----------------------------------------------  BRUTE FORCE   -------------------------------------------------
//    static boolean isSorted(int arr[] , int n){
//        for (int i = 0; i <= n-1; i++){
//            for (int j = i+1; j <= n-1; j++){
//                if (arr[j] < arr[i])
//                    return false;
//            }
//        }
//        return true;
//    }

//   -------------------------------------------   OPTIMAL APPROACH   -------------------------------------------------

    static boolean isSorted(int arr[] , int n){
        for (int i = 0; i < n-1; i++){

            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

//    public static void sortArray(int arr[] , int n){
//        for (int i=0; i<n-1; i++){
//            if (arr[i] >= arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        for (int i=0; i<n; i++){
//            System.out.println(arr[i] + " ");
//        }
//
//
//    }


    public static void main(String[] args) {
        int arr[] = {4,2,3,4,6,7};
        int n = arr.length;
//        sortArray(arr,n);
        System.out.println(isSorted(arr,n));
    }
}
