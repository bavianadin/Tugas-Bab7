package Salon;
import java.util.Scanner;
public class Main {
static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-------------Salon Q-------------");
        System.out.println("        Jenis Keanggotaan");
        System.out.println("Premium, Gold, Silver, dan NonMember");
        System.out.println();
        System.out.print("Masukkan Jenis Keanggotaan = ");
        String ang = input.next();
        if (ang.equalsIgnoreCase("Gold")) {
            Pelanggan g= new Gold();
            hitungan(g);
            System.out.println("Anda mendapatkan diskon Produk sebesar 15% dan diskon Jasa sebesar 10%  ");
            System.exit(0);
        } else if (ang.equalsIgnoreCase("Premium")) {
            Pelanggan p = new Premium();
            hitungan(p);
            System.out.println("Anda mendapatkan diskon Produk sebesar 20% dan diskon Jasa sebesar 10%  ");
            System.exit(0);
        } else if (ang.equalsIgnoreCase("NonMember")) {
            Pelanggan np = new NonPelanggan();
            hitungan(np);
            System.out.println("Anda tidak mendapatkan diskon Produk ataupun diskon Jasa ");
            System.exit(0);
        } else if (ang.equalsIgnoreCase("Silver")) {
            Pelanggan s = new Silver();
            hitungan(s);
            System.out.println("Anda mendapatkan diskon Produk sebesar 10% dan diskon Jasa sebesar 10%  ");
            System.exit(0);
        } else {
            System.out.println("Pilihan Anda tidak ada pada Daftar");
            System.exit(0);
        }
    }
    public static void hitungan(Pelanggan pel){
        System.out.print("Masukkan Total Jasa : ");
            pel.jasa=input.nextDouble();
            System.out.print("Masukkan Total Produk :");
            pel.produk=input.nextDouble();
            pel.diskonjasa();
            pel.diskonpel();
            System.out.println("Total jasa anda = "+ pel.jasa);
            System.out.println("Total produk anda = "+ pel.produk);
            System.out.println("Total Pembayaran = "+ (pel.jasa+pel.produk));
    }
}