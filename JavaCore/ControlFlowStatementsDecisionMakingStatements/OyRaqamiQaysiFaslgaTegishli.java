package JavaCore.ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class OyRaqamiQaysiFaslgaTegishli
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting : ");
        int oy = scanner.nextInt();


        switch (oy) {
            case 1, 2, 12 -> System.out.println("Qish");
            case 3, 4, 5 -> System.out.println("Bahor");
            case 6, 7, 8 -> System.out.println("Yoz");
            case 9, 10, 11 -> System.out.println("Kuz");
            default -> System.out.println("bunday hafta oy yo'q!!!");
        }
    }
}
