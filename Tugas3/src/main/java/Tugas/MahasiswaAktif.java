package tugas;

public class MahasiswaAktif extends Mahasiswa {

    String organisasi;
    String status;

    public MahasiswaAktif(String nim, String nama, String jurusan,
            int semester, double ipk,
            String organisasi, String status) {

        super(nim, nama, jurusan, semester, ipk);

        this.organisasi = organisasi;
        this.status = status;
    }

    public void tampilOrganisasi() {
        System.out.println("Organisasi : " + organisasi);
    }

    public void tampilStatus() {
        System.out.println("Status     : " + status);
    }
}