package homework.braceChecker;

public class Stack {
    private char[] array = new char[10];
    private int size;

    Stack() {
        size = -1;
    }

    public void push(char c) {
        if (size == 9) {
            System.out.println("stack is full");
        } else {
            array[++size] = c;
        }
    }

    public char pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }


}
