import java.util.Scanner;
import java.util.Random;

public class AquaAlert {
    public static void main(String[] args) {
        // Dispositivo que mede o volume de água dentro dos bueiros
        // O dispositivo dispara uma mensagem para a defesa civil, solicitando manutenção do bueiro
        // O alerta é enviado para a população da região para evitar passar pelo local
        System.out.println("***********");
        System.out.println("Aqua Alert");
        System.out.println("***********");
        System.out.println("Sistema de segurança para rede de esgoto.");
        System.out.println("Para começar, informe o CEP da rua que você deseja saber o nível da água nos escoadouros.");

        // Validando entrada do usuário
        Scanner entrada = new Scanner(System.in);
        String cep = entrada.nextLine();
        entrada.close();

        // Removendo caracteres não numéricos do CEP
        cep = cep.replaceAll("[^0-9]", "");

        // Verificando se o CEP é válido
        if (cep.length() != 8) {
            System.out.println("CEP inválido!");
            System.exit(0);
        } else {
            System.out.println("CEP válido! Aguarde que a busca está sendo feita...");
        }
        System.out.println("Carregando...");
        System.out.println("Rua encontrada. Veja abaixo as informações sobre a atual situação do nível de água nos escoadouros da rua:");

        // Validando o nível da água
        int nivelAgua = (int) (Math.random() * 100);
        System.out.println("Nível de água: " + nivelAgua + "%");
        if (nivelAgua < 50) {
            System.out.println("Nível de água baixo. Não há necessidade de manutenção.");
        } else if (nivelAgua >= 50 && nivelAgua < 75) {
            System.out.println("Nível de água moderado. Há necessidade de manutenção.");
        } else {
            System.out.println("Nível de água alto. Há um grande risco de enchente");
            System.out.println("Um alerta será emitido para a Defesa Civil");
        }
    }
}