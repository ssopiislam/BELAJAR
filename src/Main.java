class mahasiswa{
    static String nama;
    static String nim;

    public mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public static boolean login(String inputnama, String inputnim){
        return inputnama.equals(nama) && inputnim.equals(nim);
    }

    public void display_info(){
        System.out.println("Login berhasil!");
        System.out.println("Nama " + nama);
        System.out.println("Nim " + nim);
        System.out.println("data sudah dimasukam");
    }
}
