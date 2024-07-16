// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int[] result = new int[2];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int nums[] ={2,7,11,15};
        int target =9;

        TwoSum twoSumInstance = new TwoSum();
    int[] result = twoSumInstance.twoSum(nums, target);

    // Print the result
    System.out.println("Indices of the two numbers that add up to target:");
    System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);

        
    }
}
