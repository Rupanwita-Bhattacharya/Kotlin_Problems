/*
* Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
*
*
* */

class MiddleOfTheLinkedList {

    fun middleNode(head: ListNode?): ListNode? {

        if(head?.next == null) return head

        var fast= head
        var slow=head

        while(fast?.next!=null)
        {
            fast= fast.next?.next
            slow=slow?.next
        }



        return slow
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}