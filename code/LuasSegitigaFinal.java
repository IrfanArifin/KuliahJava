import java.util.Scanner;
public class LuasSegitigaFinal {
    public static void main(String[] args) {
        float luas ;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan nilai a ");
        int a =scan.nextInt();
        System.out.println("masukan nilai t ");
        int t =scan.nextInt();
        luas = 1/2f*a*t;
        System.out.println("luas segitiganya adalah : " + luas);
    }
}