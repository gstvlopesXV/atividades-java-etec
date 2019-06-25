package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.View_Login;
	
public class DB_Login extends View_Login{
	
	public static void main(String[] args) {
		DB_Login pro = new DB_Login();
		pro.createConnection();
		
	}
	
	public void createConnection(){
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3306/db_supermercado";
		final String USER = "root";
		final String PASSWORD = "";
		
		try {	
			
			View_Login login = new View_Login();
			
			Class.forName(DRIVER);
				Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				System.out.println("BANCO CONECTADO");
				
				String username = String.valueOf(login.getUsernameField().getText());
				String password = String.valueOf(login.getPasswordField().getText());
				
				String sql = "select * from tbl_login where usuario='?'  and senha='?'";
				
				
				System.out.println(sql);
				PreparedStatement pstmt = con.prepareStatement(sql);
				System.out.println(sql);
					
				//String username = String.valueOf(login.getUsernameField().getText());
				//String password = String.valueOf(login.getPasswordField().getText());
				
				pstmt.setString(1, login.getUsernameField().toString());
				pstmt.setString(2, login.getPasswordField().toString());
				
				ResultSet rs = pstmt.executeQuery(sql);
				
				
				
				if(rs.next()) {
					JOptionPane.showMessageDialog(null, "Bem Vindo!");
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Acesso Negado!");
					login.getUsernameField().setText("");
					login.getPasswordField().setText("");
				}
				con.close();
				rs.close();
				pstmt.close();
			
		} catch	(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Driver não encontrado!\n" + e);
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco\n" + e);
		}
	
	}
	
}