package com.list;

import java.util.LinkedList;
import java.util.List;

public class Lis {
	public static void main(String[] args) {
		List<Integer> li=new LinkedList <Integer>();
		li.add(0);
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(2);
		System.out.println(li);
		int size=li.size();
		System.out.println(size);
		int obj = li.get(3);
		System.out.println(obj);
		li.remove(1);
		System.out.println(li);
		li.add(1,5);
		System.out.println(li);
		li.set(1, 4);
		System.out.println(li);
		boolean contains=li.contains(10);
		System.out.println(contains);
		int indexOf = li.indexOf(2);
		System.out.println(indexOf);
		int lastIndexOf = li.lastIndexOf(2);
		System.out.println(lastIndexOf);
		li.removeAll(li);
		li.retainAll(li);
		boolean empty = li.isEmpty();
		System.out.println(empty);
	}

}
