import java.util.Scanner;
public class Exercicio5de5 {
    public static void main(String[] args){

        //Cálculo de Média de Notas: Solicite ao usuário que digite três notas usando o Scanner. 
        //Em seguida, calcule a média dessas notas e exiba o resultado no console, 
        //indicando se o aluno foi aprovado (média maior ou igual a 6) ou reprovado (média menor que 6).

        Scanner input = new Scanner(System.in);
        double media = 0;

        System.out.println("Digite a primeira nota do aluno para saber se ele foi aprovado");
        double nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota do aluno para saber se ele foi aprovado");
        double nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota do aluno para saber se ele foi aprovado");
        double nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média total do aluno foi de: " + media);

        if(media >= 6){
            System.out.println("Parabéns. O aluno foi aprovado!");
        }else {
            System.out.println("Que pena. O aluno foi reprovado!");
        }

    input.close();


    }
}
