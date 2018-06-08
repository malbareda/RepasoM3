package UF4;

public class Tecnico extends Personas{

	int edad;
	boolean negatiffo = true;
	
	public Tecnico(String nombre, Seleccion sel, int edad) {
		super(nombre, sel);
		this.edad=edad;
		
		
	}

	@Override
	public void morirse() {
		// TODO Auto-generated method stub
		
	}

}
