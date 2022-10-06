import java.util.Scanner;
public class UmurFinal {
    public static void main(String[] args) {
        int tsk, tl, umur;
        Scanner scan=new Scanner(System.in);

        System.out.print("Masukkan tahun sekarang: ");
        tsk = scan.nextInt();
        System.out.print("masukkan tahun lahir: ");
        tl = scan.nextInt();
        umur = tsk-tl;
        System.out.println("umur anda sekarang adalah "+umur);
    }
}
