import com.sinc.thread.PrtThread;
import com.sinc.tread.share.SharedObj;

public class ThreadMain {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		PrintThread runnable = new PrintThread();
		Thread thread = new Thread(runnable);
		thread.start();
		try {
			thread.join();//얘를 하면 순서대로 진행이 된다.->동기화. (interrupt) sleep도 interrupt가 될 수 있는것.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
		*/
		
		/*동시성에 관련된 문제*/
		SharedObj moniter = new SharedObj();
		Thread thread01 = new Thread(new PrtThread('A', moniter));
		thread01.start();
		Thread thread02 = new Thread(new PrtThread('B', moniter));
		thread02.start();
	}

}
