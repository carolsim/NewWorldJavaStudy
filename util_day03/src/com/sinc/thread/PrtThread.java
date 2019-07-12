package com.sinc.thread;

import com.sinc.tread.share.SharedObj;

public class PrtThread implements Runnable {

	private char charValue;
	private SharedObj moniter;
	
	public PrtThread() {
		
	}
	
	public PrtThread(char charValue, SharedObj moniter) {
		this.charValue = charValue;
		this.moniter = moniter;
	}
	
	
	@Override
	public void run() {
		//10에 10줄을 보장하려면 moniter를 보장해줘야한다.
		synchronized (moniter) {
			for(int i=0; i<10;i++) {
				moniter.printChar(charValue);
			}
		}
		
		
	}

}
