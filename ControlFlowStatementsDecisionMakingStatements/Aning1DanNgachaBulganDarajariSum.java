package ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class Aning1DanNgachaBulganDarajariSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 2.5d;
        double sum = 0;
        System.out.print("n = ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(Math.pow(a, i) + " + ");
            sum += Math.pow(a, i);
        }


        System.out.println(" = " + sum);

    }
}
