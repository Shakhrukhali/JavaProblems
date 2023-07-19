package JavaCore.ControlFlowStatementsDecisionMakingStatements;

import java.util.Scanner;

public class MusbatOshirNolOnggaKamaytir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        int number = scanner.nextInt();
        if (number > 0) {
            number++;

        }
        else if(number==0){
            number=10;
        }
        else {
            number -= 2;
        }
        System.out.println(number);
    }
    }

