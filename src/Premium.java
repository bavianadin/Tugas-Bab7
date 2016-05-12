package Salon;
public class Premium extends Pelanggan {
    public void diskonjasa(){
        double diskon=jasa *0.2;
        jasa= jasa-diskon;
    }
    public void diskonpel(){
        double diskon = produk*0.1;
        produk=produk-diskon;
    }
}