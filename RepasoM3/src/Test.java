
public class Test {

	static void guauguau() {
		System.out.println("guau guau");
	}
	
	
	
	static int fact(int elNumero) {
		int accf = 1;
		for(int k = elNumero;k!=0;k--) {
			accf = accf*k;
		}
		return accf;
	}
	
	public static void main(String[] args) {
		/**
		 * Declaracion
		 *   static t_retorno nombre(t_arg n_arg, t_arg2 n_arg2,...){
		 * Llamada
		 *   nombre(arg1, arg2, ...);
		 */
		
		guauguau();
		System.out.println(fact(6));
		
	}
}
