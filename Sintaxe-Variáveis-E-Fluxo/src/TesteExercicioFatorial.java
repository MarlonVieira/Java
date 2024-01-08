
public class TesteExercicioFatorial {
	public static void main(String[] args) {
		int Result=0;
		for (int i = 0; i < 11; i++) {
			Result = Result*i;
			if (Result == 0) {
				Result = 1;
			}  
		System.out.println(Result);
		}
	}
}

