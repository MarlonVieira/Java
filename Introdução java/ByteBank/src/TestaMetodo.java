
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaMarlon = new Conta();
		contaMarlon.saldo = 100;
		
		contaMarlon.deposita(50);
		
		System.out.println(contaMarlon.saldo);
		
		boolean conseguiuRetirar = contaMarlon.saca(50);
		
		System.out.println(contaMarlon.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMilena = new Conta();
		contaMilena.saldo = 1000;
		
		if (contaMilena.transfere(200, contaMarlon)) {
			System.out.println("Transferência feita");
		} else {
			System.out.println("Ocorreu um erro na transferência");
		}
		
		System.out.println(contaMarlon.saldo);
		System.out.println(contaMilena.saldo);
		
		contaMarlon.titular = "Marlon";
		
		System.out.println(contaMarlon.titular);
	}
}
