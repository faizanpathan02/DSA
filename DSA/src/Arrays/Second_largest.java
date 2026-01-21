package Arrays;

import java.util.Arrays;

public class Second_largest {

//    ------------------------------------------- BRUTE FORCE ------------------------------------------------
//    static private void getElements(int arr[], int n){
//        if (n == 0 || n == 1){
//            System.out.println("Second largest element is -1");
//            System.out.println("Second smallest element is -1");
//            System.out.println(" ");
//        }
//        Arrays.sort(arr);
//        int large = arr[n - 2];
//        int small = arr[1];
//        System.out.println("Second largest element is : " + large);
//        System.out.println("Second smallest element is : " + small);
//    }

//  ------------------------------------------- BETTER APPROACH ------------------------------------------------

//    static private void getElements(int arr[] , int n){
//        if (n < 2){
//            System.out.println("Second largest element is -1");
//            System.out.println("Second smallest element is -1");
//        }
//        int small = Integer.MAX_VALUE;
//        int second_small = Integer.MAX_VALUE;
//        int large = Integer.MIN_VALUE;
//        int second_large = Integer.MIN_VALUE;
//        int i;
//        for (i = 0; i <= n-1; i++){
//            small = Math.min(small,arr[i]);
//            large = Math.max(large,arr[i]);
//        }
//        for (i = 0; i <= n-1; i++)
//            if (arr[i] > second_large && arr[i] != large){
//                second_large = arr[i];
//            }
//            if (arr[i] < second_small && arr[i] != small){
//                second_small = arr[i];
//            }
//        }
//        System.out.println(" ");
//        System.out.println("The second largest element is : " + second_large);
//        System.out.println("The second smallest element is : " + second_small);
//    }

//----------------------------------------------   OPTIMAL APPROACH   --------------------------------------------------

    static private int secondSmallest(int arr[] , int n){
        if (n < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            if (arr[i] < small){
                secondsmall = small;
                small = arr[i];
            } else if (arr[i] < secondsmall && arr[i] != small) {
                secondsmall = arr[i];
            }
        }
        return secondsmall;
    }
    static private int secondLargest(int arr[] , int n){
        if (n < 3){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] > large){
                secondlarge = large;
                large = arr[i];
            } else if (arr[i] > secondlarge && arr[i] != large) {
                secondlarge = arr[i];
            }
        }
        return secondlarge;
    }


    public static void main(String[] args) {
        int arr[] = {5,7,54,0,6};
        int n = arr.length;
        System.out.println("Second smallest no is : " + secondSmallest(arr,n));
        System.out.println("Second largest no is : " + secondLargest(arr,n));

    }
}
