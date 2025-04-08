public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setSalario(3000.0);
		
		Gerente nico = new Gerente();

		nico.setNome("Marlin");
		nico.setCpf("223355646-9");
		nico.setSalario(2590.80);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}