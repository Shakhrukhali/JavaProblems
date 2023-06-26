package ImmutableString;
import java.util.Scanner;
public class NechaMartaHi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("So'z kiriting: ");
        String str = scanner.nextLine();
        System.out.println(doubleHi(str));
    }
    static int doubleHi(String str) {
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
          if (str.startsWith("hi",i)){
              count++;
          }
        }
        return count;
    }
}
