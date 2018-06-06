import java.util.ArrayList;
import java.util.Scanner;

public class If {
	
	
	public static void main(String[] args) {
		
		//primitivos
		int i=0;
		double d;
		boolean b;
		char c;
		int a=10;
		//pseudo-primitivos
		String s;
		//ArrayList<Integer> list;
		
		//instrucciones aritmeticas
		//i es 0
		i = 4+5;
		//i 9
		i = i+i;  //i+=i;
		//i 18
		i++;
		//i 19
		i= 5*2;
		//i 10;
		i = i/2;
		// i 5
		i = 3000001%3;
		//par o impar
		i = a%2;
		
		//instrucciones logicas
		int x=5;
		int y=10;
		
		b = x>y;
		System.out.println(b);
		
		x=x*3;
		System.out.println(b);
		b = x>y;
		System.out.println(b);
		
		
		/**
		 * Las lineas pueden empezar con tres cosas
		 * int a;   Declaración
		 * a = jkgbfgklse  Asignación
		 * funcion();    Invocación
		 */
		
		//IF
		
		/**
		 * 
		 * if (booleano){
		 *     cosa que pasara si ese booleano es true
		 * }else{
		 *     cosa que pasara si ese booleano NO es true
		 *     por tanto, es false
		 * }
		 * 
		 */
		
		y = 5;
		x = 5;
		int z = 10;
		
		if(y>x) {
			System.out.println("oye, y es mas grande que x");
		}else if(x>y){
			System.out.println("oye, es mas grande x");
		}else {
			System.out.println("oye, son iguales");
		}
		
		
		if(x>y) {
			if(x>z) {
				System.out.println("x!!");
			}else {
				System.out.println("z!!");
			}
		}else if(y>z) {
			System.out.println("y!!");
		}else {
			System.out.println("z");
		}
		
		c = 'e';
		// el or ||
		// el and &&
		if(c=='a'||c=='e'||c=='i') {
			System.out.println("es una vocal");
		}else {
			System.out.println("es una consonante");
		}
		
		int nota = 11;
		
		if(nota>0&&nota<=10) {
			System.out.println("es una nota valida");
		}else {
			System.out.println("es una nota invalida");
		}
		
		String dias = "JUERNES";
		switch(dias) {
		case "LUNES":
			System.out.println("es lunes");
			break;
		case "MARTES":
			System.out.println("es martes");
			break;
		case "MIERCOLES":
			System.out.println("es mierc");
			break;
		case "JUEVES":
			System.out.println("es jueves");
			break;
		default:
			System.out.println("Estas borracho");
		}
		
		
		/**
		 * Bucle for
		 * 
		 * for(condicion inicial;condicion de mantenimiento;paso){
		 * 		lo que quieras hacer
		 * 
		 * }
		 */
		
		
		for(int j=0;j<5;j++) {
			System.out.println("hola");
		}
		
		for(int j=0;j<5;j++) {
			System.out.println(j);
		}
		
		
		/**
		 * Contador : i
		 * Acumulador : acc = acc+algo;    acc+=algo;
		 */
		
		Scanner sc = new Scanner(System.in);
		//nota = sc.nextInt();
		System.out.println("nuestra nota es "+nota);
		
		int acc = 0;
		for(int k = 0; k<4; k++) {
			//nota = sc.nextInt();
			acc = acc + nota;
		}
		int resultado = acc/4;
		System.out.println("el resultado es: "+resultado);
		
		int fact = 6;
		int accf = 1;
		for(int k = fact;k!=0;k--) {
			accf = accf*k;
			System.out.println(k);
		}
		System.out.println("el factorial de "+fact+" es "+accf);
	}
	
	
	

}
