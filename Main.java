public class Main {
    public static void main(String[] args) {
    
    Pengguna pengguna = new Pengguna();
        pengguna.setId(3);
        System.out.println(pengguna.getid());
        pengguna.login();
        pengguna.daftar();
        pengguna.setUsername("Gilang");
        System.out.println(pengguna.getUsername());
        pengguna.setPassword("Admin#1234");
        System.out.println(pengguna.getPassword());

        Tamu tamu = new Tamu();
        tamu.menambahMasaAktif(5);
        tamu.login();
        tamu.hapus();

        Buku buku = new Buku();
        buku.setJudul("Buku Tugas Akhir");
        buku.setPenulis("Gilang");
        buku.setJml_Hlmn(15);
        buku.setHarga(5000);
        buku.nulis("Hai nama saya Gilang, saya sedang mengerjakan tugas akhir PBO 1.");
        buku.naikkanHarga();
        System.out.println("Harga Buku : "+buku.getHarga());
        buku.naikkanHarga(70000);
        System.out.println("Harga Buku : "+buku.getHarga());

        RentalMobil mobil1 = new RentalMobil();
        mobil1.setId(1);
        mobil1.setMerk("Porsche");
        mobil1.setModel("911 GT3 RS");
        mobil1.setHargaSewaPerHari(10000000);
        System.out.println("Harga Sewa Mobil :"+mobil1.getHargaSewaPerHari());
        System.out.println("Tambah Supir");
        mobil1.naikkanHarga(500000);
        mobil1.detailMobil();
    }
}
