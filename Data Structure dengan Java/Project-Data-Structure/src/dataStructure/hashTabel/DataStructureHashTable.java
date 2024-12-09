/* Hash Tabel dengan Java
* Author : hafizhhasyhari
*/
package strukturData.hashTables;

//
//  Hash Table = Sebuah struktur data yang menyimpan pasangan kunci dan nilai yang unik, misalnya <Integer, String>
//                       Setiap pasangan kunci/nilai dikenal sebagai sebuah Entry
//                       Penyisipan, pencarian, dan penghapusan pasangan kunci/nilai dilakukan dengan cepat
//                       Tidak ideal untuk dataset kecil, tetapi sangat baik untuk dataset besar
//
//              Hashing = Mengambil sebuah kunci dan menghitung sebuah integer (rumus bervariasi tergantung pada kunci & tipe data)
//                               Pada HashTable, kita menggunakan rumus hash % kapasitas untuk menghitung nomor indeks
//
//              key.hashCode() % kapasitas =  indeks
//
//              Bucket = Lokasi penyimpanan yang terindeks untuk satu atau lebih Entry.
//                            Dapat menyimpan beberapa Entry jika terjadi tabrakan (mirip seperti Linked List)
//
//               Tabrakan = Fungsi hash menghasilkan indeks yang sama untuk lebih dari satu kunci
//                                Semakin sedikit tabrakan = semakin efisien.
//
//
//                Kompleksitas waktu: Kasus Terbaik 0(1)
//                                               Kasus Terburuk 0(n)
//

import java.util.Hashtable;

public class StrukturDataHashTable {

    public static void main ( String[] args ) {

        // Membuat objek Hashtable dengan kapasitas 21
        Hashtable<String,String> table = new Hashtable<String,String>(21);

        // Menyisipkan pasangan kunci/nilai ke dalam tabel hash
        table.put("100", "Luffy"); // kunci, nilai
        table.put("123", "Zoro");
        table.put("321", "Sanji");
        table.put("555", "Nami");
        table.put("777", "Usopp");
        table.put("634", "WhiteBeard");

        // Menghapus entri dengan kunci "555"
        table.remove ( "555" );

        // Menampilkan pasangan kunci/nilai setelah penghapusan
        for(String key : table.keySet()){
            System.out.println(key.hashCode ()%21 + " \t" + key.hashCode () + " \t" + key + "\t" + table.get(key));
        }

        System.out.println ( );

        // Menghapus entri dengan kunci "555" lagi (meskipun sudah dihapus sebelumnya)
        table.remove ( "555" );

        // Menampilkan pasangan kunci/nilai setelah penghapusan kedua
        for(String key : table.keySet()){
            System.out.println(key.hashCode ()%21 + " \t" + key.hashCode () + " \t" + key + " \t" + table.get(key));
        }
    }
}

/*
 * Watermark:
 * Nama: Hafizh Hilman Asyhari
 * Kelas: D
 * Tahun: 2024
 * Negara: Indonesia
 * Github: hafizhhasyhari
 */
