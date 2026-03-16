public class Pelanggan {
    private String namaPelanggan;
    private double saldo;

    public Pelanggan(String namaPelanggan, double saldo) {
        this.namaPelanggan = namaPelanggan;
        this.saldo = saldo;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: Set Saldo tidak boleh minus");
        }
    }
}
