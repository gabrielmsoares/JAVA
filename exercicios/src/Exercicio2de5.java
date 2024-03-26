import java.util.Scanner;
public class Exercicio2de5 {
    public static void main(String[] args) {
        //Verificação de Número Par ou Ímpar: Peça ao usuário para digitar um número usando o Scanner. 
        //Em seguida, use uma declaração if-else para verificar se o número é par ou ímpar e exiba essa 
        //informação no console.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par");
        } else {
            System.out.println(numero + " é um número ímpar");
        }

        input.close();
    }
}
