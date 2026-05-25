package tugas;

public class Main {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();

        System.out.println("===== OBJECT 1 =====");
        mhs1.tampilData();

        Mahasiswa mhs2 = new Mahasiswa(
                "231001",
                "Dinda",
                "Teknik Informatika",
                4,
                3.85
        );

        System.out.println("\n===== OBJECT 2 =====");
        mhs2.tampilData();

        System.out.println("Nama : " + mhs2.getNama());

        mhs2.createData();
        mhs2.readData();
        mhs2.updateData();
        mhs2.deleteData();

        Mahasiswa mhs3 = new Mahasiswa(
                "Aulia",
                "Sistem Informasi"
        );

        System.out.println("\n===== OBJECT 3 =====");
        mhs3.tampilData();

        MahasiswaAktif aktif = new MahasiswaAktif(
                "231002",
                "Budi",
                "Sistem Informasi",
                2,
                3.70,
                "HIMSI",
                "Aktif"
        );

        System.out.println("\n===== CLASS TURUNAN =====");

        aktif.tampilData();
        aktif.tampilOrganisasi();
        aktif.tampilStatus();

        aktif.createData();
        aktif.readData();
        aktif.updateData();
        aktif.deleteData();
    }
}