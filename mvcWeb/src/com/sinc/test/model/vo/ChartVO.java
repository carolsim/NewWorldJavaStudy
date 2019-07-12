package com.sinc.test.model.vo;

public class ChartVO {
	private String year;
	private int sales, expenses, profit;
	public ChartVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChartVO(String year, int sales, int expenses, int profit) {
		super();
		this.year = year;
		this.sales = sales;
		this.expenses = expenses;
		this.profit = profit;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getExpenses() {
		return expenses;
	}
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
}
