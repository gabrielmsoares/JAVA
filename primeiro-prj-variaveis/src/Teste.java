import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Teste {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        char ch;
        ch = 'x';
        System.out.println("ch contais" + ch);
        ch++; // incremento ch
        System.out.println("ch is now" + ch);
        ch = 90; // dá a ch o valor Z
        System.out.println("ch is now" + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        System.out.println("Exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("******** Sistema de Cadastro ********");
            System.out.println("Opção 1: Cadastrar cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0: Sair");
            System.out.println("*************************************");
            System.out.println("Digite a opção: ");
            opcao = in.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    // cadastrarCliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    // cadastrarProduto();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    // cadastrarVendedor();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida.");
                    // Sair
                    break;
                default:
                    System.out.println("O número escolhido é invalido!");

            }

        }while(opcao!= 0);

     }
    }

