import java.util.Random;
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        // Loop até o usuário acertar o número
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou.");
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
