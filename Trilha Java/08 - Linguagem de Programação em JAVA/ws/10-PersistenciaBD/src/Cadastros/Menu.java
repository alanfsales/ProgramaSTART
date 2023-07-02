package Cadastros;

import java.sql.SQLException;
import java.util.List;

public class Menu {

	public static void main(String[] args) throws SQLException {
		PessoaDao pd = new PessoaDao();
		
		//Incluir Pessoa--------
//			Pessoa p1 = new Pessoa(3, "Maria", "maria@mail.com");
//			Pessoa p2 = new Pessoa(4, "Ana", "ana@mail.com");
//			pd.incluirPessoa(p1);
//			pd.incluirPessoa(p2);
		
		//Alterar Pessoa--------
			Pessoa pes = pd.consultaPessoa(2);
			if (pes != null) {
				pes.setEmail("joao2@mail.com");
				if (pd.alterarPessoa(pes)) {
				 System.out.println("Pessoa alterada com sucesso!");	
				}
				
				//Lista todas as pessoas
				List<Pessoa> listaPessoas = pd.listarPessoas();
				for (Pessoa p : listaPessoas) {
					System.out.println(p);
				}
			}
		
		//Excluir pessoa-----------
//			Pessoa pes1 = pd.consultaPessoa(2);
//			pd.excluirPessoa(pes);
//			
//			//Lista todas as pessoas
//			List<Pessoa> listaPessoas = pd.listarPessoas();
//			for (Pessoa p : listaPessoas) {
//				System.out.println(p);
//			}
		
		//Consulta 1 pessoa-----------
//			Pessoa pes2 = pd.consultaPessoa(2);
//			if (pes2 != null) {
//				System.out.println("Código..: " + pes2.getIdPessoa());
//				System.out.println("Nome....: " + pes2.getNomePessoa());
//				System.out.println("Email...: " + pes2.getEmail());
//			}
		
		//Lista todas as pessoas---------
//		List<Pessoa> listaPessoas = pd.listarPessoas();
//		for (Pessoa p : listaPessoas) {
//			System.out.println("Código: " + p.getIdPessoa());
//			System.out.println("Nome..: " + p.getNomePessoa());
//			System.out.println("Email.: " + p.getEmail());
//			System.out.println("----------------------------");
//		}
		
	}
}
