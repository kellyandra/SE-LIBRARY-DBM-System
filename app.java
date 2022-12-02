import java.sql.*;
import java.util.logging.Level;
import java.uril.logging.logger;

public class app{

    public static void main(String[] args) throws Exception {
        
        System.out.println("Welcome to Library DBM Systems");


        Statement sqlST; //to run sql
        String useSQL =new String("use MDK");
        String output;
        String SQL ="select * from Catalog "
        ResultSet result;
        

        try{
            Class.forName("con.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:http://localhost/phpmyadmin/index.php?route=/database/structure&db=mdk"
            Connection dbConnect = DriverManager.getConnection(dbURL, "root", "");
            sqlST =dbConnect.createStatement(); //executes sql
            result = sqlST.executeQuery(SQL);
            //
            while ( result.nect() != false){
                output =result.getString("FirstName")+ " "+ result.getString("LastName");
            }
        } catch (ClassNotFoundException ex){
             Logger.getLogger(app.class.getName()).log(Level.SEVERE,null,ex);
             System.out.println("Class not found, check again");
        } 
        catch (SQLException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE,null,ex);
             System.out.println("Sql not working!");
        }
    }
}