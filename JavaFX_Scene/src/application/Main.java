package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage primaryStage; // 주 창을 나타내는 Stage 객체
    private Scene sceneA, sceneB; // SceneA와 SceneB를 나타내는 Scene 객체
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;

        // SceneA 생성
        Button switchButton = new Button("B 화면으로 이동");
        switchButton.setOnAction(e -> primaryStage.setScene(sceneB)); // SceneB로 전환하는 이벤트 핸들러 설정
        StackPane layoutA = new StackPane(switchButton); // 버튼을 포함하는 레이아웃 생성
        sceneA = new Scene(layoutA, 300, 200); // SceneA 생성

        // SceneB 생성
        Button backButton = new Button("A 화면으로 이동");
        backButton.setOnAction(e -> primaryStage.setScene(sceneA)); // SceneA로 전환하는 이벤트 핸들러 설정
        StackPane layoutB = new StackPane(backButton); // 버튼을 포함하는 레이아웃 생성
        sceneB = new Scene(layoutB, 300, 200); // SceneB 생성

        // 초기 Scene 설정 (애플리케이션이 시작될 때는 SceneA를 보여줌)
        primaryStage.setScene(sceneA);
        primaryStage.setTitle("화면 이동"); // 윈도우 타이틀 설정
        primaryStage.show(); // 주 창을 화면에 표시
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}








