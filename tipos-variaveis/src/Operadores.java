import javax.swing.text.StyledEditorKit.BoldAction;

public class Operadores {
    public static void main(String[] args) {
       boolean condicao1=false;

       boolean condicao2=false;

       if(condicao1 && condicao2){
        System.out.println("as duas são verdadeiras");
       }
       else if (condicao1 || condicao2) {
        System.out.println("uma das duas é verdadeira");
       }
       else{
        System.out.println("nenhuma é");
       }

       System.out.println("fim");
    }
}
