import java.util.Scanner;
public class KelilingLingkaranFinal{
    public static void main(String[] args) {
        double keliling,phi;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan nilai r : ");
        double r = scan.nextDouble();
        phi = 22/7f;
        keliling = 2*phi*r;
        System.out.println("Maka Keliling lingkaran adalah : " + keliling);
    }
}
