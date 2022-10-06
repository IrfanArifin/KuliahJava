import java.util.Scanner;
public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        float luas , lebar ,panjang, keliling;
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan luas persegi panjang :");
        luas = scan.nextInt();
        System.out.print("masukkan lebar persegi panjang :");
        lebar = scan.nextInt();

        panjang = luas/lebar;
        System.out.println("panjang persegi adalah "+panjang);

        keliling = 2*(panjang+lebar);
        System.out.println("keliling persegi panjang adalah "+keliling);
    }
}
