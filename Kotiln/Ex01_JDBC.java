package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_JDBC {

   public static void main(String[] args) {

      Connection conn = null;
      PreparedStatement psmt = null;
      Scanner sc = new Scanner(System.in);
      
      // JDBC를 이용하는 가장 기본적인 예시로 '회원가입'을 구현해보자
      
      // 회원가입을 위한 테이블을 DB에서 만들어보자!
      // 아이디, 비밀번호, 이름(닉네임)
      // 각각의 컬럼은 문자를 담을 수 있도록 테이블 만들기!
      
      // 자바에서 회원 가입 정보를 입력받아서 전송!!
      // 회원가입을 위한 데이터가 총 몇개?
      // -> 3개 (mem_id, mem_pw, name)
      // 각각의 자료형은 모두 String 
      System.out.print("ID를 입력해주세요 >> ");
      String id = sc.next();
      System.out.print("PW를 입력해주세요 >> ");
      String pw = sc.next();
      System.out.print("이름을 입력해주세요 >> ");
      String name = sc.next();
      
      // JDBC
            // -> Java DataBase Connectivity
            // -> 수많은 인터페이스들로 코드가 구성!
            // 1. 시도해봐!
            try {
               // JDBC 연결과정
               // 1. 데이터베이스 연결
               // 1-1) 드라이버 동적로딩
               // 동적로딩이란?
               // 실행하는 순간 자료형이 결정되는 것!(OracleDriver 자료형!)
               Class.forName("oracle.jdbc.driver.OracleDriver");
               // 기울임꼴의 형태 ---> static(정적인 저장공간)
               // 실행하는 순간에 가장 먼저 로딩되는 공간 = static
               // 객체를 별도로 생성하지 않아도 사용 가능
               // 저장공간의 크기가 매우 작다! 함부로 사용하면 안된다!

               // -> 어떤 데이터베이스의 드라이버를 가져올 건지 정해주는 코드!
               // oracle.jdbc.driver --> 패키지명
               // OracleDriver -> 클래스명

               // ClassNotFoundException(클래스를 찾지 못했을 때의 예외)
               // - ojdbc6.jar파일을 프로젝트에 추가했는 지 확인하기
               // - forName안에 매개변수에 오타가 있지는 않은지!
               // 1-2) 데이터베이스 연결
               // 연결하기 위한 준비물들!
               String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
               // jdbc:oracle:thin --> 오라클의 thin 드라이버
               // @localhost --> ip주소(내 컴퓨터 ip주소의 키워드)
               // 1521 --> 포트 번호
               // xe --> DB이름
               String user = "hr"; // 데이터베이스 계정
               String password = "hr"; // 비밀번호

               conn = DriverManager.getConnection(url, user, password);
               // 2. Query문(SQL) 전송
               // 2-1) sql문장 준비하기
               String sql = "insert into member values(?,?,?)";

               // 2-2) SQL문 전송
               psmt = conn.prepareStatement(sql);
               // --> sql구문을 양식에 맞게 담아주는 작업
               
               // ?인자를 채워주는 작업(사용자가 입력한 데이터로)
               psmt.setString(1, id);
               psmt.setString(2, pw);
               psmt.setString(3, name);
               
               // 전송하기 전에 ?인자를 전부 채워주기!!!!!!!!!!!
               int row = psmt.executeUpdate();
               // SQL문 전송 -> 영향을 받은 행의 개수로 결과를 받아옴!

               // 3. 결과를 이용한 작업처리
               if (row > 0) {
                  System.out.println("데이터 추가 성공!");
               } else {
                  System.out.println("데이터 추가 실패!");
               }

               // 모든 예외와 관련된 클래스는 Exception 클래스를 상속받는다.
            } catch (ClassNotFoundException e) {
               // catch(예외의 클래스명 변수명)
               // 2. 예외상황이 발생하면 내가 잡아줄게!!!!
               e.printStackTrace(); // -> 개발할 때 사용하는 코드
               System.out.println("오류가 발생했습니다.");
            } catch (SQLException e) {
               e.printStackTrace();
               System.out.println("데이터베이스 관련 오류 발생!");
            } finally {
               // 중간에 예외상황이 발생하더라도 무조건 한번은 들려서 실행시키는 구문!
               // 4. 닫기(데이터베이스 자원 반납)
               // conn, psmt
               try {
                  // 항상 자원을 반납할 때는 열어준 순서의 역순으로 반납하자!
                  if (psmt != null)
                     psmt.close();

                  if (conn != null) // 실행문장이 한 줄이면 중괄호 생략이 가능하다.
                     conn.close();

               } catch (SQLException e) {
                  e.printStackTrace();
                  System.out.println("자원반납 시 오류!");
               }

            }
      
      
      
      
      
   }

}