package UF3;
import java.io.Serializable;

public class LuisSeFuerte extends PP implements Serializable {

	boolean corrupto;
	String caja;
	String oficio;
	int edad;
	Sobres sob;
	int añosDeCarcel;
	
	public LuisSeFuerte(int edad, Sobres sob, int añosDeCarcel) {
		this.corrupto=true;
		this.caja="B";
		this.oficio="tesorero";
		this.edad=edad;
		this.sob=sob;
		this.añosDeCarcel=añosDeCarcel;
		
	}
	
	
	public String toString() {
		return oficio+" "+edad+" "+añosDeCarcel;
	}
	
}
