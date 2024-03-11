import junit.framework.Assert
/*
* You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.

Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.

Return any permutation of s that satisfies this property.
*
* Example 1:

Input:  order = "cba", s = "abcd"

Output:  "cbad"

Explanation: "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".

Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
* */
class CustomSortString {

    fun customSortString(order: String, s: String): String {

        val map= hashMapOf<Char,Int>()

        for(i in 0..s.length-1)
        {
            if(map.containsKey(s[i]))
                map[s[i]]=map.getOrDefault(s[i],0)+1
            else
                map[s[i]]=1
        }

        val result= StringBuilder()

        for(i in 0..order.length-1){
            val key= order[i]
            while((map.get(key) ?: 0) > 0)
            {
                result.append(key)
                map[key]= (map[key] ?: 0) - 1
            }
        }


        for(i in map.keys){

            while((map[i]?:0)>0)
            {
                result.append(i)
                map[i]=(map[i]?:0)-1
            }
        }

        return result.toString()
    }
}


fun main(args: Array<String>) {
    val order = "cba"
    val s = "abcd"
    Assert.assertEquals(CustomSortString().customSortString(order,s),"cbad")
}