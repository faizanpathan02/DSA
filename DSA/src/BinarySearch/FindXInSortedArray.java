package BinarySearch;

public class FindXInSortedArray {

    public static int binarySearch(int arr[] , int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target>arr[mid]) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8,9};
        int target = 7;

        int ind = binarySearch(arr,target);
        if (ind == -1){
            System.out.println("Target Not Found");
        }else {
            System.out.println("Target Found at index " + ind);
        }
    }
}
