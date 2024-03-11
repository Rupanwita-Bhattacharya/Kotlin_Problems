import junit.framework.Assert
/*
* You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.
*
* Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
* */
class CountElementsWithMaximumFrequency {

    fun maxFrequencyElements(nums: IntArray): Int {

        val hashMap= hashMapOf<Int,Int>()

        nums.forEach{

            if(hashMap.containsKey(it))
                hashMap[it]=hashMap.getOrDefault(it,0) +1
            else
                hashMap[it]= 1

        }

        var highest=0

        hashMap.values.toList().forEach{
            highest= Math.max(highest,it)
        }

        var sum=0
        hashMap.values.toList().forEach{
            if(it==highest)
                sum+=it
        }

        return sum
    }
}

fun main() {
   val nums = intArrayOf(1,2,2,3,1,4)

    Assert.assertEquals(CountElementsWithMaximumFrequency().maxFrequencyElements(nums),4)
}