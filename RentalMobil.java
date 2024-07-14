public class RentalMobil {
    private int id;
    private String merk;
    private String model;
    private double hargaSewaPerHari;

    // Constructor
    public RentalMobil() {
        System.out.println("Object RentalMobil telah diciptakan, constructor berjalan");
    }

    // Getter dan Setter
    public int getId() {
        return this.id;
    }

    public String getMerk() {
        return this.merk;
    }

    public String getModel() {
        return this.model;
    }

    public double getHargaSewaPerHari() {
        return this.hargaSewaPerHari;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Method tambahan
    public void detailMobil() {
        System.out.println("Detail Mobil: ");
        System.out.println("ID: " + id);
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Harga Sewa per Hari: " + hargaSewaPerHari);
    }

    public void hapusMobil() {
        System.out.println("Mobil dengan ID " + id + " telah dihapus");
    }

    public void tambahMobil() {
        System.out.println("Mobil baru telah ditambahkan");
    }

    // Method naikkanHarga dan overloadingnya
    public void naikkanHarga() {
        this.hargaSewaPerHari += 1000000; // Default kenaikan sebesar 10
    }

    public void naikkanHarga(double kenaikan) {
        this.hargaSewaPerHari += kenaikan;
        System.out.println("Harga sewa mobil naik sebesar: " + kenaikan);
    }
}
