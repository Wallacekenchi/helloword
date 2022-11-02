package capitulo4;

public class capitulo4 {
    public static void main(String[] args) {
        int numero = 2;
        int divisores = 0;

       for (int i = 1; i<=numero; i++) {
           if (numero % 1 == 0) {
               divisores++;
               // System.out.println(i);
           }
       }

          if (divisores >2 || numero == 0 || numero == 1){
              System.out.println(numero + " nao é primo");
          } else {
              System.out.println( numero + " é primo");
          }
}
}
