package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*import java.util.logging.Level;
import java.util.logging.Logger;
*/

import javax.swing.JOptionPane;
	
public class DB_Connect {
	
	public static void main(String[] args) {
		DB_Connect pro = new DB_Connect();
		pro.createConnection();
		
	}
	
	void createConnection(){
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3306/db_supermercado";
		final String USER = "root";
		final String PASSWORD = "";
		
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch	(ClassNotFoundException e) {
			//Logger.getLogger(db_connect.class.getName()).log(Level.SEVERE,null, e);
			JOptionPane.showMessageDialog(null, "Driver n�o encontrado!\n" + e);
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Problemas na conex�o com o banco\n" + e);
		}
	
	}
	
}
