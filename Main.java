public class Main {
    public static void main(String[] args) {
    
    Pengguna pengguna = new Pengguna();
        pengguna.setId(3);
        System.out.println(pengguna.getid());
        pengguna.login();
        pengguna.daftar();
        pengguna.setUsername("GIlang");
        System.out.println(pengguna.getUsername());
        pengguna.setPassword("Admin#1234");
        System.out.println(pengguna.getPassword());

        Tamu tamu = new Tamu();
        tamu.menambahMasaAktif(5);
        tamu.login();
        tamu.hapus();

        
    }
}
