public class Main {
    public static void main(String[] args) {

        // Object tanpa parameter
        Karyawan k1 = new Karyawan();

        // Object dengan parameter
        Karyawan k2 = new Karyawan("001", "Andi", "Manager", 10000000);
        Karyawan k3 = new Karyawan("002", "Budi", "Staff", 5000000);
        Karyawan k4 = new Karyawan("003", "Andi", "Supervisor", 8000000);

        // Tampilkan data
        k1.tampilData();
        System.out.println();

        k2.tampilData();
        System.out.println("Bonus 15% : " + k2.hitungBonus(15));
        System.out.println();

        k3.tampilData();
        System.out.println("Bonus 5% : " + k3.hitungBonus(5));
        System.out.println();

        k4.tampilData();
        System.out.println("Bonus 10% : " + k4.hitungBonus(10));
    }
}