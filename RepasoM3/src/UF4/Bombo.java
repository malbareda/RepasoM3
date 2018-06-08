package UF4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class Bombo {
	/*
	 * 1. Leer el fichero
	 * 2. Crear clases a partir de lo que has leido
	 */
	public static void main(String[] args) {
		
		try {
			File f = new File("paises.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			int ranking =1;
			Seleccion[][] bombo = new Seleccion[8][4];
			/*Seleccion[] selecciones = new Seleccion[32];
			while(br.ready()) {
				String pais=br.readLine();
				Seleccion sel = new Seleccion(pais,ranking);
				ranking++;
			}*/
			
			/*for(int i=0;i<8;i++) {
				for(int j=0;j<4;j++) {
					String pais=br.readLine();
					Seleccion sel = new Seleccion(pais,ranking);
					ranking++;
					bombo[i][j]=sel;
				}
			}
			
			for(int i=0;i<8;i++) {
				for(int j=0;j<4;j++) {
					System.out.print(bombo[i][j].name+" ");
				}System.out.println();
			}*/
			
			
			FileOutputStream fos = new FileOutputStream("equipos.escroto");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			while(br.ready()) {
				String pais=br.readLine();
				Seleccion sel = new Seleccion(pais,ranking);
				ranking++;
				oos.writeObject(sel);
				
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
