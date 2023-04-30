public class ExemploBreakContinue {
    public static void main(String[] args) {

        // break = para o fluxo.
        // continue = pula o elemento sinalizado.
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
            continue;

            System.out.println(numero);
        }
    }
    
}
