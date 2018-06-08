package UF4;

import java.io.Serializable;

public class Seleccion extends Mundial implements Serializable{
	
	String name;
	int rankingFIFA;
	boolean eliminado;
	
	
	public Seleccion(String name, int ranking  ) {	
		this.name=name;
		this.rankingFIFA=ranking;
		this.eliminado=false;
	}

}
