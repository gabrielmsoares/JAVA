import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        
        System.out.println("******************************");
        System.out.println("* Exercício Calculo de Idade *");
        System.out.println("******************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int anoAtual = input.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("A sua idade é: " + idade);
        System.out.println("******************************");

        input.close();

    }
}
