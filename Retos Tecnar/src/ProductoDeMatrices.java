import java.util.Scanner;

public class ProductoDeMatrices {

    public static void main(String[] args) {
        int filas_matrizA, columnas_matrizA, filas_matrizB, columnas_matrizB;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de filas de la matriz A");
        filas_matrizA = sc.nextInt();
        System.out.println("Ingrese numero de columnas de la matriz A");
        columnas_matrizA = sc.nextInt();

        int[][] matrizA = new int[filas_matrizA][columnas_matrizA];


        System.out.println("Ingrese numero de filas de la matriz B");
        filas_matrizB = sc.nextInt();
        System.out.println("Ingrese numero de columnas de la matriz B");
        columnas_matrizB = sc.nextInt();

        int[][] matrizB = new int[filas_matrizB][columnas_matrizB];


        System.out.println("Matriz A:");
        llenarMatriz(filas_matrizA, columnas_matrizA, sc, matrizA);
        System.out.println("Matriz B:");
        llenarMatriz(filas_matrizB, columnas_matrizB, sc, matrizB);

        System.out.println("Matriz A:");
        mostrarMatriz(filas_matrizA, columnas_matrizA, matrizA);
        System.out.println();
        System.out.println("Matriz B");
        mostrarMatriz(filas_matrizB, columnas_matrizB, matrizB);

        System.out.println("Matriz producto:");
        productoMatriz(columnas_matrizB, filas_matrizA, matrizA, matrizB, sc);

    }

    private static void productoMatriz(int columnas_matrizB, int filas_matrizA, int[][] matrizA, int[][]matrizB, Scanner sc){
        int[][] producto = new int[filas_matrizA][columnas_matrizB];
        for (int x=0; x<columnas_matrizB; x++){
            for (int i=0; i<filas_matrizA; i++){
                producto[x][i]= (matrizA[x][i]*matrizB[i][0]);
                System.out.print("[" + producto[x][i] + "] ");
            }
            System.out.println();
        }

    }

    private static void mostrarMatriz(int filas_matriz, int columnas_matriz, int [][] matriz){
        for (int x=0; x<filas_matriz; x++){
            for (int i=0; i<columnas_matriz; i++){
                System.out.print("["+ matriz[x][i] + "] ");
            }
            System.out.println();
        }
    }

    private static void llenarMatriz(int filas_matriz, int columnas_matriz, Scanner sc, int[][] matriz) {
        for (int x=0; x<filas_matriz; x++){
            for (int i=0; i<columnas_matriz; i++){
                System.out.println("Ingrese valor ["+x+"]"+ " ["+i+"]");
                matriz[x][i] = sc.nextInt();
            }
        }
    }
}
