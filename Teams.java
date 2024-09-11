import java.util.Scanner;

public class Teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o nome do Time A:");
        String TimeA = sc.nextLine();
        String[] ListaTimeA = new String[5];

        System.out.println("Diga o nome do Time B");
        String TimeB = sc.nextLine();
        String[] ListaTimeB = new String[5];

        System.out.println("Diga o nome dos jogadores do " + TimeA +".");
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Jogador" + (i + 1) + ":");
            ListaTimeA[i] = sc.nextLine(); }

            System.out.println("Diga o nome dos jogadores do " + TimeB + ":");
            for (int i = 0; i < 5; i++) {
                System.out.println("Informe o nome do Jogador" + (i + 1) + ":");
                ListaTimeB[i] = sc.nextLine();
        }


    }
}
