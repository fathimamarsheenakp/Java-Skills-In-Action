package com.kodnest.oops.encapsulation;

public class Book {

	private int pageNo;
	
//	SETTER
	public void setPageNo(int pageNo) {
		if (pageNo > 0) {
			this.pageNo = pageNo;
		} else {
			System.out.println("Invalid page no");
		}
	}
	
//	GETTER
	public int getPageNo() {
		return pageNo;
	}
}
