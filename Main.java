import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sala, cadeira;

        System.out.println("Ranyelly, escolha sua sala (1, 2, 3, 4, 5 ou 6):");
        sala = scanner.nextInt();

        System.out.println("Ranyelly, escolha sua cadeira (22, 4, 10, 1, ou 5):");
        cadeira = scanner.nextInt();

        System.out.println("Você escolheu a Sala " + sala + " e a Cadeira " + cadeira + ".");
    }
}
