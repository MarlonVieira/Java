
public class TestaBanco {
	
	public static void main(String[] args) {
	
		Cliente marlon = new Cliente();
		
//		marlon.nome = "Marlon";
		marlon.cpf = "222-222-222-22";
		marlon.profissao = "Programador";
		
		Conta contaDoMarlon = new Conta();
		
		contaDoMarlon.deposita(1200);
		contaDoMarlon.titular = marlon;
		
		System.out.println(contaDoMarlon.titular.nome);
		System.out.println(contaDoMarlon.titular);
		System.out.println(marlon);
	}
	
}
