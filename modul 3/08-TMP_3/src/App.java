class HitungGajiBersih {
    // Atribut
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    // Setter dan Getter untuk gaji pokok
    public void setGajiPokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public int getGajiPokok() {
        return gaji_pokok;
    }

    // Setter dan Getter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    // Setter dan Getter untuk pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getPajak() {
        return (pajak / 100) * (gaji_pokok + tunjangan);
    }

    // Method untuk menghitung gaji bersih
    public double cetakGajiBersih() {
        double gajiKotor = gaji_pokok + tunjangan;
        double potonganPajak = gajiKotor * (pajak / 100);
        return gajiKotor - potonganPajak;
    }
}

public class App{
    public static void main(String[] args) {
        // Instansi objek HitungGajiBersih
        HitungGajiBersih gaji = new HitungGajiBersih();

        // Mengatur nilai gaji pokok, tunjangan, dan pajak
        gaji.setGajiPokok(5000000); // gaji pokok, Rp. 5.000.000
        gaji.setTunjangan(2000000); // tunjangan Rp. 2.000.000
        gaji.setPajak(10); // pajak 10%

        // Menampilkan gaji bersih
        System.out.println("Gaji Bersih: Rp. " + gaji.cetakGajiBersih());
        System.out.println("Pajak yang dibayarkan: Rp. " + gaji.getPajak());
    }
}