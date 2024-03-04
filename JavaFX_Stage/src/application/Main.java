package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	// 화면 시작 메소드
	@Override
	public void start(Stage stage) {
		// 단일 Stage 객체로 부터 화면이 시작된다.
		
		// Scene 을 지정하기 위한 그룹 객체
		Group root = new Group();
		
		// Scene 생성
		// - new Scene(레이아웃);
		Scene scene = new Scene(root);
		
		/* Stage 설정 */
		// Stage 타이틀 설정
		stage.setTitle("프로그램 이름");
		
		// Stage 프로그램 아이콘 지정
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		
		// Stage 윈도우 크기 지정
		stage.setWidth(600);
		stage.setHeight(400);
		
		// Stage 크기 조절 가능 여부 설정
		stage.setResizable(false);		// 크기 조절 비활성화
		
		// Stage 위치 설정
		stage.setX(50);
		stage.setY(50);
		
		// 전체 화면 모드 
		stage.setFullScreen(true);
		
		// 전체 화면 모드 종료 힌트 설정
		stage.setFullScreenExitHint("전체화면 종료 (Q)");
		
		// 전체 화면 모드 종료 단축키 설정 - Q 키 입력시 전체화면 종료
		stage.setFullScreenExitKeyCombination( KeyCombination.valueOf("Q") );
		
		// Scene 을 Stage 에 지정
		stage.setScene(scene);
		
		// Stage 출력
		stage.show();
	}
	
	// 프로그램 시작
	public static void main(String[] args) {
		launch(args);		// 프로그램 시작 준비 작업 후 -> start() 호출
	}
}










