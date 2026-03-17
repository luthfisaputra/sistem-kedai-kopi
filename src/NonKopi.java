public class NonKopi implements ItemMenu {
    private String nama;
    private double harga;

    public NonKopi(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Error: Harga tidak boleh minus");
        }
    }
}
