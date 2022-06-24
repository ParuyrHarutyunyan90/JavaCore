package classwork.students;

public class StudentStorage {

    private Student[] array = new Student[10];
    private int size = 0;

    void add(Student student) {
        if (size == array.length) {
            inccreaseArray();
        }
        array[size++] = student;
    }

    private void inccreaseArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i] + " ");
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    Student detByIndex(int i) {
        return array[i - 1];
    }

    int getFirstIndexByValue(Student student) {
        for (int i = 0; i < size; i++) {
            if (array[i] == student) {
                return i;
            }
        }
        return -1;  // -1 քանի որ 0-ն նույնպես մասիվի ինդեքս է
    }

    void set(int i, Student student) {
        array[i] = student;
    }

    void add(int index, Student value) {
        if (size + 1 == array.length) {
            inccreaseArray();
        }
        Student temp;
        for (int i = size; i >= index; i--) {
            temp = array[i];
            array[i + 1] = temp;
            array[i + 1] = array[i];
        }
        size++;
        array[index] = value;
    }

    void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                Student temp;
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void printStudentByLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }


    public void changeLesson(int index, String lessonChange) {
        if (index >= 0 && index < size) {
            array[index].setLesson(lessonChange);
        }
    }
}
