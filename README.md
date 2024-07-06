# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data KausKaki menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek dan jenis KausKai, dan memberikan output berupa informasi detail dari Jenis tersebut seperti ketebalan, baham, warna, tipe, dan harga.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object. Pada kode ini, KausKaki, KausKakiDetail, dan KausKakiBeraksi adalah contoh dari class.

bash
public class KausKaki {
    ...
}

public class KausKakiDetail extends KausKaki {
    ...
}

public class KausKakiBeraksi {
    ...
}


2. *Object* adalah instance dari class. Pada kode ini, kaus[i] = new KausKakiDetail(merek, jenis); adalah contoh pembuatan object.

bash
kaus[i] = new KausKakiDetail(merek, jenis);


3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, merek dan jenis adalah contoh atribut.

bash
String merek;
String jenis;


4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class KausKaki dan KausKakiDetail.

bash
public KausKaki(String merek, String jenis) {
    this.merek = merek;
    this.jenis = jenis;
}

public KausKakiDetail(String merek, String jenis) {
    super(merek, jenis);
}


5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setMerek dan setJenis adalah contoh method mutator.

bash
public void setMerek(String merek) {
        this.merek = merek;
}

public void setJenis(String jenis) {
        this.jenis = jenis;
}

6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getMerek dan getJenis adalah contoh method accessor.

bash
public String getMerek() {
        return merek;
}

public String getJenis() {
        return jenis;
}


7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama dan npm dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

bash
private String merek;
private String jenis;


8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, KausKakiDetail mewarisi KausKaki dengan sintaks extends.

bash
public class KausKakiDetail extends KausKaki {
    ...
}


9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di KausKaki merupakan overloading method displayInfo dan displayInfo di KausKakiDetail merupakan override dari method displayInfo di KausKaki.

bash
public String displayInfo(String ukuran) {
      return displayInfo() + "\nUkuran: " + ukuran;
}

@Override
  public String displayInfo() {
    ...
}


10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getBahan dan seleksi switch dalam method getWarna dan getTipe.

bash
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


11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

bash
for (int i = 0; i < kaus.length; i++) {
    ...
}


12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan merek kaus " + (i + 1) + ": ");
String merek = scanner.nextLine();
System.out.print("Masukkan jenis kaus " + (i + 1) + ": ");
String jenis = scanner.nextLine();

System.out.println("============");
System.out.println("Detail Kaus: ");
System.out.println(kauskaki.displayInfo());


13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, KausKakiDetail[] kaus = new KausKakiDetail[2]; adalah contoh penggunaan array.

bash
KausKakiDetail[] kaus = new KausKakiDetail[2];

14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
      System.out.println("Kesalahan: Format tidak valid " + e.getMessage());
} catch (Exception e) {
      System.out.println("Kesalahan umum: " + e.getMessage());
}


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Cahya Hayyuni
NPM: 2210010118
