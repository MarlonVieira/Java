
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou) { 
			System.out.println("Usuário logou com sucesso!");
		} else {
			System.out.println("Usuário não encontrado!");
		}
	}
}