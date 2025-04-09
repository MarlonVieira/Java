
public class TesteTributaveis {

	public static void main(String[] args) {
	 ContaCorrente cc = new ContaCorrente(222, 333);
	 cc.deposita(300);
	 
	 SeguroDeVida seguro = new SeguroDeVida();
	 
	 CalculadorDeImposto ci = new CalculadorDeImposto();
	 ci.registra(seguro);
	 ci.registra(cc);
	 
	 System.out.println(ci.getTotalImposto());
	}
}