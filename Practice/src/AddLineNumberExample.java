import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class AddLineNumberExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("test.txt");
		writer.write("Hello\n");
		writer.write("World\n");
		writer.write("!");
		writer.flush();
		writer.close();
		
		Reader reader = new FileReader("test.txt");
		/*
		 * while(true ) { int data = reader.read();//한문자씩 읽기 if(data==-1) break;
		 * System.out.println((char)data); }
		 */

		
		/* 출력 이따구로됨
		H
		e
		l
		l
		o
		W
		o
		r
		l
		d
		!
		 */
		BufferedReader br = new BufferedReader(reader);
		while(true) {
			String data = br.readLine();
			if(data == null)break;
			System.out.println(data);
		}
		br.close();

	}

}
