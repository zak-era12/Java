//JDBC Program to show the contents of the table
package name;
import java.sql.*;
class name {
public static void main(String [] args) {
        try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
//here studentdb is database name, root is username and 1234 is password 
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/studentdb","root","1234")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from student_table");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getString(4));  
con.close();
            }
}catch( ClassNotFoundException | SQLException e){ System.out.println(e);}  
    }
}
