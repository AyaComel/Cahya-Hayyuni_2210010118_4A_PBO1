package tugasuas;

public class KausKaki {
    // Atribut enkapsulasi
    private String merek;
    private String jenis;

    // Konstruktor
    public KausKaki(String merek, String jenis) {
        this.merek = merek;
        this.jenis = jenis;
    }

    // Mutator (setter)
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Akses (getter)
    public String getMerek() {
        return merek;
    }

    public String getJenis() {
        return jenis;
    }

    public String displayInfo() {
        return "Merek: " + getMerek() +
                "\nJenis: " + getJenis();
    }

    // Polimorfisme overloading
    public String displayInfo(String ukuran) {
        return displayInfo() + "\nUkuran: " + ukuran;
    }
}