
class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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

}