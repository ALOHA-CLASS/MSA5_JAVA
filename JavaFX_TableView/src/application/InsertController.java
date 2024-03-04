package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {

    @FXML
    private TextField tTtile;

    @FXML
    private TextField tWriter;
    
    @FXML
    private TextArea tContent;
    
    
    // 글등록 처리
    public void insert(ActionEvent event) throws Exception {
    	Board board = new Board(tTtile.getText(), tWriter.getText(), tContent.getText());
    	
    	System.out.println("title : " + tTtile.getText());
    	System.out.println("writer : " + tWriter.getText());
    	System.out.println("content : " + tContent.getText());
    	
    	// boardList 에 새 글 추가
    	Main.boardList.add(board);
    	
    	// 게시글 목록 화면(메인)으로 이동
    	Main.setRoot("Main");		// Main.fxml 화면으로 이동
    	
    }
}









