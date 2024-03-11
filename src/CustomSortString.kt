import junit.framework.Assert

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