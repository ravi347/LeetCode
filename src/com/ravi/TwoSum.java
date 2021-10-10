package com.ravi;
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
public static void main(String[] args) {
	//input
		int[] arr = new int[]{2,7,11,15};
		int[] sol = new int[2];
		sol = twoSum(arr, 9);
		System.out.print(sol[0]+" "+sol[1]);
	}
}