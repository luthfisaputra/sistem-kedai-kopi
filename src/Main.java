public class Main {
    public static void main(String[] args) {
        Kopi kopi1 = new Kopi("Kopi Susu", 25000);
        Kopi kopi2 = new Kopi("Espresso", 30000);

        Pelanggan pelanggan = new Pelanggan("luthfi", 100000);

        PelangganVIP pelangganVIP = new PelangganVIP("yoza", 50000);
        pelangganVIP.beliKopi(kopi2);

        System.out.println("Haloo! " + pelanggan.getNamaPelanggan() + ", Saldo Kamu: " + pelanggan.getSaldo());
        System.out.println("1. Kopi: " + kopi1.getNama() + " | Harga: " + kopi1.getHarga());
        System.out.println("2. Kopi: " + kopi2.getNama() + " | Harga: " + kopi2.getHarga());

        pelanggan.beliKopi(kopi1);
    }

}
