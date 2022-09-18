import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hangi Oda? Örn:Mutfak,Salon,Koridor");
        Zemin zemin=new Zemin();
        zemin.aciklama=input.nextLine();
        zemin.olcuGir();
        System.out.println("genişlik?");
        zemin.genislik=input.nextDouble();
        System.out.println("Uzunluk?");
        zemin.uzunluk=input.nextDouble();
        zemin.zeminAlanyazdir();
        System.out.println();
        Hali hali = new Hali(80);
        Hesap hesap = new Hesap(zemin, hali);
        hesap.toplamMaliyetYazdir();
        System.out.println();
        hali.haliFiyatYazdir();
        hesap.iskontoTeklifEt();
        hesap.iskontoDurumuSec();
        System.out.println();
        hesap.iskontoDurumu=input.nextInt();
        hesap.x();
        hesap.iskontoOrani=input.nextInt();
        hesap.iskontoluFiyatYazdir();


    }
}
