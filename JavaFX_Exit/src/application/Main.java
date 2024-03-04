package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			// 프로그램 종료 시, 처리 작업
			stage.setOnCloseRequest( event -> {
				// 기본 이벤트(프로그램 종료) 제거
				// "consume" : 소멸시키다
				event.consume();
				// 메소드 호출
				logout(stage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 기존 프로그램 종료 흐름 대신 처리
	 * @param stage
	 */
	public void logout(Stage stage) {
		System.out.println("click logout...");
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("로그아웃을 진행합니다.");
		alert.setContentText("종료 전에 저장하시겠습니까?");
		
		// 경고창에서 OK 버튼 클릭 시
		if( alert.showAndWait().get() == ButtonType.OK ) {
			System.out.println("프로그램을 종료합니다...");
			stage.close();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}






