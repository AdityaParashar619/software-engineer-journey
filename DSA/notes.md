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