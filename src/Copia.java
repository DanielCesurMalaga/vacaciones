public class Copia {
   public static void main(String[] args) {
      Numero num1 = new Numero(10);
      Numero num2 = new Numero(20);
      System.out.println();
      System.out.println("num1: "+num1.hashCode()+", valor: "+num1.num);
      System.out.println("num2: "+num2.hashCode()+", valor: "+num2.num);
      num2 = num1;

      System.out.println("num1: "+num1.hashCode()+", valor: "+num1.num);
      System.out.println("num2: "+num2.hashCode()+", valor: "+num2.num);

      num2.num = 50;
      System.out.println("num1: "+num1.hashCode()+", valor: "+num1.num);
      System.out.println("num2: "+num2.hashCode()+", valor: "+num2.num);
   }
}

class Numero {
   public int num;

   public Numero(int num) {
      this.num = num;
   }

   public static void copia(Numero origin, Numero destino){
      destino.num = origin.num;
   }

   public static void clonacion(Numero origin, Numero destino){
      destino = origin;
   }

}
