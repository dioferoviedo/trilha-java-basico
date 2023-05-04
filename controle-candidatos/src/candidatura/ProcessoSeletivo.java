package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatosSelecionados = {"DIOFER","JOÃO","GABRIELA","ILAYDA","ANALICE","SILVAMA"};
        for (String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
        }
    }
        static void entrandoEmContato(String entrandoEmContato) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
            while(continuarTentando && tentativasRealizadas < 3);
            if (atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + entrandoEmContato + " NA " + tentativasRealizadas + " TENTATIVA");
            else System.out.println("NÃO CONSEGUIMOS CONTATO COM " + entrandoEmContato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
        //método auxiliar
        static boolean atender() {
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados() {
        String [] candidatos = {"DIOFER","JOÃO","GABRIELA","ILAYDA","ANALICE","SILVAMA"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada usando for each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }

    }
    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String [] candidatos = {"DIOFER","JOÃO","GABRIELA","ILAYDA","ANALICE","SILVAMA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor " + salarioPretendido);
            if(salarioBase >= salarioPretendido ){
                System.out.println("O candidato "  + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
