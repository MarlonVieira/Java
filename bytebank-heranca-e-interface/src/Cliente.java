
public class Cliente implements Autenticavel {

	private InterfaceAutenticacao Autenticador;
	
	public Cliente() {
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
}