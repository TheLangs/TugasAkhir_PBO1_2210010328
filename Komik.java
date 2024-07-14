public class Komik extends Buku {
    private int volume;

    public void naikkanHarga(){
        this.setHarga(this.getHarga() + 5000);
    }

    public int getVolume(){
        return this.volume;
    }    
}
