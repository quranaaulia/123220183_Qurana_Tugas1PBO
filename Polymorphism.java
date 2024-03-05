public class Polymorphism {
    public static void main(String[] args) {
        // Membuat instansi dari jenis barang yang berbeda
        Barang[] barang = new Barang[3];
        barang[0] = new Sembako("Beras", 15000, 100);
        barang[1] = new PeralatanMasak("Panci", 200000, 50);
        barang[2] = new Elektronik("Smartphone", 5000000, 30);

        // Menampilkan informasi dari setiap barang sebelum pengambilan stok
        for (int i = 0; i < barang.length; i++) {
            barang[i].tampilkanInfo();
            System.out.println();
        }

        // Mengurangi stok Beras sebanyak 20
        barang[0].kurangiStok(20);
        System.out.println("Stok Beras setelah pengurangan      : " + barang[0].getStok());

        // Menambah stok Panci sebanyak 10
        barang[1].tambahStok(10);
        System.out.println("Stok Panci setelah penambahan       : " + barang[1].getStok());

        // Mengurangi stok Smartphone sebanyak 5
        barang[2].kurangiStok(5);
        System.out.println("Stok Smartphone setelah pengurangan : " + barang[2].getStok());

        // Menambah stok Smartphone sebanyak 3
        barang[2].tambahStok(3);
        System.out.println("Stok Smartphone setelah penambahan  : " + barang[2].getStok());
    }
}
