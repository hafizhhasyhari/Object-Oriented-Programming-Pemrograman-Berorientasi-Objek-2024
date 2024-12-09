/* 
Program Dynamic Array dengan Java 
Oleh : hafizhhasyhari
*/
package dataStructure.dynamicArray.arrayList;

public class DynamicArray {
    /*
     * @variable size - ukuran array.
     * @variable capacity - kapasitas array.
     * @variable array - array objek.
     *
     * */

    int size;
    int capacity = 10;
    Object[] array;

    /*
     * @constructor membuat array objek baru dengan kapasitas
     * */
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    /*
     * @constructor @overload membuat array objek baru dengan kapasitas yang ditentukan.
     * */
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    /*
     * @add() — menambahkan objek baru ke dalam array.
     * @jika ukuran lebih besar atau sama dengan kapasitas, maka array akan diperbesar,
     * jika tidak, maka objek akan ditambahkan ke array.
     * */
    public void add(Object data) {
        if (size >= capacity) {
            grow();
        } else {
            array[size] = data;
            size++;
        }
    }

    /*
     * @insert() — menyisipkan objek baru ke dalam array pada indeks yang ditentukan.
     * Jika ukuran lebih besar atau sama dengan kapasitas, array akan diperbesar,
     * jika tidak, objek akan disisipkan pada indeks yang diinginkan.
     * */
    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    /*
     * @remove() — menghapus objek dari array.
     *
     * */
    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
            }
        }
    }

    /*
     * @search() — mencari objek dalam array.
     *
     * */
    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    /*
     * @grow() — memperbesar kapasitas array.
     *
     * */
    private void grow() {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    /*
     * @shrink() — memperkecil kapasitas array.
     *
     * */
    private void shrink() {
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    /*
     * @empty() — mengecek apakah array kosong.
     *
     * */
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * @toString() — mengonversi array menjadi string untuk ditampilkan.
     *  @loop untuk menambahkan spasi setelah setiap objek.
     * @jika array kosong, maka hanya mengembalikan array kosong.
     * */
    public String toString() {
        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
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
