package Cadastros;

import java.sql.SQLException;
import java.util.List;

public class Menu {

	public static void main(String[] args) throws SQLException {
		PessoaDao pd = new PessoaDao();
		try {
			//Incluir Pessoa
//			Pessoa p1 = new Pessoa(1, "Jose", "jose@mail.com");
//			Pessoa p2 = new Pessoa(2, "João", "joao@mail.com");
//			pd.incluirPessoa(p1);
//			pd.incluirPessoa(p2);
			
			//Alterar Pessoa
			Pessoa pes = pd.consultaPessoa(2);
			if (pes != null) {
				pes.setEmail("joao2@mail.com");
				pd.alterarPessoa(pes);
				
				//Lista todas as pessoas
				List<Pessoa> listaPessoas = pd.listarPessoas();
				for (Pessoa p : listaPessoas) {
					System.out.println(p);
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
