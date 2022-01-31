public class bankaHesabiDeneme {
    public static void main(String[] args) {
        bankaHesabi orhun = new bankaHesabi("1354", "Orhun Kirkagaclioglu");

        orhun.paraEkle(300);
        orhun.paraEkle(500);

        System.out.println("Bakiye: " + orhun.getBakiye());

        orhun.paraCek(200);

        System.out.println("Bakiye: " + orhun.getBakiye());
    }
}
