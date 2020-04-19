class ListNode {
    int val;
    ListNode next;ListNode(int x) { val = x; }
 }
public class MergeTwoListIteration {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(-1);
        ListNode head=dummyHead;
        while (l1!=null && l2!=null) {
            if (l1.val<=l2.val) {
                head.next=l1;
                l1=l1.next;
            }
            else {
                head.next=l2;
                l2=l2.next;
            }
            head=head.next;
        }
        head.next=l1==null? l2:l1;
        return dummyHead.next;
    }
}
