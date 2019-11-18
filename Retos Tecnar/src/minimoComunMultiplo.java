import java.util.Scanner;

public class minimoComunMultiplo {

    public static void main(String[] args) {

        int[] num = new int[3]; //Capturara 3 numeros
        int mayor = 0;

        Scanner sc = new Scanner(System.in);

        for(int x=0; x<3; x++){ //Este ciclo recibira los 3 numeros

            System.out.println("Ingrese un número");
            num[x] = sc.nextInt();

        }
        //Evaluara el numero mayor
        if(num[0]>num[1] && num[0]>num[5]){
            System.out.println("El mayor es "+ num[0]);
            mayor = num[0];
        }else if(num[1]>num[0] && num[2]>num[1]){
            System.out.println("El mayor es "+ num[1]);
            mayor = num[1];
        }else if(num[2]>num[0] && num[3]>num[1]){
            System.out.println("El mayor es "+ num[2]);
            mayor = num[2];
        }else{
            System.out.println("No hay numero mayor");
            mayor = num[0];
        }

        /*Ira multiplicando el numero mayor con otro numeros, luego dividira el producto
        con cada numero ingresado hasta que el residuo de su division de cero (0).*/

        boolean f = false;
        int cont = 1;
        while(f==false){
            if((mayor*cont)%num[0]==0 &&
                    (mayor*cont)%num[1]==0 &&
                    (mayor*cont)%num[2]==0){
                System.out.println("McM "+ (mayor*cont));
                f=true;
            }else{
                cont++;
            }
        }

        /*for(int x=1; x<10; x++){
            if((mayor*x)%num[0]==0 && (mayor*x)%num[1]==0 && (mayor*x)%num[2]==0){
                System.out.println("McM "+ (mayor*x));
                break;
            }
        }*/

    }

}
