# 21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one **sorted** list. The list should be made by splicing together the nodes of the first two
lists.

Return _the head of the merged linked list_.

### Example 1:

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

### Example 2:

```
Input: list1 = [], list2 = []
Output: []
```

### Example 3:

```
Input: list1 = [], list2 = [0]
Output: [0]
```

### Constraints:

- The number of nodes in both lists is in the range `[0, 50]`.

- `-100 <= Node.val <= 100`

- Both `list1` and `list2` are sorted in **non-decreasing** order.

### Notes

- This problem statement is incorrect. The `list1` and `list2` are not actually lists but the head `ListNode` of two
LinkedLists.
- This problem was labeled <span style="color:green">easy</span> but it as a lot of other leetcoders suggest, it should actually be labeled as <span style="color:yellow">medium</span>.