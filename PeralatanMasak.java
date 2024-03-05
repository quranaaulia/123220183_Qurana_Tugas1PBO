public class PeralatanMasak extends Barang {
    public PeralatanMasak(String nama, double harga, int stok) {
        super(nama, harga, stok);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama barang : " + nama);
        System.out.println("Harga       : " + harga);
        System.out.println("Stok        : " + stok);
    }

    @Override
    public int getStok() {
        System.out.println("Mengambil stok peralatan masak");
        return super.getStok();
    }

    @Override
    public void tambahStok(int jumlah) {
        System.out.println("Menambah stok peralatan masak");
        super.tambahStok(jumlah);
    }

    @Override
    public void kurangiStok(int jumlah) {
        System.out.println("Mengurangi stok peralatan masak");
        super.kurangiStok(jumlah);
    }
}
