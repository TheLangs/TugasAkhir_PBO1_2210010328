public class Pengguna {
    int id;
    String username;
    String password;

    public Pengguna(){
        System.out.println("Object telah diciptakan, contructor berjalan\n");
    }
    
    public int getid(){
        return this.id;
    }

    public void daftar(){
    System.out.println("Ini method Daftar user baru\n");
    }

    public String getUsername() {
    return this.username;
    }


    public String getPassword(){
        return this.password;
    }


    public void login(){
    System.out.println("Ini method untuk Login");
    }
    
    public void lupaPassword(){
    System.out.println("Ini method Lupa Password");
    }
        
    

}