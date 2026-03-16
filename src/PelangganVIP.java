public class PelangganVIP extends Pelanggan {

    public PelangganVIP(String namaPelanggan, double saldo) {
        super(namaPelanggan, saldo);
    }

    @Override
    public void beliItem(ItemMenu item) {
        double hargaSetelahDiskon = item.getHarga() * 0.9;

        if (getSaldo() >= hargaSetelahDiskon) {
            setSaldo(getSaldo() - hargaSetelahDiskon);
            System.out.println("SUKSES: Member VIP dapat diskon 10%, sisa saldo: " + getSaldo());
        } else {
            System.out.println("GAGAL: Saldo kamu kurang");
        }
    }
}
