package Questions;

public class MergeSort {
    ListNode mergeSort(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);
        merge(left,right);
        return head;
    }
    ListNode merge(ListNode list1 , ListNode list2)
    {
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;
        while(list1 != null || list2 != null)
        {
            if(list1.val < list2.val)
            {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else
            {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null)?list1 : list2;
        return dummyHead.next;
    }

    ListNode middleNode(ListNode head)
    {
        ListNode prev,s,f;
        prev = null;
        s = head;
        f = head;
        while(f != null && f.next != null)
        {
            prev = s;
            s = s.next;
            f = f.next.next;
        }
        if(prev.next != null)
        {
            prev.next = null;
        }
        return s;
    }
}
