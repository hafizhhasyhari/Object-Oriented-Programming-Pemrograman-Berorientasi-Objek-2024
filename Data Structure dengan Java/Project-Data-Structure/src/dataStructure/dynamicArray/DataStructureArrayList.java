package dataStructure.dynamicArray.arrayList;

import java.util.ArrayList;

public class DataStructureArrayList {
    public static void main ( String[] args ) {

        // Membuat DynamicArray kosong dengan kapasitas yang ditentukan
        DynamicArray dinamicArray = new DynamicArray ( 5 );
        // Menampilkan kapasitas DynamicArray
        System.out.println ( dinamicArray.capacity );

        // Membuat DynamicArray kosong tanpa kapasitas yang ditentukan
        // Menambahkan beberapa string menggunakan metode add() dan mencetak ArrayList menggunakan metode toString().
        // Menampilkan ukuran (size) dan kapasitas ArrayList.
        DynamicArray dinamicArray2 = new DynamicArray ();

        dinamicArray2.add ( "A" );
        dinamicArray2.add ( "B" );
        dinamicArray2.add ( "C" );
        System.out.println ( dinamicArray2 );
        System.out.println ();

        dinamicArray2.insert ( 0 , "X" );
        System.out.println ( dinamicArray2 );
        System.out.println ();

        System.out.println ( "size: " + dinamicArray2.size );
        System.out.println ( "Capacity: " + dinamicArray2.capacity );
        System.out.println ();

        // Menampilkan metode grow() bekerja
        dinamicArray2.add ( "D" );
        dinamicArray2.add ( "E" );
        dinamicArray2.add ( "F" );
        dinamicArray2.add ( "G" );
        dinamicArray2.add ( "H" );
        dinamicArray2.add ( "I" );
        dinamicArray2.add ( "J" );
        dinamicArray2.add ( "K" );
        dinamicArray2.add ( "L" );
        System.out.println ( dinamicArray2 );
        System.out.println ( "size: " + dinamicArray2.size );
        System.out.println ( "Capacity: " + dinamicArray2.capacity );
        System.out.println ();

        // Menampilkan metode shrink() bekerja
        dinamicArray2.delete ( "A" );
        dinamicArray2.delete ( "B" );
        dinamicArray2.delete ( "C" );
        dinamicArray2.delete ( "D" );
        dinamicArray2.delete ( "E" );
        dinamicArray2.delete ( "F" );
        dinamicArray2.delete ( "G" );
        dinamicArray2.delete ( "H" );
        dinamicArray2.delete ( "I" );
        dinamicArray2.delete ( "J" );
        dinamicArray2.delete ( "K" );
        dinamicArray2.delete ( "L" );
        System.out.println ( dinamicArray2 );
        System.out.println ( "size: " + dinamicArray2.size );
        System.out.println ( "Capacity: " + dinamicArray2.capacity );
        System.out.println ();

        // Mengecek apakah array kosong
        System.out.println ( "empty array: " + dinamicArray2.isEmpty () );
        System.out.println ();

        // Mencari elemen dalam array
        System.out.println ( "Search' A ':  " + dinamicArray2.search ( "A" ) ); // Akan mengembalikan -1 karena elemen 'A' tidak ditemukan
        System.out.println ( "Search ' X ':  " + dinamicArray2.search ( "X" ) );
        System.out.println (); // Akan mengembalikan 0 karena elemen 'X' ditemukan pada indeks 0

        dinamicArray2.insert ( 1 , "B" );
        System.out.println ( "Search ' B ':  " + dinamicArray2.search ( "B" ) ); // Akan mengembalikan 1 karena elemen 'B' ditemukan pada indeks 1
        System.out.println ();

        // Menyebabkan pengecualian untuk menunjukkan apa yang terjadi jika nilai dimasukkan di luar jangkauan. Menggunakan try-catch untuk menangkap error.
        dinamicArray2.insert ( 3 , "C" );
        try {
            System.out.println ( "Search ' C ':  " + dinamicArray2.search ( "C" ) ); // Akan mengembalikan NullPointer karena indeks 2 kosong, dan elemen tidak ditemukan
        } catch ( NullPointerException e ) {
            System.out.println ( "NullPointerException karena indeks 2 kosong, dan Anda tidak bisa menemukan indeks 3 saat mencari." + e.getMessage () );
        }

        // Membuat ArrayList kosong
        ArrayList < String > list = new ArrayList < String > ();
    }
}
