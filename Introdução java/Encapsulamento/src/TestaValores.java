
public class TestaValores {

	public static void main(String[] args) {		
		Conta conta = new Conta(12, 13);		
		
		System.out.println(conta.getAgencia());
		
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(15, 22);
		
		System.err.println(conta2.getAgencia());
		System.out.println(Conta.getTotal());
	}
}
