
/**
 * Write a description of class binarizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numero
{
    public String toBinary(int n){
        if (n<=1)
            return ""+n;
        else
            return toBinary(n/2)+n%2;
    }
    
    public static void main (String a[]){
        //Test de funcionalidad
        Numero n=new Numero();
        
        System.out.println("13 en binario es "+n.toBinary(13));
    }
}
