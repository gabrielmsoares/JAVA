import java.util.Scanner;
public class Exercicio3de5 {
    public static void main(String[] args){
        //Conversão de Temperatura: Solicite ao usuário que digite uma temperatura em graus Celsius usando o 
        //Scanner. Em seguida, converta essa temperatura para Fahrenheit usando a fórmula de conversão e exiba 
        //o resultado no console.
        double numTemp = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe em graus a temperatura:");
        numTemp = input.nextDouble();
        
        System.out.println(numTemp * 9/5 + 32);

        

        input.close();
    }
}
