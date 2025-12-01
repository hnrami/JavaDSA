package com.meybise.stack;

public class Stack {

	private int[] stack_rack;
	private int top;
	private int capacity;

	// Constructor
	Stack(int size) {

		stack_rack = new int[size];
		capacity = size;
		top = -1; // Stack initially empty

	}

	// Push element into stack
	public void push(int value) {

		stack_rack[++top] = value;

		System.out.println(value + "pushed to stack");

	}

	public void print_stack() {
		System.out.print("Stack elements: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(stack_rack[i] + " ");
		}
		System.out.println();
	}

	public int pop() {
		int value = stack_rack[top--];
		System.out.println(value + " popped from stack");
		return value;
	}
	
	// Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
	// Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack_rack[top];
    }

	public static void main(String argc[]) {

		 Stack stack = new Stack(5);

		   stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        stack.print_stack();

	        stack.pop();
	        stack.pop();

	        stack.print_stack();

	        System.out.println("Top element is: " + stack.peek());

	}

}
