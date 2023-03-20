package extremos;

/**
  * @author Jhoel Alexander Narváez Valarezo
 */
public final class M3JhoNar implements IntEJhoNar{

  /**
   * genera un entero con el valor maximo, 
   * para que en la comparacion recoja cualquier
   * hace un bucle, comparando los nums del array
   * y guarda el más pequeño
   * @param array
   * @return número entero mínimo
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
   * @return número entero máximo
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
   * @return número decimal mínimo
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
   * @return número decimal máximo
   */
    @Override
    public double max(double[] array) {
       double max= Double.MIN_VALUE;
        for (double i : array) { max= Math.max(max, i); }
       return max;
    }


}
