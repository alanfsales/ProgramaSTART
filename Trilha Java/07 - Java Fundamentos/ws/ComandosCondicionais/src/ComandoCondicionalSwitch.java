
public class ComandoCondicionalSwitch {

	public static void main(String[] args) {
		//Switch
		char opcao = '4';
		switch (opcao) {
		case '1':{
			System.out.println("Chame programa de Inclusão");
			break;
		}
		case '2':{
			System.out.println("Chame programa de Alteração");
			break;
		}
		case '3':{
			System.out.println("Chame programa de Exclusão");
			break;
		}
		case '4':{
			System.out.println("Chame programa de Consulta");
			break;
		}
		default:
			System.out.println("Opção inválida: " + opcao + ". Redigite");
		}
	}
}
