import java.util.*;
public class LeetcodePractice1 {

	static int[] nums= {2,3,5,7};
	
	public static void main(String[] args) {
		int[] value=twoSum(nums, 9);
		System.out.println(value[1]);
		System.out.println(value[0]);
		
		
	}
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
        }
       System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            Integer j = map.get(target - nums[i]);
            if (j != null && i != j) {
                return new int[]{i, j};
            }
        }
        return new int[]{};
}}
