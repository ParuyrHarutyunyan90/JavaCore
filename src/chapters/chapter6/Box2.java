package chapters.chapter6;

public class Box2 {
    double width;
    double heigth;
    double depth;

    Box2(double w, int h, double d) {
        width = w;
        heigth = h;
        depth = d;

    }

    Box2() {
        width = 10;
        heigth = 10;
        depth = 10;


    }

    double volume() {
        return width * depth * heigth;
    }

}
