package com.sinc.book;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getDiscountBookPrice() {
		return ((double)this.getBookPrice())*(100.0-this.getBookDiscountRate())/100.0;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	@Override
	public String toString() {
		return this.getBookName()+"\t"+this.getBookPrice()+"\t"+
			    this.getBookDiscountRate()+"\t"+this.getDiscountBookPrice();
	}
	
	
	
	
	
	
	
}
