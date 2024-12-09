package dataStructure.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DataStructureQueue {
    public static void main (String[] args) {

        /*
        * Queue:  FIFO (First In First Out); Menyimpan objek dalam bentuk “Menara Horizontal”.
        * Koleksi yang dirancang untuk menahan elemen-elemen sebelum diproses.
        *   Insert   --    add()     = enqueue(), offer()
        * Remove --  remove()  = dequeue(), poll()
        * Examine --  element() = peek()
        * add(), remove(), element() akan menghasilkan Exception jika antrian kosong.
        * offer(), poll(), peek() hanya akan menghasilkan Exception jika antrian penuh.
        * Queue adalah sebuah interface, dan kita tidak bisa membuat objek darinya, karena menggunakan implementasi 'LinkedList' atau 'PriorityQueue'.
        * */

        /*
        * Kelas Queue memperluas Collections dan dapat mengimplementasikan banyak fungsi dari Collections.
        * isEmpty()  untuk memeriksa apakah antrian kosong.
        * size()     untuk mengetahui ukuran antrian.
        * contains() untuk memeriksa apakah antrian mengandung suatu elemen.
        * */

        //   Di mana antrian berguna?
        //
        //   1. Buffer Keyboard (huruf yang muncul di layar sesuai dengan urutan penekanan tombol)
        //   2. Antrian Printer (Pekerjaan cetak harus diselesaikan sesuai urutan)
        //   3. Digunakan dalam LinkedLists, PriorityQueues dan algoritma Breadth First Search.

        /*
         * @Pesan : Membuat antrian kosong menggunakan LinkedList
         *  */
        Queue<String> queue = new LinkedList <String>();

        /*
        * @isEmpty() — memeriksa apakah antrian kosong
        * */
        System.out.println ("Antrian kosong:  " + queue.isEmpty());

        /*
         * @offer() — menambahkan objek baru ke antrian
         * @Pesan: akan menggunakan nama orang untuk mensimulasikan antrean pembayaran.
         * */
        queue.offer ("Antonieta");
        queue.offer ("Lucas");
        queue.offer ("Gabriel");
        queue.offer ("Paulo");
        queue.offer ("Suzana");
        queue.offer ("Caneo");
        queue.offer ("Alica");
        queue.offer ("Andrea");

        /*
         * @isEmpty() — memeriksa apakah antrian kosong
         * */
        System.out.println ("Antrian kosong:  " + queue.isEmpty());

        /*
        * @size() — mendapatkan ukuran antrian
        * */
        System.out.println ("Ukuran antrian adalah:  " + queue.size());

        /*
        * @contains() — memeriksa apakah antrian mengandung elemen tertentu
        * */

        System.out.println ("Apakah antrian mengandung nama 'Lucas':  " + queue.contains ("Lucas"));

        /*
         *@println() — mencetak elemen pertama dalam antrian
         *@peek() — mengembalikan nama pertama dalam antrean untuk diproses tetapi tidak menghapusnya.
         */
        System.out.println ("Nama pertama dalam antrian adalah: " + queue.peek());

        /*
         * @println() — mencetak antrean (daftar orang) kita
         * */
        System.out.println (queue);

        /*
        * @poll() — menghapus objek pertama dari antrian
        * */
        queue.poll();

        /*
        * @println() — mencetak antrean setelah menghapus orang pertama
        * */
        System.out.println (queue);

        /*
         * @poll() — menghapus objek pertama dari antrian
         * */
        queue.poll();

        /*
         * @println() — mencetak antrean setelah menghapus orang pertama
         * */
        System.out.println (queue);

        /*
         * @poll() — menghapus objek pertama dari antrian
         * */
        queue.poll();

        /*
         * @println() — mencetak antrean setelah menghapus orang pertama
         * */
        System.out.println (queue);

        /*
         * @poll() — menghapus objek pertama dari antrian
         * */
        queue.poll();

        /*
         * @println() — mencetak antrean setelah menghapus orang pertama
         * */
        System.out.println (queue);

        /*
         * @poll() — menghapus objek pertama dari antrian
         * */
        queue.poll();

        /*
         * @println() — mencetak antrean setelah menghapus orang pertama
         * */
        System.out.println (queue);

        /*
         * @poll() — menghapus objek pertama dari antrian
         * */
        queue.poll();

        /*
         * @println() — mencetak antrean setelah menghapus orang pertama
         * */
        System.out.println (queue);

        /*
         * @poll() — menghapus objek pertama dari antrian
         * */
        queue.poll();

        /*
         * @println() — mencetak antrean setelah menghapus orang pertama
         * */
        System.out.println (queue);

        /////////////////////////////////////////////////////
        //@Pesan: Menggunakan poll() setelah antrian kosong tidak akan menimbulkan Exception.
        /////////////////////////////////////////////////////

        /*
        * @return hanya antrian kosong.
        * */
        queue.poll();
        System.out.println (queue);

        /////////////////////////////////////////////////////
        //@Pesan: Menggunakan element() setelah antrian kosong akan menghasilkan Exception.
        //@Return @Exception java.util.NoSuchElementException
        //@try-catch untuk menangani Exception.
        /////////////////////////////////////////////////////

        try{
            queue.element();
        } catch ( NoSuchElementException e ){
            System.out.println ("Antrian kosong dan terjadi Exception:  " + e);
        }

        //Bekerja dengan perulangan

        /*
         * @Pesan : Membuat antrian kosong dengan prioritas
         * */
        Queue<Double> queueDouble = new LinkedList <> ();

        /*
         * @offer() — menambahkan objek baru ke antrian
         * */
        queueDouble.offer (3.0);
        queueDouble.offer (1.0);
        queueDouble.offer (2.0);
        queueDouble.offer (4.0);

        /*
         * @While: perulangan yang berjalan selama antrian tidak kosong
         * */
        while(!queueDouble.isEmpty()) {
            /*
             * @println() @poll() — mencetak elemen dan menghapus elemen pertama dari antrian
             * */
            System.out.println (queueDouble.poll());
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
