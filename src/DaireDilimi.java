import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        double pi = 3.14;
        int r,a;
        Scanner data = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = data.nextInt();

        System.out.print("Dairenin merkez açısını giriniz: ");
        a = data.nextInt();

        double alan = (pi*(r*r)*a)/360;
        System.out.println(r>0&&a>0 ? "Dairenin alanı: "+alan : "\nBiraz matematik çalış");

    }
}
