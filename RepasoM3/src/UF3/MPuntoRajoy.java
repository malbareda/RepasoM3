package UF3;
import java.io.Serializable;

public class MPuntoRajoy extends PP implements Serializable {


	boolean corrupto;
	String color;
	String oficio;
	int edad;
	Sobres sob;
	int vecinos;
	
	public MPuntoRajoy(int edad, Sobres sob, int vecinos) {
		this.corrupto=true;
		this.color="azul";
		this.oficio="¿y la Europea?";
		this.edad=edad;
		this.sob=sob;
		this.vecinos=vecinos;
		
	}
	
	
	public String toString() {
		return oficio+" "+edad+" "+vecinos;
	}
	
}
