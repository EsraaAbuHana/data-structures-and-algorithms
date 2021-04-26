# Code Challenge: Class 16
# Find Maximum Value Binary Tree
## Challenge Summary

## Challenge
* Write an instance method `find-maximum-value`.
* Don't utilize any of the built-in methods.
*  INPUT: Binary Tree
*  OUTPUT: the maximum value stored in the tree.
  
## Approach and Efficiency
- **The approach taken for this challenge** was  to call the InOrder method for the binary tree and return the last index of that stored array which is the last right in the last level.
-  `InOrder` :since we extend the binary tree class ,i did use `InOrder` method to traverse the tree . 
- This method takes:
  - time :O(n) 

## Solution
![](assest/CC16.jpg)