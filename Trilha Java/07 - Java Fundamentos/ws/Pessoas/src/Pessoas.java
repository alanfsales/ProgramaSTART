
public class Pessoas {
	
	public static void main(String[] args) {
		Fisica fis = new Fisica();
		fis.nome = "João";
		fis.cpf = "1111111";
		fis.identidade = "222222222";
		fis.situacaoPessoa = "A";
		System.out.println("Dados da Pessoa Física");
		System.out.println(fis);
		
		Juridica jur = new Juridica();
		jur.nome = "CASA SALES";
		jur.cnpj = "1111111";
		jur.inscEstadual = "222222222";
		jur.situacaoPessoa = "A";
		System.out.println("Dados da Pessoa Jurídica");
		System.out.println(jur);
		
	}
}
