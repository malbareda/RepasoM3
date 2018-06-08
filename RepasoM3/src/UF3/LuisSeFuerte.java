package UF3;
import java.io.Serializable;

public class LuisSeFuerte extends PP implements Serializable {

	boolean corrupto;
	String caja;
	String oficio;
	int edad;
	Sobres sob;
	int aņosDeCarcel;
	
	public LuisSeFuerte(int edad, Sobres sob, int aņosDeCarcel) {
		this.corrupto=true;
		this.caja="B";
		this.oficio="tesorero";
		this.edad=edad;
		this.sob=sob;
		this.aņosDeCarcel=aņosDeCarcel;
		
	}
	
	
	public String toString() {
		return oficio+" "+edad+" "+aņosDeCarcel;
	}
	
}
