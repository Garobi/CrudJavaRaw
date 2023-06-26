package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

  public static String url =
      "jdbc:mysql://192.168.1.239:3306/universidadeMatricula";
  public static String user = "root";
  public static String pass = "1598";

  private static Connection conn;

  public static Connection getConexao() {
    try {
      if (conn == null) {
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
      } else {
        return conn;
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }
  }
}
