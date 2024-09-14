package MergeTwoSortedLists;


public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(1);
        ListNode solution = new Solution().mergeTwoLists(list1, list2);

        System.out.print('[');
        while (solution != null) {
            System.out.print(solution.val + ", ");
            solution = solution.next;
        }
        System.out.print(']');
    }
}
