
public class Demostracao {

	public static void main(String[] args) {
		
		Boolean bolWrapper = true;
		System.out.println(bolWrapper.getClass());
		
		Character chWrapper = 'a';
		System.out.println(chWrapper.getClass());
		
		Byte byteWrapper = 1;
		System.out.println(byteWrapper.getClass());
		
		Short shoWrapper = 'B';
		System.out.println(shoWrapper.getClass());
		
		Integer intWrapper = 5215;
		System.out.println(intWrapper.getClass());
		
		Long longWrapper = 14585645666L;
		System.out.println(longWrapper.getClass());
		
		Float floatWrapper = 3.14159f;
		System.out.println(floatWrapper.getClass());
		
		Double douWrapper = 3.14159;
		System.out.println(douWrapper.getClass());
		
		int numero = Integer.parseInt("1");
		numero = numero + 1;
		System.out.println(numero);
	}
}
