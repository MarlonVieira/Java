
class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {	
		total++;
		this.setAgencia(agencia);
		this.setNumero(numero);
		
		System.out.println("O total de contas eh: "+ Conta.total);
		
		System.out.println("Estou criando uma conta: "+ this.numero);
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else System.out.println("Agência deve ter valor positivo");
			
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		} 
		else {
			System.out.println("Numero deve ter valor positivo");
		}
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;		
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else return false;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor)  {
			this.saca(valor);
			contaDestino.deposita(valor);
			return true;
	    } else return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}	
	
	public static int getTotal() {
		return Conta.total;
	}
	

}