public class Nissan extends Car {


    private boolean fourWheelDrive = true;

    //default constructor
    Nissan() {
        super();
        super.setManufacturer("Nissan");
    }

    //constructor with arguments
    Nissan(boolean fourWheelDrive, String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price) {
        super("Nissan", carModel, color, prodYear, prodMonth, prodDay, engineVolume, enginePower, fuelConsumption, price);
        this.fourWheelDrive = fourWheelDrive;

    }

    //setter and getter for isFourWheelDrive
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;

    }

    public boolean getFourwheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public void print() {
        super.print();
        if (fourWheelDrive)
            System.out.println("Four wheel drive option:  YES");
        else
            System.out.println("Four wheel drive option:  NO");
    }
}
