package akademis;

public class MataKuliah {
    String kodeMk;
    String namaMk;

    // Constructor
    public MataKuliah(String kodeMk, String namaMk) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("Kode MK : " + kodeMk);
        System.out.println("Nama MK : " + namaMk);
        System.out.println("------------------------");
    }
}

