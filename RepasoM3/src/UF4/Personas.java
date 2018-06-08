package UF4;

public abstract class Personas {
	
	String nombre;
	Seleccion sel;
	
	public Personas(String nombre, Seleccion sel) {
		
		this.nombre=nombre;
		this.sel=sel;
	}
	
	public abstract void morirse();

}
