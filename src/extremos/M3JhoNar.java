package extremos;

/**
  * @author Jhoel Alexander Narv�ez Valarezo
 */
public final class M3JhoNar implements IntEJhoNar{

  /**
   * genera un entero con el valor maximo, 
   * para que en la comparacion recoja cualquier
   * hace un bucle, comparando los nums del array
   * y guarda el m�s peque�o
   * @param array
   * @return n�mero entero m�nimo
   */

   @Override
    public int min(int[] array) {
       int min= Integer.MAX_VALUE;
        for (int i : array) { min= Math.min(min, i); }
       return min;
    }
  /**
   * 
   * @param array
   * @return n�mero entero m�ximo
   */
    @Override
    public int max(int[] array) {
       int max= Integer.MIN_VALUE;
        for (int i : array) { max= Math.max(max, i); }
       return max;
    }
  /**
   * 
   * @param array
   * @return n�mero decimal m�nimo
   */
    @Override
    public double min(double[] array) {
       double min= Double.MAX_VALUE;
        for (double i : array) { min= Math.min(min, i); }
       return min;
    }
  /**
   * 
   * @param array
   * @return n�mero decimal m�ximo
   */
    @Override
    public double max(double[] array) {
       double max= Double.MIN_VALUE;
        for (double i : array) { max= Math.max(max, i); }
       return max;
    }


}
