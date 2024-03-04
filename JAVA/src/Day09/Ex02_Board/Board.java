package Day09.Ex02_Board;

/**
 *  게시글 정보
 *  - 게시글 번호
 *  - 제목
 *  - 작성자
 *  - 내용
 *  - 등록일자
 *  - 수정일자
 */
public class Board {
	// 멤버 변수 (필드)
	private int no;
	private String title;
	private String writer;
	private String content;
	private String regDate;
	private String updDate;
	
	// 기본 생성자
	public Board() {
		this("제목없음", "작성자없음", "내용없음");
	}
	
	// 매개변수가 있는 생성자
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	// getter, setter
	// alt + shift + S -> Generate Getters and Setters
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getUpdDate() {
		return updDate;
	}

	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}

	// toString
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", updDate=" + updDate + "]";
	}
	
}




