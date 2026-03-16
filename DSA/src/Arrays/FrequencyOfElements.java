package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = {7,5,7,4,5};
        Map<Integer , Integer> map = new HashMap<>();
        int count = 1;
        for(int i : arr){
            if (!map.containsKey(i)){
                map.put(i,count);
            }else {
                map.put(i, map.get(i)+1);
            }
        }
        Set<Integer> keys =  map.keySet();
        for (Integer i: keys){
            System.out.println(i + " : " + map.get(i));
        }
    }
}
