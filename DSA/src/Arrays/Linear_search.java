package Arrays;


public class Linear_search {

    public static int linearSearch(int arr[] , int num){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int num = 52;
        System.out.println(linearSearch(arr,num));
    }
}
