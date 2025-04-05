
public class TesteConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario;
		
		System.out.println(valor);
		
		long numeroGrande = 3232141232l;
		short valorPequeno = 2131;
		byte b = 127;		
		System.out.println(numeroGrande);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		System.out.println(b);
		
		System.out.println(valorPequeno);
	}
	
}
