package cn.itcast.day07.demo03Random;

public class Solution {


    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] twoSum = twoSum(nums, target);
        System.out.println("[" + twoSum[0] + "," + twoSum[1] + "]");


    }

    public static int[] twoSum(int[] nums, int target) {


        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    result[0] = i;
                    result[1] = j;

                }
            }
        }

        return result;
    }

}
