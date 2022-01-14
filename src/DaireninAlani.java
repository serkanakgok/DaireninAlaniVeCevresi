import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        double pi = 3.14;
        int r;
        System.out.print("Dairenin yarıçapını giriniz: ");
        Scanner data = new Scanner(System.in);
        r=data.nextInt();

        double cevre = 2 * pi * r;
        double alan = pi * r * r;
        System.out.println(r>0 ? "Dairenin alanı: "+alan+"\nDairenin çevresi: "+cevre : "\nBiraz matematik çalış");
    }
}
