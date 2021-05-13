/*
Pablo Vega Cibrian
Ingenieria en Sistemas Computacionales
4to Semestre
*/
import java.util.*;
public class ProgramaHilos{
   public static int vec[] = new int[10];
   public static int x = 0;
   public static void main(String args[]){
      HiloSuma suma = new HiloSuma();
      HiloPotencia potencia = new HiloPotencia();
      HiloPromedio promedio = new HiloPromedio();
      suma.start();
      potencia.start();
      promedio.start();
   }
   public static int[] llenado(){
      for(x = 0; x < vec.length; x++){
         vec[x] = (int)(Math.random() * 10 + 1);
      }
      return vec;
   }
}