public class Main {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("null",   " null ",                      2033123002,0.0);
        Ogrenci o2 = new Ogrenci("Gökhan", " Bilgisayar Mühendisliği ",   2033123002, 0.0);
        Ogrenci o3 = new Ogrenci("Ayşe",   " Makine Mühendisliği ",       2033123003, 0.0);
        Ogrenci o4 = new Ogrenci("Elif",   " Elektronik Mühendisliği ",   2033123004, 1.98);
        System.out.println("ÖĞNECİLERİN BİLGİLERİ");
        System.out.println("OGR 1: "+o1.getAd() + "\t" + o1.getBolum() + o1.getOgrenciNo() + "\t" + o1.getGano());
        System.out.println("OGR 2: "+o2.getAd() + "\t" + o2.getBolum() + o2.getOgrenciNo() + "\t" + o2.getGano());
        System.out.println("OGR 3: "+o3.getAd() + "\t" + o3.getBolum() + o3.getOgrenciNo() + "\t" + o3.getGano());
        System.out.println("OGR 4: "+o4.getAd() + "\t" + o4.getBolum() + o4.getOgrenciNo() + "\t" + o4.getGano());
    }
    }

