package leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

        示例:

        给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]*/
public class Solution01 {

    public static int[] twoSum(int[] nums, int target) {

        int [] index = new int[2] ;
        for(int i = 0 ; i<= nums.length -1 ; i++)
        {

            int temp = target -nums[i];

            for (int j =i+1 ; j <= nums.length -1 ; j++)
            {

                if (temp == nums[j])
                {
                    index[0] = i ;
                    index[1] = j ;
                    return index ;
                }
            }

        }
        return index;
    }

    public static int[] twoSumHash(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++)
        {
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                return new int []{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int [] nums = {3,2,4};
       System.out.print(JSON.toJSON(twoSum(nums,6)));
        System.out.print(JSON.toJSON(twoSumHash(nums,6)));
    }
}
