package leetcode;

import java.util.Arrays;

/**
 * 1. TwoSum
 * nums배열을 받아서 2개를 더해서 target과 동일한 값을 만들 수 있는 배열의 위치를 Return
 * Brute Force로 작업하면 될꺼같은데..?
 *
 * Case1
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Case2
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Case3
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class quest1 {
    public static void main(String[] args) {
        int [] nums = {
                1,2,3,4,5,6,7,9,10,11,12,13
        };

        quest1 q1 = new quest1();
        int[] result = q1.twoSum(nums, 5);
        System.out.println(result[0] + "," + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] value = new int[2]; //위치 2개만 넣을 것이기 떄문에 상관없음

        int aryLength = nums.length;
        for(int i = 0; i < aryLength -1; i++ ){
            for(int j = 0; j < aryLength; j++) {
                if(i != j) {
                    if(target == (nums[i]+nums[j])) {
                        value[0] = i;
                        value[1] = j;
                        break;
                    }
                }
            }
        }
        Arrays.sort(value);
        return value;
    }

    //이게 최대다..
    public int[] moreResult(int[] nums, int target) {
        int aryLength = nums.length;
        for(int i = 0; i < aryLength -1; i++ ){
            for(int j = i+1; j < aryLength; j++) {
                if(target == (nums[i]+nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
