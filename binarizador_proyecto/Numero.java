
/**
 * ejemplo de programa recursivo
 * convierte entero en representacion binaria
 * 
 * @author javier vásquez
 * @version 1 del 7 de junio 2021
 */
public class Numero
{
    /**
     * @param n=numero en proceso de conversion a binario
     * @return hilera que representa num binario
       */
    
    public String toBinary(int n){
        //condicion de parada
        if (n<=1)
            return ""+n;
        else
        //llamado recursivo. Concatenacion por backtracking
            return toBinary(n/2)+n%2;
    }

    public static void main (String a[]){
        //Test de funcionalidad
        Numero n=new Numero();

        System.out.println("13 en binario es "+n.toBinary(13));
    }
}
