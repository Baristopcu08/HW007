public class Hali {

    double fiyat;

    public Hali(double fiyat) {
        if (fiyat>0) this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyatı: %5.2f",fiyat);
    }

    public void haliFiyatYazdir(){
        System.out.println(String.format("Halı m² fiyatı %5.2f Tl. olarak hesaplanmıştır",fiyat));
    }
}
