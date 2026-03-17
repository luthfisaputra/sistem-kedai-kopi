import java.util.Scanner;

public class Main {
    // Gunakan static Scanner agar bisa diakses oleh method pembantu
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan("luthfi", 50000);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nHalo Selamat Datang di Cafe kami " + pelanggan.getNamaPelanggan());
            System.out.println("Informasi Pelanggan:");
            System.out.println("Nama    : " + pelanggan.getNamaPelanggan());
            System.out.println("Saldo   : " + pelanggan.getSaldo());
            System.out.println("");
            System.out.println("1. [KOPI] Kopi Susu.");
            System.out.println("2. [KOPI] Espresso.");
            System.out.println("3. [NON-KOPI] Coklat Panas");
            System.out.println("4. [KUE] Brownies");
            System.out.println("5. Keluar");

            System.out.println("Pilih Menu");
            int pilihan = input.nextInt();
            input.nextLine();

            String konfirmasi;

            switch (pilihan) {
                case 1:
                    prosesPembelian(pelanggan, new Kopi("Kopi Susu", 15000));
                    break;
                case 2:
                    prosesPembelian(pelanggan, new Kopi("Espresso", 20000));
                    break;
                case 3:
                    prosesPembelian(pelanggan, new NonKopi("Coklat Panas", 12000));
                case 4:
                    prosesPembelian(pelanggan, new Kue("Brownies", 10000));
                    break;
                case 5:
                    System.out.println("Selamat Menikmati");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
            input.close();
        }
    }

    private static void prosesPembelian(Pelanggan p, ItemMenu item) {
        String konfirmasi;

        do {
            System.out.println("\nHarga " + item.getNama() + ": " + item.getHarga());
            System.out.println("Ingin membeli ini? (y/n): ");
            konfirmasi = input.next().toLowerCase();
        } while (!konfirmasi.equals("y") && !konfirmasi.equals("n"));

        if (konfirmasi.equals("y")) {
            p.beliItem(item);
        } else {
            System.out.println("Pesanan dibatalkan");
        }
    }

}
