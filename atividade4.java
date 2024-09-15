import java.util.Scanner;

public class atividade4 {
        public static void main(String[] args) {
            // Cria um objeto Scanner para capturar a entrada do usuário
            Scanner scanner = new Scanner(System.in);
            int idade = -1;  // Inicializa com um valor inválido para iniciar o loop

            // Loop que solicita a idade até que o usuário forneça uma idade válida
            while (idade <= 0) {
                System.out.print("Digite uma idade válida (maior que 0): ");
                idade = scanner.nextInt();

                // Verifica se a idade é válida
                if (idade <= 0) {
                    System.out.println("Idade inválida! Por favor, tente novamente.");
                }
            }

            // Exibe a idade válida
            System.out.println("Idade válida inserida: " + idade);

            // Fecha o objeto Scanner
            scanner.close();
        }
    }


