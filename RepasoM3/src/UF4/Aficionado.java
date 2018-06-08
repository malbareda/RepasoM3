package UF4;

public class Aficionado extends Personas{

	boolean borracho;
	
	public Aficionado(String nombre, Seleccion sel) {
		super(nombre, sel);
		if(this.sel.name.equals("Inglaterra")||this.sel.name.equals("Rusia")) {
			borracho=true;
		}else {
			borracho=false;
		}
	}

	@Override
	public void morirse() {
		// TODO Auto-generated method stub
		
	}

}
