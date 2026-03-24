package Arrays;

public class MaxConsecutiveOnes {


    public int solution(int[] nums){
        int max = 0;
        int cnt = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i] == 1){
                cnt++;
                max = Math.max(max, cnt);
            }else {
                cnt = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1,0,1,1};

        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int ans = maxConsecutiveOnes.solution(nums);
        System.out.println("Maximum consecutive ones are : " + ans);

    }
}
