import org.junit.Assert

/*
* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*
* */

class RotateArray {

    fun rotate(nums: IntArray, k: Int): Unit {
        val array= IntArray(nums.size)

        for(i in nums.indices){
            var newIndex= i+k
            while(newIndex>nums.size-1)
                newIndex -= nums.size
            array[newIndex]=nums[i]
        }

        for(i in array.indices)
            nums[i]=array[i]

    }
}
