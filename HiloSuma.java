public class HiloSuma extends Thread{
   @Override
   public void run(){
      int suma = 0;
      ProgramaHilos vector = new ProgramaHilos();
      int[] vectorSuma = vector.llenado();
      System.out.println("Numeros:");
      for(int y = 0; y < vectorSuma.length; y++){
         System.out.println("numero [" + (y + 1) + "] = " + vectorSuma[y]);
      }
      for(int x = 0; x < vectorSuma.length; x++){
         suma = suma + vectorSuma[x];
      }
      System.out.println("La suma de los numeros es " + suma);
   }
}