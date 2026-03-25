package Arrays;

public class ElementThatOccursOnce {

//    public int solution(int[] nums){
//
//        for(int i=0; i<nums.length; i++){
//            int num = nums[i];
//            int cnt = 0;
//
//            for (int j=0; j<nums.length; j++){
//                if (nums[j] == num){
//                    cnt++;
//                }
//            }
//            if (cnt == 1) return num;
//        }
//
//        return -1;
//    }


    public int solution(int[] nums){
        int xorr = 0;
        for (int num : nums){
            xorr ^= num;
        }
        return xorr;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,5};

        ElementThatOccursOnce elementThatOccursOnce = new ElementThatOccursOnce();
        int ans = elementThatOccursOnce.solution(nums);
        System.out.println("Number that occurs once is : " + ans);
    }
}
