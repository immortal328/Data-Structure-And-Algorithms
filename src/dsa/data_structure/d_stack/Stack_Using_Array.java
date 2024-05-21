package dsa.data_structure.d_stack;

import java.util.Scanner;

public class Stack_Using_Array {
	public int[] arr;
	public int top =0;
	
	public Stack_Using_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the size for array :");
		int size = sc.nextInt();
		arr = new int[size];
	}
	
	/**
	 * Method push data in Stack
	 * */
	void  push(int data) throws Exception {
		if(top >= arr.length) {
			throw new Exception("Stack Overflow...");			
		}else {
			arr[top++]=data;
		}
		System.out.println("Added data :"+data+"at top :"+ (top-1));
	}
	
	/**
	 * Method Pop data from Stack
	 * */
	int pop() throws Exception {
		int data;
		if(top <= 0) {
			throw new Exception("Stack is empty...");			
		}else {
			data = arr[--top];
		}	
		System.out.println("removed element at top : "+data);
		return data;	
	}
	
	/**
	 * Method to check Top element in stack
	 * */
	void peek() {
		System.out.println(arr[top]);
	}
}
