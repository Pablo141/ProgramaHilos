import java.util.*;
public class HiloPotencia extends Thread{
   @Override
   public void run(){
      double potencia = 0;
      ProgramaHilos vector = new ProgramaHilos();
      int[] vectorPotencia = vector.llenado();
      for(int x = 0; x < vectorPotencia.length; x++){
         potencia = potencia + (Math.pow(vectorPotencia[x],2));
      }
      System.out.println("La suma del cuadrado de los numeros es " + potencia);
   }
}