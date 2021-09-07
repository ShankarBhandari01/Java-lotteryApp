package lottery_application;

import java.sql.*;

public class Database {

    public Connection connection;
     PreparedStatement statement;
    ResultSet rs = null;

    public Database() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Connecting to mysql database of name lotteryDatabase
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lotteryDatabase", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e);
        }
        
        
    }
    //Registration of user which will save data in table of database
    public int Register(String fullname, String username, String password) {
        int result = 0;

        try {
            //Insert query that will store data according to column name
            statement = connection.prepareStatement("Insert into signup values(null,?,?,?)");
            statement.setString(1, fullname);
            statement.setString(2,username);
            statement.setString(3, password);

            result = statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return result;
    }
    
    
    public boolean login(String username, String password) {
        boolean result = false;

        try {
            //Retrieve name and password from database table 
            statement = connection.prepareStatement("SELECT * FROM signup WHERE username=? and Password=?");

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet r = statement.executeQuery();
//            JOptionPane.showMessageDialog(this, "Login successfull",JOptionPane.INFORMATION_MESSAGE);

            if (r.next()) {
                result = true;
                return result;

            } else {
                return result; //returning result to UserLogin form
            }

        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return result;
    }
}
