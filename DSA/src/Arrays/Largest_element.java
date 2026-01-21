package Arrays;

public class Largest_element {
//    static int findLargestElement(int arr[]){
//        int max = arr[0];
//        for (int i = 0; i <= arr.length-1; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9,};
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i <= n-1; i++){
                    if (arr[i] > max){
                        max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("The maximum element in array is : " + max);

//        int arr1[] = {5,2,4,8,3};
//        System.out.println("The Largest element is : " + findLargestElement(arr1));
    }
}
