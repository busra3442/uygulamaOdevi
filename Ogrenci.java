public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private int ogrenciNo;
    private double gano;
    private double bolumKodu;

    public Ogrenci(String ad, String bolum, int ogrenciNo, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.ogrenciNo = ogrenciNo;
        this.gano = gano;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }


    public double getBolumKodu() {
        return bolumKodu;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public String getBolum() {
        return bolum;
    }

    public String getAd() {
        return ad;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }
    public double harcHesapla(int dersSayisi, int uzatma) {
        double harc = (dersSayisi * 50) + (uzatma * 100);
        return harc;
    }

    public void ganoHesabi() {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Geçersiz Gano");
        } else {
            System.out.println("İsim: " + getAd() + " Bölüm: " + getBolum() + " No: " + getOgrenciNo() + " Gano: " + getGano());
        }
    }
}

