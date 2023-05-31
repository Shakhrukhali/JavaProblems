import java.util.Scanner;

public class OydaNechtaKunBOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting : ");
        int oy = scanner.nextInt();
        switch (oy){
          case 1,3,5,7,8,10,12-> System.out.println(oy + " -oy 31 kundan iborat");
          case 4,6,9,11-> System.out.println(oy + "-oy 30 kundan iborat");
          case 2-> System.out.println(oy + " -oy 28 kundan iborat kabisa yili bo'lsa 29 kun bo'ladi!!");

            default -> System.out.println("bunday oy yo'q!!!");
        }
    }
}
