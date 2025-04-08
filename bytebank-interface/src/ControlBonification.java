
public class ControlBonification {

	private double soma;
	
		public void register(Gerente m) {
			double boni = m.getBonificacao();
			this.soma = this.soma + boni;
		}
		
		public void register(Funcionario f) {
			double boni = f.getBonificacao();
			this.soma = this.soma + boni;
		}
		
		public void register(EditorVideo ev) {
			double boni = ev.getBonificacao();
			this.soma = this.soma + boni;
		}
		
	public double getSoma() {
		return soma;
	}
}
