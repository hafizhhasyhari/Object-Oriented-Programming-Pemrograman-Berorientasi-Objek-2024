package dataStructure.queue.priorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DataStructureQueuePriorityQueue {
    public static void main(String[] args) {

        /*
         * Priority Queue = FIFO (First In First Out); struktur data yang melayani elemen
         * dengan prioritas tertinggi terlebih dahulu sebelum elemen dengan prioritas lebih rendah.
         * */

        /*
         * @Pesan: Membuat antrian kosong menggunakan LinkedList
         * */
        Queue<Double> queueLinkedList = new LinkedList<>();

        /*
         * @offer() — menambahkan objek baru ke dalam antrian
         * */
        queueLinkedList.offer(3.0);
        queueLinkedList.offer(1.0);
        queueLinkedList.offer(2.0);
        queueLinkedList.offer(4.0);

        /*
         * @Cetak untuk pemisah dan penjelasan tentang apa itu Queue.
         * */
        System.out.println();
        System.out.println("             Diorganisir dengan LinkedList");
        System.out.println("////////////////////////////////////////////////////");
        System.out.println();

        /*
         * @While, loop dengan kondisi bahwa antrian tidak kosong akan dieksekusi dengan poll().
         * */
        while (!queueLinkedList.isEmpty()) {
            /*
             * @Cetak() @poll() — mencetak antrian dan menghapus elemen pertama
             * */
            System.out.println(queueLinkedList.poll());
        }

        /*
         * @Cetak untuk pemisah dan penjelasan tentang apa itu Queue.
         * */
        System.out.println();
        System.out.println("             Diorganisir dengan PriorityQueue");
        System.out.println("////////////////////////////////////////////////////");
        System.out.println();

        /*
         * @Pesan: Membuat antrian kosong menggunakan PriorityQueue
         * */
        Queue<Double> queuePriority = new PriorityQueue<>();

        /*
         * @offer() — menambahkan objek baru ke dalam antrian
         * */
        queuePriority.offer(3.0);
        queuePriority.offer(1.0);
        queuePriority.offer(2.0);
        queuePriority.offer(4.0);

        /*
         * @While, loop dengan kondisi bahwa antrian tidak kosong akan dieksekusi dengan poll().
         * */
        while (!queuePriority.isEmpty()) {
            /*
             * @Cetak() @poll() — mencetak antrian dan menghapus elemen pertama
             * */
            System.out.println(queuePriority.poll());
        }

        /*
         * @Cetak untuk pemisah dan penjelasan tentang apa itu Queue.
         * */
        System.out.println();
        System.out.println("Diorganisir dengan PriorityQueue menggunakan Collections ReverseOrder");
        System.out.println("//////////////////////////////////////////////////////////////////////////");
        System.out.println();

        /*
         * @Pesan: Membuat antrian kosong menggunakan PriorityQueue dengan Collections ReverseOrder
         * ReverseOrder() membalik urutan elemen dalam antrian.
         * */
        Queue<Double> queuePriorityCollections = new PriorityQueue<>(Collections.reverseOrder());

        /*
         * @offer() — menambahkan objek baru ke dalam antrian
         * */
        queuePriorityCollections.offer(3.0);
        queuePriorityCollections.offer(1.0);
        queuePriorityCollections.offer(2.0);
        queuePriorityCollections.offer(4.0);

        /*
         * @While, loop dengan kondisi bahwa antrian tidak kosong akan dieksekusi dengan poll().
         * */
        while (!queuePriorityCollections.isEmpty()) {
            /*
             * @Cetak() @poll() — mencetak antrian dan menghapus elemen pertama
             * */
            System.out.println(queuePriorityCollections.poll());
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
