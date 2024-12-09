/*
 * Linked List
 * Nama: Hafizh Hilman Asyhari
 * Kelas: D
 * Tahun: 2024
 * Negara: Indonesia
 * Github: hafizhhasyhari
 */

package dataStructure.linkedList;

import java.util.LinkedList;

public class DataStructureLinkedList {
    public static void main(String[] args) {

        // Membuat LinkedList kosong dengan tipe data String
        LinkedList<String> linkedListPush = new LinkedList<>();

/*
*LinkedList = menyimpan Node dalam 2 bagian (data + alamat)
* Node berada di lokasi memori yang tidak berurutan
* Elemen ditautkan menggunakan pointer.
*
* Single Linked List
* Node Node Node
* [data|alamat] -> [data|alamat] ->[data|alamat]
*
* Double Linked List
* Node Node
* [data|alamat] <--> [data|alamat]
*
* Keuntungan?
* 1. Struktur data yang dinamis. (Mengalokasikan memori yang dibutuhkan saat berjalan)
* 2. Penyisipan dan Penghapusan Node mudah. ​​0(1)
* 3. Tidak ada/sedikit pemborosan memori.
* *
* Kerugian?
* 1. Penggunaan memori yang lebih besar (pointer tambahan)
* 2. Tidak ada akses acak elemen (tidak ada indeks [i])
* 3. Mengakses/Mencari elemen lambat.
*
* Kegunaan?
* 1. implementasi tumpukan dan antrean
* 2. navigasi GPS
* 3. daftar putar musik.
*
* LinkedList adalah struktur data linear. Dapat diatur dengan berbagai cara. Dan Menambahkan dan Menghapus elemen dengan berbagai cara.
* LinkedList memungkinkan penambahan di antara elemen menggunakan indeks atau menggunakan nilai.
* Saat digunakan Push, Atur elemen pertama di posisi terakhir, dan elemen terakhir di posisi pertama.
* Saat digunakan Offer, Atur elemen pertama di posisi pertama, dan elemen terakhir di posisi terakhir.
* Linked List dialokasikan dalam memori sebagai rantai simpul. Satu simpul pertama dan satu simpul terakhir.
* LinkedList mengimplementasikan List, Deque, Cloneable, Serializable.
* Deque adalah keseluruhan struktur data lainnya, ini adalah antrean berujung ganda dan memiliki dua belas metode. Tambahkan Head dan Tail, dan hapus head dan tail. Beberapa memiliki Pengecualian, beberapa tidak. * LinkedList memiliki beberapa metode:
* addFirst() dan addLast() ===== offerFirst() dan offerLast()
* removeFirst() dan removeLast() ===== pollFirst() dan pollLast()
* getFirst() dan getLast() ===== peekFirst() dan peekLast()
*
* push() — menambahkan objek baru
* pop() — menghapus objek terakhir
* peek() — mengembalikan objek terakhir
* */

/*
* @print untuk pemisahan dan memberi tahu apa itu Queue.
* */
      
        // Menambahkan elemen dengan push (LIFO)
        linkedListPush.push("A");
        linkedListPush.push("B");
        linkedListPush.push("C");
        linkedListPush.push("D");
        linkedListPush.push("E");
        linkedListPush.push("F");

        // Menampilkan LinkedList setelah penambahan
        System.out.println(linkedListPush);

        // Menghapus elemen terakhir dengan pop()
        linkedListPush.pop();

        // Menampilkan LinkedList setelah penghapusan
        System.out.println(linkedListPush);

        System.out.println();
        System.out.println("Diatur dengan LinkedList dan Offer");
        System.out.println("////////////////////////////////////////////////////");
        System.out.println();

        // Membuat LinkedList kosong dengan tipe data String
        LinkedList<String> linkedListOffer = new LinkedList<>();

        // Menambahkan elemen dengan offer (FIFO)
  		/*
		* @push() — add objek baru. Elemen pertama berada di posisi terakhir, dan elemen terakhir berada di posisi pertama.
    		 */
        linkedListOffer.offer("A");
        linkedListOffer.offer("B");
        linkedListOffer.offer("C");
        linkedListOffer.offer("D");
        linkedListOffer.offer("F");
        linkedListOffer.offer("G");

        // Menampilkan LinkedList setelah penambahan
        System.out.println(linkedListOffer);

        // Mencari posisi elemen 'D' dan 'E' dalam LinkedList
        System.out.println("Posisi objek 'D': " + linkedListOffer.indexOf("D"));
        System.out.println("Posisi objek 'E': " + linkedListOffer.indexOf("E"));

        // Menampilkan elemen pertama dan terakhir
        System.out.println("Elemen pertama adalah: " + linkedListOffer.peekFirst());
        System.out.println("Elemen terakhir adalah: " + linkedListOffer.peekLast());

        // Menambahkan elemen 'E' di indeks ke-4
        linkedListOffer.add(4, "E");

        // Menampilkan LinkedList setelah penambahan
        System.out.println(linkedListOffer);

        // Menambahkan elemen di posisi pertama dan terakhir
        linkedListOffer.addFirst("0");
        linkedListOffer.addLast("H");
        System.out.println(linkedListOffer);

        // Menghapus elemen pertama dan terakhir
        String removeFirst = linkedListOffer.removeFirst();
        String removeLast = linkedListOffer.removeLast();
        System.out.println("Menghapus elemen pertama: " + removeFirst);
        System.out.println("Menghapus elemen terakhir: " + removeLast);
        System.out.println(linkedListOffer);

        // Menghapus elemen 'E'
        linkedListOffer.remove("E");

        // Menampilkan LinkedList setelah penghapusan
        System.out.println(linkedListOffer);

        // Menghapus elemen pertama dengan poll()
        linkedListOffer.poll();

        // Menampilkan LinkedList setelah penghapusan
        System.out.println(linkedListOffer);
    }
}
