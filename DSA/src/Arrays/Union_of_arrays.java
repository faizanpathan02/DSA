package Arrays;

import java.util.ArrayList;

public class Union_of_arrays {

    public static ArrayList<Integer> findUnion(int arr1[] , int arr2[]){
        int i = 0 , j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }else {
                if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length){
            if (union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j < arr2.length){
            if (union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;

        }
        return union;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,5,6};
        ArrayList<Integer> union = findUnion(arr1,arr2);
        System.out.println();
        System.out.print("Union of arr1 and arr2 is : ");
        for (int val : union){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
