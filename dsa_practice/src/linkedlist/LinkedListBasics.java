package linkedlist;

import java.util.LinkedList;



public class LinkedListBasics {

	public void list_empty() throws Exception{
		
		boolean test;
		
		LinkedList<Integer> testing = new LinkedList<Integer>();
		
		
		testing.add(5);
		test = testing.isEmpty();
		System.out.println(test);
	}
	
	public static void main(String[] args) throws Exception {
		LinkedListBasics test = new LinkedListBasics();
		test.list_empty();
	}
}
