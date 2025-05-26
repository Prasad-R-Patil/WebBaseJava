package com.app;

public class Date {
	
	private int dd;
	private int mm;
	private int yyyy;
	
	public Date() {}

	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yyyy + "]";
	}
	
	

}
