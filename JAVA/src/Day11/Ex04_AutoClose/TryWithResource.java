package Day11.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		
  		// try( 자동으로 자원해제할 객체 생성 ) { }
		// : finally 구문에서 close() 하지 않아도, 자동으로 자원해제 해준다.
		// * AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원해제 가능
		try( FileInputStream fis = new FileInputStream("test.txt") ) {
			
			int read = 0;
			
			// fis.read() : .txt 파일의 데이터를 한 글자씩 읽어오는 메소드
			// 				* 더 이상 읽어온 데이터가 없으면 -1 을 반환
			// 가져올 글자가 없을 때까지 반복한다
			while( (read = fis.read() ) != -1 ) {
				System.out.print( (char) read );
			}
			
		} catch (FileNotFoundException e) {
			// FileNotFoundException : 파일이 존재하지 않을 때 발생하는 예외
			e.printStackTrace();		// 예외 발생의 원인을 찾아 단계별로 예외 메시지를 출력
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// IOException : 입력 및 출력 과정에서 발생하는 예외
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
		}	
		// 자원 해제 코드
//		finally {
//			if( fis != null ) {
//				try {
//					fis.close();			// close() : 메모리 해제
//				} catch (IOException e) {
//					e.printStackTrace();
//				} 	
//			}
//		}
	}
}
