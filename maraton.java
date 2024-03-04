package Maraton;

import java.util.*;

public class maraton {

    static class Ogrenci {
        String isim;
        int derece;

        Ogrenci(String isim, int derece) {
            this.isim = isim;
            this.derece = derece;
        }
    }

    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci("Kadir", 341),
                new Ogrenci("Gökhan", 273),
                new Ogrenci("Hakan", 278),
                new Ogrenci("Suzan", 329),
                new Ogrenci("Pınar", 445),
                new Ogrenci("Mehmet", 402),
                new Ogrenci("Ali", 388),
                new Ogrenci("Emel", 270),
                new Ogrenci("Fırat", 243),
                new Ogrenci("James", 334),
                new Ogrenci("Jale", 412),
                new Ogrenci("Ersin", 393),
                new Ogrenci("Deniz", 299),
                new Ogrenci("Gözde", 343),
                new Ogrenci("Anıl", 317),
                new Ogrenci("Burak", 265)
        };

        // İlk üç dereceyi alan öğrencileri bul
        List<Ogrenci> ilkUc = ilkUcDereceyiBul(ogrenciler);
        System.out.println("İlk üç dereceyi alan öğrenciler:");
        for (Ogrenci ogrenci : ilkUc) {
            System.out.println(ogrenci.isim + ": " + ogrenci.derece + " dakika");
        }

        // En düşük zamana sahip kişiyi bul ve bilgilerini yazdır
        int enDusukIndex = enDusukZamanaSahipKisiIndex(ogrenciler);
        Ogrenci enDusukKisi = ogrenciler[enDusukIndex];
        System.out.println("En düşük zamana sahip kişi: " + enDusukKisi.isim + ", " + enDusukKisi.derece + " dakika");

        // İkinci en iyi koşucuyu bul ve bilgilerini yazdır
        Ogrenci ikinciEnIyi = ikinciEnIyiKosucu(ogrenciler);
        System.out.println("İkinci en iyi koşucu: " + ikinciEnIyi.isim + ", " + ikinciEnIyi.derece + " dakika");

        // Üçüncü en iyi koşucuyu bul ve bilgilerini yazdır
        Ogrenci ucuncuEnIyi = ucuncuEnIyiKosucu(ogrenciler);
        System.out.println("Üçüncü en iyi koşucu: " + ucuncuEnIyi.isim + ", " + ucuncuEnIyi.derece + " dakika");

        // Öğrencileri sınıflandır ve sınıf sayılarını yazdır
        Map<String, Integer> siniflar = siniflandir(ogrenciler);
        System.out.println("Sınıflar:");
        for (Map.Entry<String, Integer> entry : siniflar.entrySet()) {
            System.out.println(entry.getKey() + " sınıfı: " + entry.getValue() + " kişi");
        }
    }

    static List<Ogrenci> ilkUcDereceyiBul(Ogrenci[] ogrenciler) {
        List<Ogrenci> siraliListe = new ArrayList<>(Arrays.asList(ogrenciler));
        siraliListe.sort(Comparator.comparingInt(o -> o.derece));
        return siraliListe.subList(0, Math.min(3, siraliListe.size()));
    }

    static int enDusukZamanaSahipKisiIndex(Ogrenci[] ogrenciler) {
        int enDusukIndex = 0;
        for (int i = 1; i < ogrenciler.length; i++) {
            if (ogrenciler[i].derece < ogrenciler[enDusukIndex].derece) {
                enDusukIndex = i;
            }
        }
        return enDusukIndex;
    }

    static Ogrenci ikinciEnIyiKosucu(Ogrenci[] ogrenciler) {
        int enDusukIndex = enDusukZamanaSahipKisiIndex(ogrenciler);
        int ikinciEnIyiIndex = (enDusukIndex == 0) ? 1 : 0;
        for (int i = 0; i < ogrenciler.length; i++) {
            if (i != enDusukIndex && ogrenciler[i].derece < ogrenciler[ikinciEnIyiIndex].derece) {
                ikinciEnIyiIndex = i;
            }
        }
        return ogrenciler[ikinciEnIyiIndex];
    }

    static Ogrenci ucuncuEnIyiKosucu(Ogrenci[] ogrenciler) {
        int enDusukIndex = enDusukZamanaSahipKisiIndex(ogrenciler);
        int ikinciEnIyiIndex = (enDusukIndex == 0) ? 1 : 0;
        int ucuncuEnIyiIndex = (ikinciEnIyiIndex == 0) ? 1 : 0;

        for (int i = 0; i < ogrenciler.length; i++) {
            if (i != enDusukIndex && i != ikinciEnIyiIndex && ogrenciler[i].derece < ogrenciler[ucuncuEnIyiIndex].derece) {
                ucuncuEnIyiIndex = i;
            }
        }
        return ogrenciler[ucuncuEnIyiIndex];
    }

    static Map<String, Integer> siniflandir(Ogrenci[] ogrenciler) {
        Map<String, Integer> siniflar = new HashMap<>();
        siniflar.put("A", 0);
        siniflar.put("B", 0);
        siniflar.put("C", 0);

        for (Ogrenci ogrenci : ogrenciler) {
            if (ogrenci.derece >= 200 && ogrenci.derece <= 299) {
                siniflar.put("A", siniflar.get("A") + 1);
            } else if (ogrenci.derece >= 300 && ogrenci.derece <= 399) {
                siniflar.put("B", siniflar.get("B") + 1);
            } else {
                siniflar.put("C", siniflar.size());
            }
        }

        return siniflar;
    }
}