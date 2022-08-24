package com.aurionpro.model;

import java.util.Iterator;

public class CustomLinkedList {
	Node head;
	Node currentNode = head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;

		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}

	public void display() {
		if (head != null) {
			currentNode = head;
			while (currentNode != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
			}

			if (currentNode != null)
				System.out.println(currentNode.getData());

		} else {
			System.out.println("Linked List is empty");
		}

	}
	

	public void remove(int index) {
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.getNext();
		}
		System.out.println("Deleted element is:" + node.getNext().getData());
		node.setNext(node.getNext().getNext());
	}

	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}

	public class ListIterator implements Iterator<Integer> {
		Node currentNode = head;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentNode != null;
		}

		@Override
		public Integer next() {
				int data = currentNode.getData();
				currentNode = currentNode.getNext();
				return data;
			
		}

	}

//		 Node node = head;
//		 Node b= head;
//	        for(int i = 0; i< index ; i++){
//	        	b= node;
//	            node = node.getNext();
//	        }
//	        currentNode=b;
//	        System.out.println("b pointer"+b.getData());
//	        System.gc();
//		Node temp = head;
//		Node prev = null;
//
//		if (temp != null && temp.getData() == data) {
//			head = temp.getNext();
//		}
//
//		while (temp != null && temp.getData() != data) {
//			prev = temp;
//			temp = temp.getNext();
//		}
//		Node temp=head;
//		Node prev =null;
//		prev=temp;

//		
//		while(temp!=null && temp.getData()!=data) {
//			prev = temp;
//			temp= temp.getNext();
//		}
//		if(temp==null)
//			System.out.println("Element not found");
//		if(temp==prev) {
//			temp=temp.getNext();
//			head= temp;
//			prev=temp;
//		}
//		if(temp!=prev && temp.getData()==data) {
//			prev=temp.getNext();
//			currentNode=temp;
//			currentNode=null;
//		}
//		if (temp != null && temp.getData() == data) {
//			head = temp.getNextNode();
//		}

}