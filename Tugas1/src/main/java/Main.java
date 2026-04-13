import akademis.MataKuliah;

public class Main {
    public static void main(String[] args) {

        // Object Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("221001", "Dinda", 3.8, 4);
        Mahasiswa mhs2 = new Mahasiswa("221002", "Budi", 3.5, 3);

        // Tampilkan data Mahasiswa
        System.out.println("DATA MAHASISWA");
        mhs1.tampilData();
        mhs2.tampilData();

        // Object MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java");
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data");

        // Tampilkan data MataKuliah
        System.out.println("DATA MATA KULIAH");
        mk1.tampilData();
        mk2.tampilData();
    }
}

