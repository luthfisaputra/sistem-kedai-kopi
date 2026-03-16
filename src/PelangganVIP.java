public class PelangganVIP extends Pelanggan {

    public PelangganVIP(String namaPelanggan, double saldo) {
        super(namaPelanggan, saldo);
    }

    @Override
    public void beliKopi(Kopi kopi) {
        double diskon = kopi.getHarga() * 0.9;

        if (getSaldo() >= diskon) {
            setSaldo(getSaldo() - diskon);
            System.out.println("SUKSES: Member VIP dapat diskon 10%, sisa saldo: " + getSaldo());
        } else {
            System.out.println("GAGAL: Saldo kamu kurang");
        }
    }
}
