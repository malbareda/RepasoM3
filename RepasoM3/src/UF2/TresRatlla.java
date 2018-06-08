package UF2;
import java.util.Scanner;

public class TresRatlla {
	
	static Scanner sc = new Scanner(System.in);
	static boolean turno;
	static char[][] tablero;
	static int victoria;

	public static void main(String[] args) {
		
		inicio();
		
		while(victoria==1) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			turno = ponerficha(x,y,turno,tablero);
			victoria = comprobar();
		}
		
	}

	private static int comprobar() {
		for(int f=0;f<3;f++) {
			if(tablero[f][0]=='X'&&tablero[f][1]=='X'&&tablero[f][2]=='X') {
				return 2;
			}
			if(tablero[f][0]=='O'&&tablero[f][1]=='O'&&tablero[f][2]=='O') {
				return 3;
			}
		}
		for(int c=0;c<3;c++) {
			if(tablero[0][c]=='X'&&tablero[1][c]=='X'&&tablero[2][c]=='X') {
				return 2;
			}
			if(tablero[0][c]=='O'&&tablero[1][c]=='O'&&tablero[2][c]=='O') {
				return 3;
			}
		}
		for(int f=0;f<3;f++) {
			for(int c=2;c>=0;c--) {
				
			}
		}
		return 0;
		
			
	}

	private static boolean ponerficha(int x, int y, boolean turno2, char[][] tablero2) {
		if(turno) {
			tablero[x][y]='X';
			return false;
		}else {
			tablero[x][y]='O';
			return true;
		}
		
	}

	private static void inicio() {
		// TODO Auto-generated method stub
		tablero = new char[3][3];
		for (int f = 0; f < 3; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 3; c++) {
                tablero[f][c]=' ';
            }
        }
		turno = false;
		victoria = 1;
		
	}
}
