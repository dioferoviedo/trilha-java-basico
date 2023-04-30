public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays o indice inicia em ZERO
        String alunos[] = {"DIOFER", "NATHALIA", "JOÃO", "GABRIELA"};   

     for (int x=0; x<alunos.length; x++){
        System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        
        //
        // outra forma e mais sútil de trabalhar com arrays:
        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);;
        }

     }
    }
}
