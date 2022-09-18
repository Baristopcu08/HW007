import java.util.zip.ZipEntry;

public class Hesap {

    Zemin zemin;
    Hali hali;

    double iskontoOrani;
    int iskontoDurumu;


    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    public Hesap() {
    }

    public double getToplamMaliyet(){

        return zemin.alan()*hali.fiyat;
    }

    @Override
    public String toString() {
        return "Toplam maliyet: " + getToplamMaliyet();
    }

    public void x(){
        if (iskontoDurumu==1){
            System.out.println("% İskonto Oranı Giriniz");
        } else if (iskontoDurumu==2) {
            System.out.println(String.format("Son Fiyat %5.2f Tl.dir",getToplamMaliyet()));
        }
    }
    public double iskontoHesapla() {
        return getToplamMaliyet()-(getToplamMaliyet()*iskontoOrani/100);
    }
    public void iskontoluFiyatYazdir(){
        System.out.println("İskontolu Fiyat "+iskontoHesapla()+" Tl. olarak hesaplanmıştır.");
    }
    public void toplamMaliyetYazdir(){
        System.out.println(String.format("Toplam maliyet: %5.2f Tl.dir",getToplamMaliyet()));
    }
    public void iskontoTeklifEt(){
        System.out.println("İskonto Yapılsın mı?");
    }
    public void iskontoDurumuSec(){
        System.out.println("Evet için 1'e Hayır için 2'ye basınız");
    }

}
