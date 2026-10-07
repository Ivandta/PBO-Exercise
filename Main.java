public class Main {
    public static void main(String[] args) {

        Bentuk bentuk = new Bentuk("Merah");
        bentuk.printInfo();

        System.out.println();

        BujurSangkar persegi = new BujurSangkar(5, "Biru");
        persegi.printInfo();

        System.out.println();

        Lingkaran lingkaran = new Lingkaran(7, "Hijau");
        lingkaran.printInfo();

        System.out.println();

        Silinder silinder = new Silinder(10, 7, "Kuning");
        silinder.printInfo();
    }
}