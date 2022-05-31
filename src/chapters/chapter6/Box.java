package chapters.chapter6;

public class Box {

    double width;
    double heigth;
    double depth;


    Box() {
        System.out.println("Box օբյեկտի կոնստրուկտավորում ");
        width = 10;
        heigth = 10;
        depth = 10;
    }

    //                          Մեթոդի հայտարարում
    void volume() {
        System.out.print("Ծավալը հավասար է ");
        System.out.println(width * heigth * depth);
    }


    void setDim(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;

    }


    double volume2() {
        return width * depth * heigth;

    }
}



