package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class aController {
	
	@FXML
	TextField tInput;

	// B로 이동하기
	public void toB(ActionEvent event) throws IOException {
		
		// B로 데이터 전달하기
		FXMLLoader bFXML = new FXMLLoader(getClass().getResource("B.fxml")); 
		Parent bRoot = bFXML.load();
		
		bController bController = bFXML.getController();	// bController 가져오기
		
		String data = tInput.getText();		// A화면의 텍스트필드 입력값 가져오기
		bController.showData( data );		// A에서 B화면으로 데이터 전달
		
//		Main.setRoot("B");		// B로 이동
		Main.setRoot(bRoot);
	}
}









