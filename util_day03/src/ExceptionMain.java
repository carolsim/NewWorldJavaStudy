import java.io.IOException;

import com.sinc.util.exception.ExceptionObj;

public class ExceptionMain {
	/*
	public static void main(String[] args) throws IOException {
		ExceptionObj obj = new ExceptionObj();
		////////////////
		obj.compileE();
		System.out.println("main end~");

	}*/
	
	/*
	public static void main(String[] args) throws Exception {
		ExceptionObj obj = new ExceptionObj();
		////////////////
		obj.runtimeE();
		System.out.println("main end~");

	}
	*/
	
	/*여기에서는 throw Exception을 해도되고, 안해도 된다.
	 * 어차피 여기서 throw Exception을 해도 여기서 먼저 catch를 하기때문에 throw가 실행되지 않음.*/
	public static void main(String[] args) {
		ExceptionObj obj = new ExceptionObj();
		///////////////
		try {
			obj.makeE(false);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("main end~");
		}

	}

}
