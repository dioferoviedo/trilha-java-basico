import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double saldo = 35.75;
        System.out.println("Insira o valor desejado para saque: ");
        Double valorSolicitado = sc.nextDouble(); 

        if (valorSolicitado > saldo) 
            System.out.println("Saldo insuficiente.");
        

        else 
            saldo = saldo - valorSolicitado;
            System.out.printf("Saque efetuado com sucesso. \nSaldo atual: %.2f%n", saldo);
        
        sc.close();
    }

}
