public class Zemin {
    String aciklama;
    double genislik;
    double uzunluk;


    public Zemin(double genislik, double uzunluk) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    public Zemin() {
    }

    public double getGenislik(double genislik) {
        return this.genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik>0) this.genislik = genislik;
    }

    public double getUzunluk(double uzunluk) {
        return this.uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk>0) this.uzunluk = uzunluk;
    }

    public double alan(){
         return genislik*uzunluk;
    }


    @Override
    public String toString() {
        String result = aciklama+" ("+genislik+" x "+uzunluk+")";
            return String.format("%5.2f, (%5.2f, x %5.2f)",aciklama,genislik,uzunluk);
    }

    public void olcuGir(){
        System.out.println(String.format("%s ölçülerini giriniz",aciklama));
    }
    public void zeminAlanyazdir(){
        System.out.println(aciklama +" alanı "+alan()+" m².dir");
    }
}
