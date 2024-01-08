
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1, 12);
		
		conta.setNumero(1);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		
		Cliente marlon = new Cliente();
//		conta.titular = marlon;
		
		marlon.setCpf("222-222-222-22");
		marlon.setNome("Marlon");
		marlon.setProfissao("Programer");
		
		conta.setTitular(marlon);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		
		conta.getTitular().setProfissao("Diarista");
		
		System.out.println(conta.getTitular().getProfissao());
	}
}
