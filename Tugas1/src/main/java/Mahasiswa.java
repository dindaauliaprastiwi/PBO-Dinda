public class Mahasiswa {
    String npm;
    String nama;
    double ipk;
    int semester;

    // Constructor
    public Mahasiswa(String npm, String nama, double ipk, int semester) {
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    // Method untuk menampilkan data
    public void tampilData() {
        System.out.println("NPM      : " + npm);
        System.out.println("Nama     : " + nama);
        System.out.println("IPK      : " + ipk);
        System.out.println("Semester : " + semester);
        System.out.println("------------------------");
    }
}


