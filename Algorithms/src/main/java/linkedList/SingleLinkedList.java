package linkedList;

import java.util.LinkedList;

public class SingleLinkedList {

	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(1);
		list.add(1, 3);
		list.addFirst(5);
		list.addLast(10);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
