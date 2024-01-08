
public class CriaConta {

	public static void main(String[] args) {
	 
	 Conta primeiraConta = new Conta();
	 //primeiraConta.agencia = 10;
	 primeiraConta.numero = 123;
	 primeiraConta.saldo = 1200;
	 //primeiraConta.titular = "Marlon";
	 
	 System.out.println(primeiraConta.saldo);
	 
	 primeiraConta.saldo += 100;
	 
	 System.out.println(primeiraConta.saldo);
	 
	 Conta segundaConta = new Conta();
	 segundaConta = primeiraConta;
	 
	 System.out.println(segundaConta.saldo);
	 
	 System.out.println(primeiraConta.agencia);
	 System.out.println(primeiraConta.titular);
	}
}
