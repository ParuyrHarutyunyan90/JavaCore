package chapters.chapter8.figureExtends;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("մակերեսը որոշված չէ");
        return 0;
    }
}
