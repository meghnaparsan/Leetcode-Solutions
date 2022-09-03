class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode head = result;
        
        ListNode head1 = list1;
        ListNode head2 = list2;
        
        while (head1 != null && head2 != null) {
            if (head1.val > head2.val) {
                head.next = head2;
                head2 = head2.next;
            }
            else {
                head.next = head1;
                head1 = head1.next;
            }
            head = head.next;
        }
        
        if (head1 != null) {
            head.next = head1;
        }
        
        if (head2 != null) {
            head.next = head2;
        }
        
        return result.next;
    }
}
