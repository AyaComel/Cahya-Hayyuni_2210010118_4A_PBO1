package tugasuas;

public class KausKakiDetail extends KausKaki {
    // Konstruktor
    public KausKakiDetail(String merek, String jenis) {
        super(merek, jenis);
    }

    public int getKetebalan() {
        return Integer.parseInt(getJenis().substring(0, 2));
    }

    public String getBahan() {
        String kodeBahan = getJenis().substring(2, 4);
        // Seleksi menggunakan if
        if (kodeBahan.equals("CT")) {
            return "Katun";
        } else if (kodeBahan.equals("RB")) {
            return "Sintetik";
        } else {
            return "Bahan yang lain";
        }
    }
    
    public String getWarna() {
        String kodeWarna = getJenis().substring(4, 6);
        // Seleksi menggunakan switch
        switch (kodeWarna) {
            case "01":
                return "Biru";
            case "02":
                return "Merah Muda";
            case "03":
                return "Merah";
            case "04":
                return "Hijau";
            default:
                return "Lainnya";
        }
    }
    
    public String getTipe() {
        String kodeTipe = getJenis().substring(6, 7);
        switch (kodeTipe) {
            case "1":
                return "Kasual";
            case "2":
                return "Formal";
            case "3":
                return "Olahraga";
            case "4":
                return "Medis";
            default:
                return "Lainnya";
        }
    }

    public int getHarga() {
        return Integer.parseInt(getJenis().substring(7, 8));
    }

    // Polimorfisme overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nKetebalan: " + getKetebalan() +
                "\nBahan: " + getBahan() +
                "\nWarna: " + getWarna() +
                "\nTipe:  " + getTipe()  +
                "\nHarga: " + getHarga();
    }
}