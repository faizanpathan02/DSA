package Arrays;

public class Move_zeroes {

    public static int[] moveZeroes(int arr[] , int n ){
        int j = -1;
        for (int i = 0; i<n; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return arr;

        for (int i = j+1; i<n; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            }
        System.out.print("Array after moving zeroes  : ");
        for (int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,3,0,4,5,0,};
        int n = 9;
        System.out.println(" ");
        System.out.print("Array before moving zeroes : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveZeroes(arr , n);
    }
}
