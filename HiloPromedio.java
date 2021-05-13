public class HiloPromedio extends Thread{
   @Override
   public void run(){
      double promedio = 0;
      ProgramaHilos vector = new ProgramaHilos();
      int[] vectorPromedio = vector.llenado();
      for(int x = 0; x < vectorPromedio.length; x++){
         promedio = promedio + vectorPromedio[x];
      }
      promedio = promedio / vectorPromedio.length;
      System.out.println("El promedio de los numeros es " + promedio);
   }
}