package extremos;

/**
  * @author Jhoel Alexander Narváez Valarezo
 */
public final class M3JhoNar implements IntEJhoNar{

  /**
   * 
   * @param a
   * @return número entero mínimo
   */
    /*
    genera un entero con el valor maximo, 
    para que en la comparacion recoja cualquier
    hace un bucle, comparando los nums del array
    y guarda el más pequeño
    */
   @Override
    public int min(int[] a) {
       int min= Integer.MAX_VALUE;
        for (int i : a) { min= Math.min(min, i); }
       return min;
    }
  /**
   * 
   * @param a
   * @return número entero máximo
   */
    @Override
    public int max(int[] a) {
       int max= Integer.MIN_VALUE;
        for (int i : a) { max= Math.max(max, i); }
       return max;
    }
  /**
   * 
   * @param a
   * @return número decimal mínimo
   */
    @Override
    public double min(double[] a) {
       double min= Double.MAX_VALUE;
        for (double i : a) { min= Math.min(min, i); }
       return min;
    }
  /**
   * 
   * @param a
   * @return número decimal máximo
   */
    @Override
    public double max(double[] a) {
       double max= Double.MIN_VALUE;
        for (double i : a) { max= Math.max(max, i); }
       return max;
    }


}
