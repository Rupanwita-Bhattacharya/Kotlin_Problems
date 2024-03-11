class Main {

    fun totalPrice(arr:Array<Int>,discount:Int):Int{
        var highest=Int.MIN_VALUE

        arr.forEach {
            highest= Math.max(highest,it)
        }
        val d=(discount.toDouble()/100)
        val e=(highest * d).toInt()
        val discounted= highest- e
        print("test---$d---- $discounted")

        var totalPrice=0
        arr.forEach {
            if(it==highest)
                totalPrice+=discounted
            else
                totalPrice+=it
        }

        return totalPrice
    }
}

fun main(args: Array<String>) {
   println(Main().totalPrice(arrayOf(100,120,300,500),50))
}