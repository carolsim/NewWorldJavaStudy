package com.sinc.tread.share;

public class SharedObj {
	public synchronized void printChar(char value) {
		for (int i=0;i<10;i++) {
			System.out.print(value);
		}
		System.out.println();
	}
}
