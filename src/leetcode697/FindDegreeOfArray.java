package leetcode697;

import java.util.HashMap;
import java.util.Map;

public class FindDegreeOfArray {
	// Not that good problem
    public static int findShortestSubArray(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        Map<Integer, int[]> map = new HashMap();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                // first element in array is degree
                // second is the first index of this key
                // third is the last index of this key
                map.put(nums[i], new int[]{1,i,i});
            }else{
                int[] temp = map.get(nums[i]);
                temp[0] = temp[0] + 1;
                temp[2] = i;
            }
        }
        
        int degree = Integer.MIN_VALUE;

        int res = Integer.MAX_VALUE;
        
        for(int[] value : map.values()){
            if(value[0] > degree){
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree){
                res = Math.min(value[2] - value[1] + 1, res);
            }
        }
        return res;
    }
}
