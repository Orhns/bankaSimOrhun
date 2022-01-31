/*
 tasaruf hesabı faizi olan banka hesabıdır, faiz oranı dönemsel olarak hesap bakiyesine eklenir.
 */
public class tasarrufHesabi extends bankaHesabi{
    private double faizOrani;

    /* tasaruf hesabı bankaHesabını çağırarak verilen isim ve numarada bir hesap açar.
     */
    public tasarrufHesabi(String hAdi, String hNo, double oran){
        super(hAdi,hNo);
        faizOrani = oran;
    }
    /*faiz periyodik olarak paraEkle() methodunu çağırarak bakiyeye eklenir.
     */
    public void ekleFaiz(){
        double faiz = getBakiye() * faizOrani / 100;
        paraEkle(faiz);
    }
}
