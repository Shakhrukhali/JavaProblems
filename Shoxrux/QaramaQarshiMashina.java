package Shoxrux;

public class QaramaQarshiMashina {
    public static void main(String[] args) {
        int v1 = 80;
        int v2 = 90;
        int masofa = 300;
        double t;

        /**
         s1 = v1*t
         s2 = v2*t
         masofa=s1+s2 = t(v1+v2)
         */
        t = (double) masofa / (v1 + v2);

        double s1 = v1 * t;
        double s2 = v2 * t;
        System.out.println("Ular "+t+" vaqtdan keyin uchrashadi");
        System.out.println("Birinchi mashina: "+s1+" masofa bosgan");
        System.out.println("Ikkinchi mashina: "+s2+" masofa bosgan");

    }
}
