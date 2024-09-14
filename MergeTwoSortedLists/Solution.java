package MergeTwoSortedLists;

public class Solution {
    // Method to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases: if one of the lists is empty, return the other list
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Create a dummy node to help with merging, dummy.next will be the head of the merged list
        ListNode dummy = new ListNode();
        // 'current' will traverse the new merged list
        ListNode current = new ListNode();

        // Pointers to traverse through list1 and list2
        ListNode current1 = list1;
        ListNode current2 = list2;

        // Loop through both lists until one of them is fully traversed
        while (current1 != null && current2 != null) {
            // If current1's value is smaller, add current1 to the merged list
            if (current1.val < current2.val) {
                current.next = new ListNode(current1.val);
                current1 = current1.next;  // Move the pointer in list1
            }
            // If current2's value is smaller, add current2 to the merged list
            else if (current2.val < current1.val) {
                current.next = new ListNode(current2.val);
                current2 = current2.next;  // Move the pointer in list2
            }
            // If both values are the same, add both to the merged list
            else {
                current.next = new ListNode(current1.val);  // Add current1's value
                // If dummy.next is null, set it to point to the merged list
                if (dummy.next == null) dummy = current;
                current = current.next;  // Move to the next node in the merged list
                current.next = new ListNode(current2.val);  // Add current2's value
                current2 = current2.next;  // Move the pointer in list2
                current1 = current1.next;  // Move the pointer in list1
            }
            // Update dummy.next to the start of the merged list
            if (dummy.next == null) dummy.next = current.next;
            current = current.next;  // Move to the next node in the merged list
        }

        // If list2 has remaining nodes, append them to the merged list
        if (current2 != null) current.next = current2;
        // If list1 has remaining nodes, append them to the merged list
        if(current1 != null) current.next = current1;

        // Return the head of the merged list (dummy.next)
        return dummy.next;
    }
}
