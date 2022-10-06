import java.util.Scanner;

public class NilaiKelulusanFinal {

    public static void main(String[] args){
        String nama;
        int nilai;
        Scanner cin = new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        nama = cin.nextLine();
        System.out.print("Nilai Mahasiswa : ");
        nilai = cin.nextInt();
        if(nilai >= 78){
            System.out.println(nama +" dinyatakan lulus dengan nilai "+ nilai);
        }
        else{
            System.out.println("mahasiswa dengan nama "+nama + " dinyatakan tidak lulus dengan nilai " + nilai);
        }

    }
}

