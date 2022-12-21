public class Ford extends Car{
    //diesel or gas expected
    private String engineType;

    //default constructor
    Ford(){
        super();
        setManufacturer("Ford");
    }

    //constructor with arguments
    Ford(String engineType,String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price){
        super("Ford", carModel, color, prodYear, prodMonth, prodDay, engineVolume, enginePower, fuelConsumption, price);
        this.engineType = engineType;
    }

    //getter and setter for engine type
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    public String getEngineType(){
        return engineType;
    }


    @Override
    public void print() {
        System.out.println("Car model: " + getManufacturer() + " " + getCarModel());
        System.out.println("Color: " + getColor());
        System.out.println("Production date: " + getProdDay() + "." + getProdMonth() + "." + getProdYear());
        System.out.println("Engine characteristics: ");
        System.out.println("Volume: " + getEngineVolume() + "L" + " " + engineType);
        System.out.println("Power: " + getEnginePower() + " HP");
        System.out.println("Fuel consumption: " + getFuelConsumption() + " L/100 km");
        System.out.println("-------------------------");
        System.out.println("Price: " + getPrice());
    }
}
