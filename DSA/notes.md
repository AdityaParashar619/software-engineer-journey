# DSA Notes

## 1. Check if Array Is Sorted and Rotated
### Idea
A sorted rotated array can have **at most one drop** (`nums[i] > nums[i+1]`).
### Pattern

Count drop points in a circular array.
```
### Complexity

* Time: O(n)
* Space: O(1)

### Takeaway

Sorted + Rotated → Count drops in circular array.
---
## 2. Remove Duplicates from Sorted Array

### Idea
Since the array is sorted, duplicates are adjacent.

### Pattern
Two Pointers

* `i` = reader
* `k` = writer
```
### Complexity
* Time: O(n)
* Space: O(1)
### Takeaway
Sorted array + remove duplicates → Two pointers (reader/writer).

```
## 3. Rotate Array
### Idea
Reverse whole array, then reverse first k elements, then reverse remaining elements.

### Pattern
Array Reversal

### Complexity
- Time: O(n)
- Space: O(1)

### Takeaway
Rotation can often be converted into a sequence of reversals.

## 4. Move Zeroes

### Idea
Move all non-zero elements to the front while maintaining order.

### Pattern
Two Pointers
- i = reader
- j = position for next non-zero

### Code
if(nums[i] != 0)
    swap(nums[i], nums[j])
    j++

### Complexity
- Time: O(n)
- Space: O(1)

### Takeaway
Whenever asked to move specific elements while preserving order, think Reader + Writer pointers.

5. Single Number (LeetCode 136)
Problem

Given a non-empty array where every element appears twice except one, find that single element.

Optimal Approach (XOR)
a ^ a = 0
a ^ 0 = a
XOR all elements.
Duplicate numbers cancel each other out.

Time Complexity: O(n)

Space Complexity: O(1)

5. Intersection of Two Arrays (LeetCode 349)
Problem

Return unique common elements present in both arrays.

Approach 1
Store first array in HashSet.
Check elements of second array.
Add common elements to result set.

Time Complexity: O(n + m)

6. Missing Number (LeetCode 268)
Problem

Given numbers from 0 to n with one missing value, find the missing number.

Approach 1 (Sum Formula)

Expected Sum = n × (n + 1) / 2

Missing Number = Expected Sum - Actual Sum

Time Complexity: O(n)

7. Longest Subarray With Sum K
Problem

Find the maximum length subarray whose sum equals K.

Brute Force
Generate all subarrays.
Compute sum for each.

Time Complexity: O(n²)

Better Approach (Positive Numbers Only)
Sliding Window
Expand window if sum < k
Shrink window if sum > k

Time Complexity: O(n)