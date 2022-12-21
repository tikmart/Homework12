public class BMW extends Car {
    private boolean hasXdrive;

    //default constructor
    BMW() {
        super();
        setManufacturer("BMW");
    }


    //constructor with arguments
    BMW(boolean hasXdrive, String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price) {

        super("BMW", carModel, color, prodYear, prodMonth, prodDay, engineVolume, enginePower, fuelConsumption, price);
        this.hasXdrive = hasXdrive;
    }

    //setters and getters for xdrive
    public void setHasXdrive(boolean hasXdrive) {
        this.hasXdrive = hasXdrive;
    }

    public boolean hasXdrive() {
        return hasXdrive;
    }


    @Override
    public void print() {
        if (hasXdrive){
            System.out.println("Car model: " + getManufacturer() + " " + getCarModel() + " X-Drive");
            System.out.println("Color: " + getColor());
            System.out.println("Production date: " + getProdDay() + "." + getProdMonth() + "." + getProdYear());
            System.out.println("Engine characteristics: ");
            System.out.println("Volume: " + getEngineVolume() + "L");
            System.out.println("Power: " + getEnginePower() + " HP");
            System.out.println("Fuel consumption: " + getFuelConsumption() + " L/100 km");
            System.out.println("-------------------------");
            System.out.println("Price: " + getPrice());
        }
        else
            super.print();
    }
}
