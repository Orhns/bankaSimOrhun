/*bankaHesabi sınıfını banka hesabı oluşturmak için ve hesap sahibinin para yatırması, para çekmesi,
 ve bakiyeyi kontrol etmesi gibi işlemler için kullanacağız.

 Yazar; Orhun Kırkağaçlıoğlu 20200305020 teşekkürler.
 */

public class bankaHesabi {
    // Hesap bilgileri
    private String hesapNumarasi;
    private String hesapAdi;
    private double bakiye;

    //Şimdi hesap oluşturan constructor methodu yazıyoruz
    // hesapNumarasi ve hesapAdi yerine hNo ve hAdi parametrelerini kullanacağız.

    public bankaHesabi(String hAdi, String hNo){
        hesapAdi = hAdi;
        hesapNumarasi = hNo;
        bakiye = 0;
    }

    // Bir sonraki aşamada hesap bilgilerini okuyan methodları tanımlayalım.

    // banka hesabının adını getirecek method.
    public String getHesapAdi(){ return hesapAdi; }

    // banka hesabının numarasını getirecek method.
    public  String getHesapNumarasi(){ return  hesapNumarasi; }

    // banka hesabındaki bakiyeyi getirecek method.
    public double getBakiye(){ return bakiye; }

    //Sıradaki methodumuz para yatırma işlemini kontrol edecek ve girilen miktar pozitif ise işlem yapacak.
    //parametre olarak miktar kullanacağız ve boolean döndürecek.
    public boolean paraEkle(double miktar){
        if (miktar > 0 ){
            bakiye = bakiye + miktar;
            return true;
        } else {
            return false;
        }
    }

    //Şimdi de para çekme işleminin methodunu yazıyoruz.
    //Yine miktar parametresini kullanacagız methodumuzun içinde. Ve yine boolean değeri döndürecek.
    public boolean paraCek(double miktar){
     if (miktar > bakiye){
         return false;
     } else {
         bakiye = bakiye - miktar;
         return true;
     }
    }

}
