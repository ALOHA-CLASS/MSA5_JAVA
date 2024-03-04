package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class bController {

	@FXML
	TextField tOutput;
	
	// A로 이동하기
	public void toA(ActionEvent event) throws IOException {
		Main.setRoot("A");		// A로 이동
	}
	
	// 전달받은 데이터 텍스트필드에 출력하기
	public void showData(String data) {
		tOutput.setText(data);  
	}
}











