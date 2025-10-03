import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, hasil;

        System.out.println("masukkan  bilangan pertama:");
        bil1 = Integer.parseInt(input.nextLine());
        System.out.println("masukkan bialngan kedua:");
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("bilangan pertama:genap");
        } else {
            System.out.println("bilangan pertama:ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("bilangan kedua:genap");
        } else {
            System.out.println("bilangan kedua:ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("bilangan pertama lebih besar");
        } else {
            if (bil2 > bil1) {
                System.out.println("bilangan kedua lebih besar");
            } else {
                System.out.println("kedua bilangan sama besar");
            }
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            hasil = bil1 + bil2;
            System.out.println(hasil);
        } else {
            if (bil1 % 2 == 1 && bil2 % 2 == 1) {
                hasil = bil1 * bil2;
                System.out.println(hasil);
            } else {
                System.out.println("berbeda jelas");
            }
        }
    }
}
