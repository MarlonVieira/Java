
public class TesteWhile {

	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			if((contador%2)==0) {
				System.out.println(contador);}
			//contador = contador + 1;
			//contador += 1;
			
			++contador;
		}
		//System.out.println(contador);
	}
}
