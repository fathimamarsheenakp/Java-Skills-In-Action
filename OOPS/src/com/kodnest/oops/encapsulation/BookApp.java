package com.kodnest.oops.encapsulation;

public class BookApp {
	public static void main(String[] args) {
		Book book = new Book();
//		book.pageNo = 100;
		
		book.setPageNo(100);
		System.out.println(book.getPageNo());
	}
}
