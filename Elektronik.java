public class Elektronik extends Barang {
    public Elektronik(String nama, double harga, int stok) {
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
        System.out.println("Mengambil stok elektronik");
        return super.getStok();
    }

    @Override
    public void tambahStok(int jumlah) {
        System.out.println("Menambah stok elektronik");
        super.tambahStok(jumlah);
    }

    @Override
    public void kurangiStok(int jumlah) {
        System.out.println("Mengurangi stok elektronik");
        super.kurangiStok(jumlah);
    }
}

