import java.util.Scanner;

public class lacoderepeticao {

    public static void main(String[] args) {

        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<10; i++) {
            System.out.println("Informe o nome do Player " + (i + 1));
            nomesJogadores[i] = sc.next();
        }
    }
}
