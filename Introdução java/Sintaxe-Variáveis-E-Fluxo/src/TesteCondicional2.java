
public class TesteCondicional2 {

	public static void main(String[] args) {
		System.out.println("Test conditionals");
		
		int idade = 19;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade > 18 && acompanhado) {
			System.out.println("Voce tem mais de 18 anos");
		} else if (idade == 18 ){			
			System.out.println("Voce tem 18 anos");
		} else		
			System.out.println("Voce tem menos de 18 anos");
			
		
	}
}
