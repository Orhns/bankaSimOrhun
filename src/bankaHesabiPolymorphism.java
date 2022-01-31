public class bankaHesabiPolymorphism {
    public static void main(String[] args) {
        bankaHesabi ilkHesap = new tasarrufHesabi("Orhun K","4555",20);
        bankaHesabi ikinciHesap = new mevduatHesabi("Orhun K","4555");

        // bankaHesabındaki methodu çağırıyor.
        ilkHesap.paraEkle(150);

        //mevduatHesabı'ndaki methodu çağıracak çünkü paraEkle'yi mevduat hesabında override ettik.
        ikinciHesap.paraEkle(100);

        System.out.println("ilk hesap: " + ilkHesap.getHesapAdi() + " bakiye: " + ilkHesap.getBakiye());
        System.out.println("ikinci hesap: " + ikinciHesap.getHesapAdi() + " bakiye: " + ikinciHesap.getBakiye());
    }
}
