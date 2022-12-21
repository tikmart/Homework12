public class Audi extends Car{

    // expected FWD, AWD, RWD
    private String driveType;

    //default constructor
    Audi(){
        super();
        setManufacturer("Audi");
    }

    //constructor with arguments
    Audi(String driveType, String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price){
       super("Audi", carModel, color, prodYear, prodMonth, prodDay, engineVolume, enginePower, fuelConsumption, price);
       this.driveType = driveType;
    }

    //setters and getters for drive type
    public void setDriveType(String driveType){
        this.driveType = driveType;
    }

    public String getDriveType(){
        return driveType;
    }

    @Override
    public void print() {
        if (!driveType.equals("")){
            System.out.println("Car model: " + getManufacturer() + " " + getCarModel() + " " + driveType);
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
