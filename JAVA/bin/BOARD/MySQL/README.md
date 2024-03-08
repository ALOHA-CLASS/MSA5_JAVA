# JAVA X MySQL 게시판 프로그램

1. MySQL JDBC 드라이버 다운로드
    - https://dev.mysql.com/downloads/connector/j/
2. 자바 프로젝트에 라이브러리 추가
    - mysql-connector-j-8.3.0.jar
3. 드라이버 로드
```
    // mysql-connector-j.xxx.jar 드라이버의 클래스를 로드한다.
    Class.forName("com.mysql.cj.jdbc.Driver");		 
			
    // DB에 연결
    // - 연결에 필요한 정보 : URL, id, pw
    // URL : jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
    //		* 내 PC의 IP주소 : localhost : 127.0.0.1
    //		* 3306 : MySQL 데이터베이스의 기본 포트
    String url = "jdbc:mysql://127.0.0.1:3306/joeun?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
    String id = "joeun";
    String pw = "123456";
    
    // 자바 프로그램에서 JDBC 드라이버를 연결시켜주는 클래스
    // getConnection() 메소드로 DB에 연결 요청하고 생성된 Connection 객체를 반환받는다.
    con = DriverManager.getConnection(url, id, pw);
```

