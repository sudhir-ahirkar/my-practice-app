package com.practice.test.stack;

import java.util.Stack;

// 155. Min Stack
/*
*
* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.



Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2


Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
* */
public class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minimumStack = new Stack<>();

    public MinStack() {
        mainStack = new Stack<>();
        minimumStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if(minimumStack.isEmpty() || val<=minimumStack.peek()){
            minimumStack.push(val);
        }
    }

    public void pop() {
      int value = mainStack.pop();
      if(value==minimumStack.peek()){
          minimumStack.pop();
      }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
      return minimumStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("minStack====>"+minStack);
        int minValue = minStack.getMin(); // return -3
        System.out.println("minValue===>"+minValue);
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }
}
