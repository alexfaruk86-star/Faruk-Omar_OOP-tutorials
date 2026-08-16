public class Main {

    public static void main(String[] args) {


        Appliance a1 = new Appliance("LG") {

            public void operate() {
                System.out.println("Washing clothes...");
            }

        };


        Appliance a2 = new Appliance("Panasonic") {

            public void operate() {
                System.out.println("Store food & beverages...");
            }

        };


        a1.displayBrand();
        a1.turnOn();
        a1.operate();
        a1.turnOff();


        System.out.println();


        a2.displayBrand();
        a2.turnOn();
        a2.operate();
        a2.turnOff();

    }
}