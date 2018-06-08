package UF4;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Eliminatorias {

	
	public static void main(String[] args) {
		Seleccion[] octavos = new Seleccion[16];
		try {
			FileInputStream fis = new FileInputStream("equipos.escroto");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			int contador=0;
			while(true) {
				Seleccion sel1 = (Seleccion) ois.readObject();
				Seleccion sel2 = (Seleccion) ois.readObject();
				boolean victoria = partido(sel1,sel2);
				if(victoria) {
					System.out.println("ha ganado "+sel1.name);
					octavos[contador]=sel1;
				}else {
					System.out.println("ha ganado "+sel2.name);
					octavos[contador]=sel2;
				}
				contador++;
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Fin de fichero");
		}
		
		Seleccion[] cuartos = new Seleccion[8];
		for(int i=0;i<8;i++) {
			Seleccion sel1 = octavos[i*2];
			Seleccion sel2 = octavos[i*2+1];
			boolean victoria = partido(sel1,sel2);
			if(victoria) {
				System.out.println("ha ganado "+sel1.name);
				cuartos[i]=sel1;
			}else {
				System.out.println("ha ganado "+sel2.name);
				cuartos[i]=sel2;
			}
		}
		
		Seleccion[] semis = new Seleccion[4];
		for(int i=0;i<4;i++) {
			Seleccion sel1 = cuartos[i*2];
			Seleccion sel2 = cuartos[i*2+1];
			boolean victoria = partido(sel1,sel2);
			if(victoria) {
				System.out.println("ha ganado "+sel1.name);
				semis[i]=sel1;
			}else {
				System.out.println("ha ganado "+sel2.name);
				semis[i]=sel2;
			}
		}
		
		Seleccion[] finales = new Seleccion[2];
		for(int i=0;i<2;i++) {
			Seleccion sel1 = semis[i*2];
			Seleccion sel2 = semis[i*2+1];
			boolean victoria = partido(sel1,sel2);
			if(victoria) {
				System.out.println("ha ganado "+sel1.name);
				finales[i]=sel1;
			}else {
				System.out.println("ha ganado "+sel2.name);
				finales[i]=sel2;
			}
		}
		Seleccion campeon;
		boolean victoria = partido(finales[0],finales[1]);
		if(victoria) {
			System.out.println("Campeon Del Mundial "+finales[0].name);
			campeon=finales[0];
		}else {
			System.out.println("Campeon Del Mundial "+finales[1].name);
			campeon=finales[1];
		}
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream("Palmares",true);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(campeon.rankingFIFA);
			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	


	private static boolean partido(Seleccion sel1, Seleccion sel2) {
		Random r = new Random();
		boolean v = r.nextBoolean();
		return v;
	}
}
