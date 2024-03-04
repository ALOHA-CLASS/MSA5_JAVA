package Day15.Ex03_File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReaderAndWriter {

	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader( System.in );
		FileWriter fw = null;
	
		int data = 0;
		try {
			fw = new FileWriter("./src/Day15/Test3.txt");	
			// 입력
			while( (data = is.read()) != -1 ) {
				// 출력
				fw.write(data);	
			}
			is.close();
			fw.close();
			System.out.println("텍스트 파일이 저장되었습니다.");
		} catch (IOException e) {
			System.err.println("입출력 시, 에러가 발생하였습니다.");
			e.printStackTrace();
		} 
		
	}
}
