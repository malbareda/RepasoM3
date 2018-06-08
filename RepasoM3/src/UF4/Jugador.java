package UF4;

public class Jugador extends Personas {

	String posicion;
	
	public Jugador(String nombre, Seleccion sel, String posicion ) {
		super(nombre, sel);
		this.posicion=posicion;
		
	}

	@Override
	public void morirse() {
		// TODO Auto-generated method stub
		
	}

}
