public class Karyawan {
    String id;
    String nama;
    String jabatan;
    int gaji;

    // Constructor tanpa parameter
    public Karyawan() {
        id = "000";
        nama = "Default";
        jabatan = "Staff";
        gaji = 0;
    }

    // Constructor dengan parameter
    public Karyawan(String id, String nama, String jabatan, int gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Method tanpa nilai balik
    public void tampilData() {
        System.out.println("ID       : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Jabatan  : " + jabatan);
        System.out.println("Gaji     : " + gaji);
    }

    // Method dengan nilai balik
    public int hitungBonus(int persen) {
        return gaji * persen / 100;
    }
}