package ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class Yuz100999OraliqdagiSonlarniSuzOrqaliChopQIlish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting : ");
        int number = scanner.nextInt();

        int yuzlik = number / 100;
        int unlik = number % 100 / 10;
        int birlik = number % 10;

        String birlar = switch (birlik) {
            case 1 -> " bir ";
            case 2 -> " ikki ";
            case 3 -> " uch ";
            case 4 -> " to'rt ";
            case 5 -> " besh ";
            case 6 -> " olti ";
            case 7 -> " yetti ";
            case 8 -> " sakkiz ";
            case 9 -> " to'qqiz ";
            default -> "";
        };
        String unlar = switch (unlik) {
            case 1 -> " o'n ";
            case 2 -> " yigirma ";
            case 3 -> " o'ttiz ";
            case 4 -> " qirq ";
            case 5 -> " ellik ";
            case 6 -> " oltmish ";
            case 7 -> " yetmish ";
            case 8 -> " sakson";
            case 9 -> " to'qson ";

            default -> "";

        };

        String yuzlar = switch (yuzlik) {
            case 1 -> " bir yuz ";
            case 2 -> " ikki yuz ";
            case 3 -> " uch yuz ";
            case 4 -> " to'rt yuz ";
            case 5 -> " besh yuz ";
            case 6 -> " olti yuz";
            case 7 -> " yetti yuz ";
            case 8 -> " sakkiz yuz";
            case 9 -> " to'qqiz yuz ";

            default -> "";

        };
        System.out.println("Result : " + yuzlar + unlar + birlar);


    }
}
