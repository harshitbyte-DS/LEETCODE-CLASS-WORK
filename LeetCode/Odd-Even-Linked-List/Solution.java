1
2class Solution {
3    public ListNode oddEvenList(ListNode head) {
4        if (head==null ||head.next==null){
5            return head;
6        }
7        ListNode odd = head;
8        ListNode even = head.next;
9        ListNode evenHead = even;
10        
11        while (even != null && even.next != null) {
12
13        odd.next = even.next;
14        odd = odd.next;
15        even.next = odd.next;
16        even = even.next;
17
18        }
19        
20    
21    odd.next = evenHead;
22    return head;
23    }
24
25
26}