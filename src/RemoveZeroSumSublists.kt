/*
* Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.

After doing so, return the head of the final linked list.  You may return any such answer.



(Note that in the examples below, all sequences are serializations of ListNode objects.)

Example 1:

Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.
* */

class RemoveZeroSumSublists {


    fun removeZeroSumSublists(head: ListNode?): ListNode? {

        val front: ListNode = ListNode(0).apply {
            next = head
        }
        var current:ListNode?= front

        val sumTable= hashMapOf<Int,ListNode?>()
        sumTable.put(0,front)
        var prefixSum=0

        while(current!=null){
            prefixSum+=current.`val`
            sumTable.put(prefixSum,current)
            current= current.next
        }

        prefixSum=0
        current=front

        while(current!=null){
            prefixSum+=current.`val`
            current.next =sumTable.get(prefixSum)?.next
            current= current.next
        }

        return front.next
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
