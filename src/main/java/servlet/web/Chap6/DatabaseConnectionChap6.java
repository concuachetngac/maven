package servlet.web.Chap6;

import java.sql.*;

public class DatabaseConnectionChap6 {
    // public static void main(String[] args) {
    //   String username = "sa";
    //   String password = "123456";
    //   String connectionURL = "jdbc:sqlserver://localhost;database=servletdb";

    //   try{
    //     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    //     Connection conn = DriverManager.getConnection(connectionURL, username, password);

    //     String sql = "INSERT INTO users (firstname, lastname, email) VALUES ('tran duc', 'tuan', 'ductuantran2410@gmail.com')";

    //     Statement statement = conn.createStatement();
    //     int rows = statement.executeUpdate(sql);

    //     if(rows > 0) {
    //       System.out.println("Row has been added");
    //     }

    //     conn.close();
    //   } catch (Exception e) {
    //     e.printStackTrace();
    //   }
    // }

    public static void insert(UserChap6_1 user) {
      String username = "sa";
      String password = "123456";
      String connectionURL = "jdbc:sqlserver://localhost;database=servletdb";

      try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(connectionURL, username, password);

        String sql = "INSERT INTO users (firstname, lastname, email)" + " VALUES (?, ?, ?)";


        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, user.getFirstName());
        pstm.setString(2, user.getLastName());
        pstm.setString(3, user.getEmail());

        pstm.execute();

        conn.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}

