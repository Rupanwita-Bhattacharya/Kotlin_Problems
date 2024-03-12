import org.junit.Assert

/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
*
* */

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        if(s.length!=t.length) return false

        val firstArr= IntArray(26)
        val secondArr= IntArray(26)

        for(c in s){
            firstArr[c-'a']= firstArr[c-'a']+1
        }

        for(c in t){
            secondArr[c-'a']= secondArr[c-'a']+1
        }

        for(i in firstArr.indices)
        {
            if(firstArr[i]!=secondArr[i]) return false
        }
        return true
    }
}

fun main() {

    val  s = "anagram"
    val t = "nagaram"

    Assert.assertEquals(true,ValidAnagram().isAnagram(s,t))
}