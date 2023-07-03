package classes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao {

	public void incluirPessoa(Pessoa p) throws SQLException {
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public boolean alterarPessoa(Pessoa p) throws SQLException {
		open();
		stmt = con.prepareStatement("update pessoa set nomepessoa=?, email=? where idpessoa = ?");
		try {
			stmt.setString(1, p.getNomePessoa());
			stmt.setString(2, p.getEmail());
			stmt.setInt(3, p.getIdPessoa());
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage() + stmt);
			stmt.close();
			close();
			return false;
		}
		stmt.close();
		close();
		return true;
	}
	
	public void excluirPessoa(Pessoa p) throws SQLException {
		open();
		stmt = con.prepareStatement("delete from pessoa where idpessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public Pessoa consultaPessoa(int id) throws SQLException {
		open();
		stmt = con.prepareStatement("select * from pessoa where idpessoa = ?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		Pessoa p = null;
		if(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idpessoa"));
			p.setNomePessoa(rs.getString("nomepessoa"));
			p.setEmail(rs.getString("email"));
		}else {
			System.out.println("Registro não encontrado");
		}
		close();
		return p;
	}
	
	public List<Pessoa> listarPessoas(){
		List<Pessoa> listaPessoas = new ArrayList<>();
		try {
			open();
			stmt = con.prepareStatement("select * from pessoa order by idpessoa");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt("idpessoa"));
				p.setNomePessoa(rs.getString("nomepessoa"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaPessoas;
	}
	
	
}
