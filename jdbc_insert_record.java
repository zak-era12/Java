Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","1234");
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate("INSERT INTO student_table (id, `name`, `class`, age) VALUES (8101, 'john', 'SYIT', 20)");
            if (result > 0) 
                System.out.println("successfully inserted"); 
  
            else
                System.out.println("unsuccessful insertion "); 
            
            ResultSet rs=stmt.executeQuery("select * from student_table");
            
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getString(4));
            con.close();
