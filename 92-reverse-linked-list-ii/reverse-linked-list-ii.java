class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previousNode = dummy;

        for(int i = 1;i<left;i++){
            previousNode = previousNode.next;  
        }

        ListNode end =  previousNode.next;
        for(int i = left;i<right;i++){
            end = end.next;
        }

        ListNode lastNode = end.next;

        end.next = null;

        ListNode current = previousNode.next;
        ListNode prev = null;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode tail = previousNode.next;

        previousNode.next = prev;

        tail.next = lastNode;


        return dummy.next;

    }
}