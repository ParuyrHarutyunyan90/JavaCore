package chapters.chapter8.ExtendsBox;

public class DemoShipment {
    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10,20,25,30, 3.14);
        Shipment shipment2 = new Shipment(2,3,4,0.76, 2.28);
        System.out.println(shipment1.volume());
        System.out.println(shipment1.weight);
    }
}
