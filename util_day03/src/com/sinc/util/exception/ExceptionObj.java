package com.sinc.util.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sinc.util.SincException;

public class ExceptionObj {
	
	public void compileE() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String inputMsg = null;
		//inputMsg = br.readLine();//IOException이 터졌다는 컴파일 exception이 터졌다.이걸 해결하지 않으면 컴파일이 안됨. 
		//방법 두가지 : 여기 안에서 tcf하는 방법, throw하는 방법(이걸 택)
		inputMsg = br.readLine();//위에 throws IOException추가하면 이 라인의 예외는 처리된다.
		System.out.println("Result: "+inputMsg);
		
	}
	
	public void runtimeE() {
		String [] strAry = new String[] {"임섭순","섭섭해","임재원","임은결"};
		try {
			for(int i=0;i<strAry.length;i++) {
			System.out.println(strAry[i]);
			}
			System.out.println("for end~~");
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				System.out.println("RuntimeE end");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	/*메서드 안에서 예외를 터뜨려보려는 것이*/
	public void makeE(boolean flag) throws Exception {
		try {
			if(flag) {
				throw new SincException("너무 좋은회사라서 예외입니다.");
			} 
		}finally {
			System.out.println("makeE end~~");
		}
	}
}
