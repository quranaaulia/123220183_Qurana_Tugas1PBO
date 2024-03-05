public abstract class Barang implements HargaBarang {
    protected String nama;
    protected double harga;
    protected int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    public abstract void tampilkanInfo();
}

