package com.list;

public class StringReverseItrate {
public static void main(String[] args) {
	String s="Vijay";
	String reverse="";
	char s1;
	
	for(int i= s.length()-1;i>=0;i--) {
		s1=s.charAt(i);
		reverse=reverse+s1;
	}
	System.out.println(reverse);
	
}
}
