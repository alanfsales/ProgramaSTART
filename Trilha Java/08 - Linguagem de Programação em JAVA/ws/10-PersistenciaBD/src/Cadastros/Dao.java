package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	Connection con; // Conexão ao BD
	PreparedStatement stmt; // Acessa as tabelas (insert, updade, delete, select)
	ResultSet rs; // Consulta BD (select)
	CallableStatement call; // Procedures e Function
	
	public void open() {
		String url = "jdbc:mysql://localhost:3306/cadastros";
		String user = "root";
		String password = "abc121314";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		}catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao conectar com o BD");
		}
	}
	
	public void close() throws SQLException {
		con.close();
	}
}
