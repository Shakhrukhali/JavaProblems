package JavaCore.ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class KonfetlarNarxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Necha kg konfet kerak : ");
        int n = scanner.nextInt();
        float konfetNarxi = 10500.235F;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " kg konfet narxi : " + i * konfetNarxi);
        }
    }
}
