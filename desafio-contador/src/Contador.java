
import java.util.Scanner;
public class Contador {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = sc.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.err.println("O segundo parâmetro deve ser maior que o primeiro");

            }
            sc.close();
        }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois)
                throw new ParametrosInvalidosException();

            int contagem = parametroDois - parametroUm;
            System.out.println(contagem);

        }
    }
