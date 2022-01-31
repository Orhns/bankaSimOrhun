public class mevduatHesabiDeneme {
    public static void main(String[] args) {
        mevduatHesabi checking = new mevduatHesabi("bilmem kim",
                "54611");

        checking.paraEkle(500);
        checking.paraCek(200);
        checking.paraEkle(700);
        // İşlem ücreti yok çünkü 3 işlemi geçmedik.
        checking.kesintiBedeli();
        System.out.println("İşlem sayısı <= 3: " + checking.getBakiye());

        // Bir işlem daha yapalım
        checking.paraEkle(200);
        // 4. işlemden itibaren işlem ücreti yansıyacak.
        checking.kesintiBedeli();
        System.out.println("İşlem sayısı > 3: " + checking.getBakiye());
    }
}
