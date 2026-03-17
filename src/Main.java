import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pelanggan pelanggan = new Pelanggan("luthfi", 50000);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nHalo Selamat Datang di Cafe kami " + pelanggan.getNamaPelanggan());
            System.out.println("Informasi Pelanggan:");
            System.out.println("Nama    : " + pelanggan.getNamaPelanggan());
            System.out.println("Saldo   : " + pelanggan.getSaldo());
            System.out.println("");
            System.out.println("1. Beli Kopi Susu.");
            System.out.println("2. Beli Espresso.");
            System.out.println("3. Beli Brownies");
            System.out.println("4. Keluar");

            System.out.println("Pilih Menu");
            int pilihan = input.nextInt();
            input.nextLine();

            String konfirmasi;

            switch (pilihan) {
                case 1:
                    Kopi kopi1 = new Kopi("Kopi Susu", 15000);

                    do {
                        System.out.println("Harga " + kopi1.getNama() + ": " + kopi1.getHarga());
                        System.out.println("Ingin membeli ini? (y/n)");
                        konfirmasi = input.next().toLowerCase();

                    } while (!konfirmasi.equals("y") && !konfirmasi.equals("n"));

                    if (konfirmasi.equals("y")) {
                        pelanggan.beliItem(kopi1);
                    } else {
                        System.out.println("Pesanan dibatalkan");
                    }
                    break;
                case 2:
                    Kopi kopi2 = new Kopi("Espresso", 20000);

                    do {
                        System.out.println("Harga " + kopi2.getNama() + ": " + kopi2.getHarga());
                        System.out.println("Ingin membeli ini? (y/n)");
                        konfirmasi = input.next().toLowerCase();

                    } while (!konfirmasi.equals("y") && !konfirmasi.equals("n"));

                    if (konfirmasi.equals("y")) {
                        pelanggan.beliItem(kopi2);
                    } else {
                        System.out.println("Pesanan dibatalkan");
                    }
                    break;
                case 3:
                    Kue kue = new Kue("Brownies", 10000);

                    do {
                        System.out.println("Harga " + kue.getNama() + ": " + kue.getHarga());
                        System.out.println("Ingin membeli ini? (y/n)");
                        konfirmasi = input.next().toLowerCase();

                    } while (!konfirmasi.equals("y") && !konfirmasi.equals("n"));

                    if (konfirmasi.equals("y")) {
                        pelanggan.beliItem(kue);
                    } else {
                        System.out.println("Pesanan dibatalkan");
                    }
                    break;
                case 4:
                    System.out.println("Selamat Menikmati");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        }
    }

}
