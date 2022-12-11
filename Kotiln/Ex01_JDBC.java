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
      
      // JDBC�� �̿��ϴ� ���� �⺻���� ���÷� 'ȸ������'�� �����غ���
      
      // ȸ�������� ���� ���̺��� DB���� ������!
      // ���̵�, ��й�ȣ, �̸�(�г���)
      // ������ �÷��� ���ڸ� ���� �� �ֵ��� ���̺� �����!
      
      // �ڹٿ��� ȸ�� ���� ������ �Է¹޾Ƽ� ����!!
      // ȸ�������� ���� �����Ͱ� �� �?
      // -> 3�� (mem_id, mem_pw, name)
      // ������ �ڷ����� ��� String 
      System.out.print("ID�� �Է����ּ��� >> ");
      String id = sc.next();
      System.out.print("PW�� �Է����ּ��� >> ");
      String pw = sc.next();
      System.out.print("�̸��� �Է����ּ��� >> ");
      String name = sc.next();
      
      // JDBC
            // -> Java DataBase Connectivity
            // -> ������ �������̽���� �ڵ尡 ����!
            // 1. �õ��غ�!
            try {
               // JDBC �������
               // 1. �����ͺ��̽� ����
               // 1-1) ����̹� �����ε�
               // �����ε��̶�?
               // �����ϴ� ���� �ڷ����� �����Ǵ� ��!(OracleDriver �ڷ���!)
               Class.forName("oracle.jdbc.driver.OracleDriver");
               // ����Ӳ��� ���� ---> static(������ �������)
               // �����ϴ� ������ ���� ���� �ε��Ǵ� ���� = static
               // ��ü�� ������ �������� �ʾƵ� ��� ����
               // ��������� ũ�Ⱑ �ſ� �۴�! �Ժη� ����ϸ� �ȵȴ�!

               // -> � �����ͺ��̽��� ����̹��� ������ ���� �����ִ� �ڵ�!
               // oracle.jdbc.driver --> ��Ű����
               // OracleDriver -> Ŭ������

               // ClassNotFoundException(Ŭ������ ã�� ������ ���� ����)
               // - ojdbc6.jar������ ������Ʈ�� �߰��ߴ� �� Ȯ���ϱ�
               // - forName�ȿ� �Ű������� ��Ÿ�� ������ ������!
               // 1-2) �����ͺ��̽� ����
               // �����ϱ� ���� �غ񹰵�!
               String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� �ּ�
               // jdbc:oracle:thin --> ����Ŭ�� thin ����̹�
               // @localhost --> ip�ּ�(�� ��ǻ�� ip�ּ��� Ű����)
               // 1521 --> ��Ʈ ��ȣ
               // xe --> DB�̸�
               String user = "hr"; // �����ͺ��̽� ����
               String password = "hr"; // ��й�ȣ

               conn = DriverManager.getConnection(url, user, password);
               // 2. Query��(SQL) ����
               // 2-1) sql���� �غ��ϱ�
               String sql = "insert into member values(?,?,?)";

               // 2-2) SQL�� ����
               psmt = conn.prepareStatement(sql);
               // --> sql������ ��Ŀ� �°� ����ִ� �۾�
               
               // ?���ڸ� ä���ִ� �۾�(����ڰ� �Է��� �����ͷ�)
               psmt.setString(1, id);
               psmt.setString(2, pw);
               psmt.setString(3, name);
               
               // �����ϱ� ���� ?���ڸ� ���� ä���ֱ�!!!!!!!!!!!
               int row = psmt.executeUpdate();
               // SQL�� ���� -> ������ ���� ���� ������ ����� �޾ƿ�!

               // 3. ����� �̿��� �۾�ó��
               if (row > 0) {
                  System.out.println("������ �߰� ����!");
               } else {
                  System.out.println("������ �߰� ����!");
               }

               // ��� ���ܿ� ���õ� Ŭ������ Exception Ŭ������ ��ӹ޴´�.
            } catch (ClassNotFoundException e) {
               // catch(������ Ŭ������ ������)
               // 2. ���ܻ�Ȳ�� �߻��ϸ� ���� ����ٰ�!!!!
               e.printStackTrace(); // -> ������ �� ����ϴ� �ڵ�
               System.out.println("������ �߻��߽��ϴ�.");
            } catch (SQLException e) {
               e.printStackTrace();
               System.out.println("�����ͺ��̽� ���� ���� �߻�!");
            } finally {
               // �߰��� ���ܻ�Ȳ�� �߻��ϴ��� ������ �ѹ��� ����� �����Ű�� ����!
               // 4. �ݱ�(�����ͺ��̽� �ڿ� �ݳ�)
               // conn, psmt
               try {
                  // �׻� �ڿ��� �ݳ��� ���� ������ ������ �������� �ݳ�����!
                  if (psmt != null)
                     psmt.close();

                  if (conn != null) // ���๮���� �� ���̸� �߰�ȣ ������ �����ϴ�.
                     conn.close();

               } catch (SQLException e) {
                  e.printStackTrace();
                  System.out.println("�ڿ��ݳ� �� ����!");
               }

            }
      
      
      
      
      
   }

}