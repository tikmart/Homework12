public class Mercedes extends Car {

    private boolean isAMG;

    //default constructor
    Mercedes() {
        super();
        setManufacturer("Mercedes Benz");
    }


    //constructor with arguments
    Mercedes(boolean isAMG, String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price) {

        super("Mercedes Benz", carModel, color, prodYear, prodMonth, prodDay, engineVolume, enginePower, fuelConsumption, price);
        this.isAMG = isAMG;
    }

    //setters and getters for amg
    public void setAMG(boolean isAMG) {
        this.isAMG = isAMG;
    }

    public boolean getAMG() {
        return isAMG;
    }


    @Override
    public void print() {
        if (isAMG){
            System.out.println("Car model: " + getManufacturer() + " " + getCarModel() + " AMG");
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
