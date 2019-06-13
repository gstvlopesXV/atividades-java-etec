package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import view.View_Caixa;

public class Caixa_CRUD {
	
	public void criar(Connection con, View_Caixa caixa) throws SQLException{
		String sql = "INSERT INTO CONTA VALUES (?,?,?)";
		try (PreparedStatement stm = con.prepareStatement(sql)){
		stm.setInt(1, caixa.numero);
		stm.setString(2, caixa.cliente);
		stm.setDouble(3, caixa.saldo);
		stm.executeUpdate();
		}
	}
	
	public List<View_Caixa> ler(Connection con) throws SQLException{
		List<View_Caixa> lista = new ArrayList<>();
		String sql = "SELECT NUMERO, CLIENTE, SALDO FROM CONTA";
		try (PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				lista.add(new View_Caixa(rs.getInt("NUMERO"), rs.getString(2), rs.getDouble("SALDO")));
			}
		}
		return lista;
	}
	
	public void alterar(Connection con, Conta conta) throws SQLException{
		String sql = "UPDATE CONTA SET CLIENTE=?, SALDO=? WHERE NUMERO=?";
		try (PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public void excluir(Connection con, Conta conta) throws SQLException{
		String sql = "DELETE FROM CONTA WHERE NUMERO=?";
		try (PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}
	}

	
	
	public static void main(String[] args) throws SQLException {
		
		String servidor = "jdbc:mysql://localhost:3306/bdconta";
		String usuario = "root";
		String senha = "";
		
		try (Connection con = DriverManager.getConnection(servidor, usuario, senha)){
			Caixa_CRUD crud = new Caixa_CRUD();
			
			
			List<Caixa> contas = crud.ler(con);
			for (Caixa conta : contas) {
				System.out.println(conta);
			}
			
		
			
						
		}

	}

}
	
	

