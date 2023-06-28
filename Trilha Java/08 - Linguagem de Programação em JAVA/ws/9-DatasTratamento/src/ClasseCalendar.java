import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		System.out.println("==> Recupecação da date com a classe Calendar");
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Data e Hora Atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do mês: " + cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("==> Alterando date/hora com o método set");
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.DAY_OF_MONTH, 12);
		System.out.println("Data e Hora Atual: " + cal.getTime());
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do mês: " + cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("==> Recuperando a hora do dia");
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("Agora são: " + hora + " hrs");
		if (hora > 6 && hora < 12) {
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18) {
			System.out.println("Boa Tarde");
		}else {
			System.out.println("Boa Noite");
		}
	}
}
