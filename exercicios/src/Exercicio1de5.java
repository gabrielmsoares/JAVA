import java.util.Scanner;
public class Exercicio1de5 {
    public static void main(String[] args) {
        //Crie um programa que solicite dois números do usuário usando o Scanner e realize as quatro operações 
        //básicas (adição, subtração, multiplicação e divisão). Exiba os resultados no console.
        
        System.out.println("****************************************");
        System.out.println("**************CALCULADORA***************");
        System.out.println("****************************************");

        double num1 = 0;
        double num2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();


        int soma = (int) (num1 + num2); // Convertendo para int
        int subtracao = (int) (num1 - num2); // Convertendo para int
        int multiplicacao = (int) (num1 * num2); // Convertendo para int
        double divisao = num1 / num2; // Mantendo como double


        System.out.println("A soma desses números é: " + soma);
        System.out.println("A subtração desses números é: " + subtracao);
        System.out.println("A multiplicação desses números é: " + multiplicacao);
        System.out.println("A divisão desses números é: " + divisao);
        
        System.out.println("****************************************");
        System.out.println("**************FIM CALCULADORA************");

        input.close();

    }
}
