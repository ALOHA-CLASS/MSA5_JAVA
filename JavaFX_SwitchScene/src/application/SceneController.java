package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

	// 화면1로 이동
	public void switchToScene1(ActionEvent event) throws IOException {
		System.out.println("화면 1로 이동...");
		// Scene1.fxml 화면으로부터 Parent 레이아웃 가져오기
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		// 이벤트 발생한 Stage 가져오기
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	// 화면2로 이동
	public void switchToScene2(ActionEvent event) throws IOException {
		System.out.println("화면 2로 이동...");
		// Scene2.fxml 화면으로부터 Parent 레이아웃 가져오기
		Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		// 이벤트 발생한 Stage 가져오기
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
}







