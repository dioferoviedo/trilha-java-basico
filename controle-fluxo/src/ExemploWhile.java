// ExemploWhile.java
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
    public class ExemploWhile {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
	        double mesada = 50.0;

            while(mesada>0) {
                Double valorDoce = valorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada;

                System.out.printf("Doce do valor: %.2f%n", valorDoce, " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2,9);
   }
}