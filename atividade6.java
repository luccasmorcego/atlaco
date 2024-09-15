import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário quantos números deseja inserir
        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();

        double soma = 0;

        // Solicita ao usuário para inserir os números e calcula a soma
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            soma += scanner.nextDouble(); // Adiciona cada número à soma
        }

        // Calcula e exibe a média
        System.out.println("A média dos números é: " + (soma / n));

        scanner.close();
    }
}
