package leetcode697;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Not that good of a problem, need to review this
		int[] nums = {1, 2, 2, 3, 1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindDegreeOfArray solution = new FindDegreeOfArray();
		
		System.out.println("Solution: " + solution.findShortestSubArray(nums));
	}
	
}
