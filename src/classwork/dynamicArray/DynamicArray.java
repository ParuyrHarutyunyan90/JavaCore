package classwork.dynamicArray;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            inccreaseArray();
        }
        array[size++] = value;
    }

    private void inccreaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    int detByIndex(int i) {
        return array[i - 1];
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;  // -1 քանի որ 0-ն նույնպես մասիվի ինդեքս է
    }

    void set(int i, int value) {
        array[i] = value;
    }

    void add(int index, int value) {
        if (size + 1 == array.length) {
            inccreaseArray();
        }
        int temp;
        for (int i = size; i >= index; i--) {
            temp = array[i];
            array[i + 1] = temp;
            array[i + 1] = array[i];
        }
        size++;
        array[index] = value;
    }

    void delete(int index) {
        for (int i = index; i < size; i++) {
            int temp;
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        size--;
    }

}
