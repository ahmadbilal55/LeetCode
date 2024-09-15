# 28. Find the Index of the First Occurrence in a String

Given two strings `needle` and `haystack`, return the `index` of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not part of `haystack`.



### Example 1:

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```
### Example 2:

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```

### Constraints:

- `1 <= haystack.length`, `needle.length <= 104`
- `haystack` and `needle` consist of only **lowercase** English characters.

### Notes:
This problem can be solved in 2 ways. First is a very simple way which is to use the built-in array method `indexOf(String str)`.
I solved the problem using the simplest approach which made this problem very, VERY <span style="color:green">Easy</span> to solve. But I went through the comments and found out that there is an algorithm called [KMP](https://en.wikipedia.org/wiki/Knuth–Morris–Pratt_algorithm) or [Knuth–Morris–Pratt](https://en.wikipedia.org/wiki/Knuth–Morris–Pratt_algorithm) Algorithm that I never heard of before.
So me being me, I had to learn what it's all about. I went to Youtube to understand this algorithm. Solving the problem with [KMP](https://en.wikipedia.org/wiki/Knuth–Morris–Pratt_algorithm) actually makes it very <span style="color:red">Hard</span> problem to solve.
I solved the problem twice. First with the simple approach then with KMP.