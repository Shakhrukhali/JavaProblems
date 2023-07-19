package JavaCore.ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class BahoSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bahoni kiriting : ");
        int baho = scanner.nextInt();

        switch (baho) {
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("Qoniqarsiz");
            case 3 -> System.out.println("Qoniqarli");
            case 4 -> System.out.println("Yaxshi");
            case 5 -> System.out.println("A'lo");

            default -> System.out.println("XATO");
        }
    }
}
