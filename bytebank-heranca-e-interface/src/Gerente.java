public class Gerente extends Funcionario implements Autenticavel {
	
	private InterfaceAutenticacao Autenticador;
	
	public Gerente() {
		this.Autenticador = new InterfaceAutenticacao();
	}
	
	@Override
	public void setSenha(int senha) {
		this.Autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.Autenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando Método de bonificação do GERENTE!");
		return super.getSalario();
	}
}