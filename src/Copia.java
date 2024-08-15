public class Copia {
   public static void main(String[] args) {
      Numero uno = new Numero();
      uno.num = 10;
      Numero dos = new Numero();
      dos.num = 20;
      System.out.println("\n" + uno.hashCode() + " Hashcode de Uno y su valor es: " + uno.num);
      System.out.println(dos.hashCode() + " Hashcode de Dos y su valor es: " + dos.num);

      System.out.println("\n       *** copia(uno,dos) ***");
      Numero.copia(uno, dos);
      System.out.println(uno.hashCode() + " Hashcode de Uno y su valor es: " + uno.num);
      System.out.println(dos.hashCode() + " Hashcode de Dos y su valor es: " + dos.num);

      System.out.println("\n       *** modificación de uno ***");
      uno.num = 1000;
      System.out.println("valor nuevo en Uno: " + uno.num);
      System.out.println("valor nuevo en Dos: " + dos.num);

      System.out.println("\n       *** clonacion(uno,dos) ***");
      Numero.clonacion(uno, dos);
      System.out.println("       ###### Fuera del método ######");
      System.out.println(uno.hashCode() + " Hashcode de Uno y su valor es: " + uno.num);
      System.out.println(dos.hashCode() + " Hashcode de Dos y su valor es: " + dos.num);

      System.out.println("\n       *** asignacion uno = dos ***");
      uno = dos;
      System.out.println(uno.hashCode() + " Hashcode de Uno y su valor es: " + uno.num);
      System.out.println(dos.hashCode() + " Hashcode de Dos y su valor es: " + dos.num);
   }
}

class Numero {
   public int num;

   public static void copia(Numero origin, Numero destino) {
      destino.num = origin.num;
   }

   public static void clonacion(Numero origin, Numero destino) {
      destino = origin;
      System.out.println("       ###### Dentro del método ######");
      System.out.println(origin.hashCode() + " Hashcode de Origen y su valor es: " + origin.num);
      System.out.println(destino.hashCode() + " Hashcode de Destino y su valor es: " + destino.num);
      origin.num = 5000;
      System.out.println("        Dentro del método, modificando valor de origen");
      System.out.println(origin.hashCode() + " Hashcode de Origen y su valor es: " + origin.num);
      System.out.println(destino.hashCode() + " Hashcode de Destino y su valor es: " + destino.num);
   }
}
