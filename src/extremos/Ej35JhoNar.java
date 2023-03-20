package extremos;

/**
 *
 * @author Jhoel Alexander Narv�ez Valarezo
 */
import java.util.Random;

public class Ej35JhoNar {

    public static void main(String[] args) {
        //para numeros aleatorios
        Random aleatorio = new Random();
        //inicializamos la clase math3
        M3JhoNar math3 = new M3JhoNar();
        // arrays
        int enteros[] = new int[10];
        double decimales[] = new double[10];
        //rellenar enteros
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = aleatorio.nextInt(51);
        }
        // rellenar decimales
        for (int i = 0; i < decimales.length; i++) {
            decimales[i] = aleatorio.nextDouble(51);
        }
        //mostramos
        System.out.println("Los n�meros decimales son:");
        for (double nums : decimales) {
            System.out.printf("%.1f  ", nums);
        }
        System.out.println();
        System.out.println("Los n�meros enteros son:");
        for (int nums : enteros) {
            System.out.print(nums+"  ");
        }
        System.out.println("\n");
        
        System.out.println("El n�mero entero m�ximo es: "+math3.max(enteros));        
        System.out.println("El n�mero entero m�nimo es: "+math3.min(enteros));
        System.out.printf("El n�mero decimal m�ximo es: %.1f\n",math3.max(decimales));
        System.out.printf("El n�mero decimal m�nimo es: %.1f\n",math3.min(decimales));
      
    }

}
