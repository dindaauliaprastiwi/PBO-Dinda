package tugas;

public class Mahasiswa {

    String nim;
    String nama;
    String jurusan;
    int semester;
    double ipk;

    public Mahasiswa() {

    }

    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }

    public Mahasiswa(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("Semester  : " + semester);
        System.out.println("IPK       : " + ipk);
    }

    public String getNama() {
        return nama;
    }

    public void createData() {
        System.out.println("SQL CREATE:");
        System.out.println("INSERT INTO mahasiswa VALUES ('"
                + nim + "', '"
                + nama + "', '"
                + jurusan + "', "
                + semester + ", "
                + ipk + ");");
    }

    public void readData() {
        System.out.println("SQL READ:");
        System.out.println("SELECT * FROM mahasiswa;");
    }

    public void updateData() {
        System.out.println("SQL UPDATE:");
        System.out.println("UPDATE mahasiswa SET nama='"
                + nama + "' WHERE nim='"
                + nim + "';");
    }

    public void deleteData() {
        System.out.println("SQL DELETE:");
        System.out.println("DELETE FROM mahasiswa WHERE nim='"
                + nim + "';");
    }
}