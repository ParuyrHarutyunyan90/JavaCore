package classwork.students.storage;

import classwork.students.model.Lesson;


public class LessonStorage {

    private Lesson[] array = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == array.length) {
            inccreaseArray();
        }
        array[size++] = lesson;
    }

    private void inccreaseArray() {
        Lesson[] temp = new Lesson[array.length + 10];
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

   public boolean isEmpty() {
        return size == 0;
    }

     public Lesson getByIndex(int i) {
        return array[i - 1];
    }

   public int getFirstIndexByValue(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (array[i] == lesson) {
                return i;
            }
        }
        return -1;  // -1 քանի որ 0-ն նույնպես մասիվի ինդեքս է
    }

    public void set(int i, Lesson lesson) {
        array[i] = lesson;
    }

    public void add(int index, Lesson value) {
        if (size + 1 == array.length) {
            inccreaseArray();
        }
        Lesson temp;
        for (int i = size; i >= index; i--) {
            temp = array[i];
            array[i + 1] = temp;
            array[i + 1] = array[i];
        }
        size++;
        array[index] = value;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                Lesson temp;
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

//    public void printStudentByLesson(String lessonName) {
//        for (int i = 0; i < size; i++) {
//            if (array[i].getLesson().equals(lessonName)) {
//                System.out.println(array[i]);
//            }
//        }
//      }

//    public void changeLesson(int index, String lessonChange) {
//        if (index >= 0 && index < size) {
//            array[index].setLesson(lessonChange);
//        }
//    }
}
