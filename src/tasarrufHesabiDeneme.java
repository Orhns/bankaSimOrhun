public class tasarrufHesabiDeneme {

        public static void main(String[] args) {
            tasarrufHesabi saving = new tasarrufHesabi("deneme tasaruf hesabı",
                    "1111", 10);
            saving.paraEkle(750);
            System.out.println("Balance Before Interest: " + saving.getBakiye());

            saving.ekleFaiz();
            System.out.println("Balance After Interest: " + saving.getBakiye());
        }
    }

