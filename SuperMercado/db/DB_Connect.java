package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB_Connect {
	
	
	

	public static void main(String[] args) {
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3306/super_mercado";
		final String USER = "root";
		final String PASSWORD = "";
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "SELECT * FROM cliente";
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("CÓDIGO | NOME");
			System.out.println("-------|------");
			while(resultSet.next()) {
				String codigo = resultSet.getString("codigo");
				String nome = resultSet.getString("nome");
				System.out.println(codigo + "        " + nome);
			}
			resultSet.close();
			statement.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Driver não encontrado!\n" + e);
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco\n" + e);
		}
		
		
	}

}
