package kodluyom.emre.KendiAdapterim;

import java.util.ArrayList;


public class UrunleriDoldur {

    public static ArrayList<Urunler> VerilerleDoldur()
    {
        ArrayList<Urunler> u_hepsi= new ArrayList<>();
        Urunler u1 = new Urunler();
        u1.setUrunId(1);
        u1.setUrunAdi("karpuz");
        u_hepsi.add(u1);

        u1= new Urunler();
        u1.setUrunId(2);
        u1.setUrunAdi("vav");

        u_hepsi.add(u1);

        return u_hepsi;
    }
}
