
class Pengguna {
    int umur;
    double bb;
    double tb;
    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        double tinggiMeter = tb / 100;
        return bb / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return bb * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + bb + " kg");
        System.out.println("Tinggi: " + tb + " cm");
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari\n", hitungKalori());
        System.out.println("====================================");
    }
}
