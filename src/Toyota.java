public class Toyota extends Car{
    private boolean isCamry;

    //default constructor
    Toyota() {
        super();
        setManufacturer("Toyota");
    }


    //constructor with arguments
    Toyota(String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price) {

        super("Toyota", carModel, color, prodYear, prodMonth, prodDay, engineVolume, enginePower, fuelConsumption, price);

    }

    //setters and getters for amg
    public void setAMG(boolean isCamry) {
        this.isCamry = isCamry;
    }

    public boolean isCamry() {
        return isCamry;
    }


    @Override
    public void print() {
        if (isCamry == getManufacturer().equals("Camry")){
            System.out.println("Car model: " + getManufacturer() + " " + getCarModel() + " definetely a Camry!!");
            System.out.println("Color: " + getColor());
            System.out.println("Production date: " + getProdDay() + "." + getProdMonth() + "." + getProdYear());
            System.out.println("Engine characteristics: ");
            System.out.println("Volume: " + getEngineVolume() + "L");
            System.out.println("Power: " + getEnginePower() + " HP");
            System.out.println("Fuel consumption: " + getFuelConsumption() + " L/100 km");
            System.out.println("-------------------------");
            System.out.println("Price: " + getPrice());
        }
        else {
            super.print();
            System.out.println("Not a Camry");
        }
    }
}
