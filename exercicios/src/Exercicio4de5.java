import java.util.Scanner;
public class Exercicio4de5 {
    public static void main(String[] args) {
        //Verificação de Idade: Peça ao usuário para digitar sua idade usando o Scanner. 
        //Em seguida, use uma declaração if-else para verificar se a idade está acima ou abaixo de 18 anos 
        //e exiba uma mensagem correspondente no console.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        
        input.close(); 
    }
}
