public class Copia {
   public static void main(String[] args) {
      Numero uno = new Numero();
      uno.num = 10;
      Numero dos = uno;
      dos.num = 20;
      Numero.copia(uno, dos);
      System.out.println("\n"+uno.hashCode()+"de Uno y su valor es: "+ uno.num);
      System.out.println(dos.hashCode()+"de Dos y su valor es: "+ dos.num);
      uno.num= 1000;
      System.out.println("valor nuevo en Uno: "+uno.num);
      System.out.println("valor nuevo en Dos: "+dos.num);

   }
}

class Numero {
   public int num;

   public static void copia(Numero origin, Numero destino){
      destino.num = origin.num;
   }
   public static void clonacion(Numero origin, Numero destino){
      destino = origin;
   }
}
