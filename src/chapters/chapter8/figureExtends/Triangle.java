package chapters.chapter8.figureExtends;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Եռանկյունու մակերեսը։ ");
        return dim1 * dim2 / 2;
    }
}
