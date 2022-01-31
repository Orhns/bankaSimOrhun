/* mevduatHesabi bir bankaHesabıdır. Bankanın belirlediği kadar ücretsiz işlem yapılır,
    sonrasında da işlem ücreti kesmeye başlayacak.
 */


public class mevduatHesabi extends bankaHesabi{
    private int islemSayisi;
    private static final int ucretsizIslemSayisi = 3;
    private static final double islemUcreti = 2.0;

    /* mevduatHesabi bankaHesabını çağırarak verilen hesap adı ve hesap numarası ile yeni banka hesabı oluşturacak.
     */
    public mevduatHesabi(String hAdi, String hNo){
        super(hAdi,hNo);
        islemSayisi = 0;
    }
    /*Override yaptığımız depozito methodu yapılan işlemleri sayacak.
     */
    public boolean paraEkle(double miktar){
        if (super.paraEkle(miktar)){
            islemSayisi++;
            return true;
        }
        return false;
    }
    //override edeceğimiz paraÇek metodu işlemleri sayıyor.
    public boolean paraCek(double miktar) {
        if (super.paraCek(miktar)) {
            islemSayisi++;
            return true;
        }
        return false;
    }
    /**
     * İşlem başına yapılacak kesintiyi hesaplayacak methodu giriyoruz.
     */
    public void kesintiBedeli(){
        if (islemSayisi > ucretsizIslemSayisi){
            double kesinti = islemUcreti * (islemSayisi - ucretsizIslemSayisi);
            if (super.paraCek(kesinti)){
                islemSayisi = 0 ;
            }
        }
    }


}
