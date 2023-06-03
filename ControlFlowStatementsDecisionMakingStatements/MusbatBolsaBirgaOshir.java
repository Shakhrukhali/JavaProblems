package ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class MusbatBolsaBirgaOshir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        int number = scanner.nextInt();
        if (number > 0) {
            number++;
        } else {
            number = number;
        }
        System.out.println(number);
    }
}
