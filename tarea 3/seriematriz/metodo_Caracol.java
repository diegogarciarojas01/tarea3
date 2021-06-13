public class metodo_Caracol{
    public static void main(String[] args){
        int n=5;
        String [] [] matriz = new String [n] [n];
        int c=0;
        int d= n-1;
        int valor=0;
        for (int f = 0; f < matriz.length; f++){
        //llenar la fila superior 
        for (int i = c; i <= d; i++){
            matriz[c][i] = valor++ + " ";
        }
        //llenar la columna del extremo derecho
        for (int i = c+1; i <= d; i++){
            matriz [i][d] = valor++ + " ";
        }
        //llenar la fila inferior
        for (int i = d-1; i >= c; i--){
            matriz[d][i] = valor++ + " ";
        }
        //llenamos la columna del extremo izquierdo de abajo hacia arriba
        for(int i = d-1; i >= c+1; i--){
            matriz[i][c] = valor++ + " ";
        }
        c++; d--;
    }//fin ciclo externo
    //mostrar la matriz
    for (int h = 0; h < matriz.length; h++){
        for (int i = 0; i < matriz[h].length; i++){
            System.out.println(matriz[h][i]);
        }
        System.out.println();//cambio de fila, salto de linea
    }
   }
}
