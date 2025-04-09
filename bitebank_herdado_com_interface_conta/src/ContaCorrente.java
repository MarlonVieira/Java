
public class ContaCorrente extends Conta implements InterfaceTributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor+0.1;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}