
public class Testiii {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Clide");
		g1.setSalario(5000);

		Gerente f = new Gerente();
		f.setSalario(2000);
		
		ControlBonification controle = new ControlBonification();
		controle.register(g1);
		controle.register(f);
		
		System.out.println(controle.getSoma());
	}
}
