import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número para calcular o fatorial: ");
                int numero = scanner.nextInt();
                int fatorial = 1;
                int i = numero;
                do {
                    fatorial *= i;  // Multiplica o valor atual do fatorial por i
                    i--;            // Decrementa o valor de i
                } while (i > 0);     // Continua o loop enquanto i for maior que 0


                System.out.println("O fatorial de " + numero + " é: " + fatorial);
                scanner.close();
            }
        }

