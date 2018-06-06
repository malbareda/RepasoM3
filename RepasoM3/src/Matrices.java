import java.util.Scanner;
 
public class Matrices {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        ///// CONSTRUIR UNA MATRIZ
        int[][] mat = new int[5][6];
        Scanner sc = new Scanner(System.in);
        /// CON NUMEROS ALEATORIOS
        for (int f = 0; f < 5; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 6; c++) {
                int random = (int) (Math.random() * 10);
                mat[f][c] = random;
            }
        }
 
        /// CON NUMEROS QUE TE ENTRAN POR TECLADO
 
        /*
         * for(int f = 0; f<5; f++) { ///PRIMERO FILAS LUEGO COLUMNAS for (int c = 0 ;
         * c<6 ; c++) { mat[f][c] = sc.nextInt(); } }
         */
 
        /// CON NUMEROS CONCURRENTES
        /*
         * int contador = 0; for(int f = 0; f<5; f++) { ///PRIMERO FILAS LUEGO COLUMNAS
         * for (int c = 0 ; c<6 ; c++) { mat[f][c] = contador; contador++; } }
         */
 
        ///// IMPRIMIR MATRIX
        String ac = "";
        for (int f = 0; f < 5; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 6; c++) {
                ac = ac + mat[f][c] + " ";
            }
            ac = ac + "\n";
        }
        System.out.println(ac);
 
        //// BUSCAR EN MATRIZ (CUANTOS SIETES HAY)
        int sietes = 0;
        for (int f = 0; f < 5; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 6; c++) {
                if (mat[f][c] == 7) {
                    sietes++;
                }
            }
        }
        System.out.println("hay "+sietes+" sietes");
       
       
       
        //// MODIFICAR MATRIZ (TODO ES SIETE)
        sietes = 6;
        for (int f = 0; f < 5; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 6; c++) {
                mat[f][c] = sietes;
                mat[f][c]++;
            }
        }
       
       
        ac = "";
        for (int f = 0; f < 5; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 6; c++) {
                ac = ac + mat[f][c] + " ";
            }
            ac = ac + "\n";
        }
        System.out.println(ac);
       
       
       
       
       
       
       
       
        /////BOMBA (las que rodeen son ceros)
       
        int fila = 2;
        int columna = 3;
       
        mat[fila][columna] = 0;
        mat[fila+1][columna] = 0;
        mat[fila-1][columna] = 0;
        mat[fila][columna+1] = 0;
        mat[fila][columna-1] = 0;
        mat[fila+1][columna+1] = 0;
        mat[fila-1][columna-1] = 0;
        mat[fila+1][columna-1] = 0;
        mat[fila-1][columna+1] = 0;
       
       
        ac = "";
        for (int f = 0; f < 5; f++) { /// PRIMERO FILAS LUEGO COLUMNAS
            for (int c = 0; c < 6; c++) {
                ac = ac + mat[f][c] + " ";
            }
            ac = ac + "\n";
        }
        System.out.println(ac);
    }
 
}