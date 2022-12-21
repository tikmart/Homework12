public class Car {
    private String manufacturer;
    private String carModel;
    private String color;

    //production date
    private int prodYear;
    private int prodMonth;
    private int prodDay;

    //engine characteristics
    private double engineVolume;
    private double enginePower;
    private double fuelConsumption;

    private int price;

    //constructors

    //default constructor
    Car() {

    }

    //with arguments
    Car(String manufacturer,String carModel, String color, int prodYear, int prodMonth, int prodDay, double engineVolume, double enginePower, double fuelConsumption, int price) {

        this.manufacturer = manufacturer;
        this.carModel = carModel;
        this.color = color;

        this.prodYear = prodYear;
        this.prodMonth = prodMonth;
        this.prodDay = prodDay;

        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.fuelConsumption = fuelConsumption;

        this.price = price;
    }

    //production date checkers

    //only allowed cars produced later than 1950
    private boolean yearCheck(int year) {
        boolean yearIsValid;

        if (year < 1950) {
            yearIsValid = false;
            System.out.println("Car should be produced later then 1950");
        } else if (year > 2022) {
            yearIsValid = false;
            System.out.println("Cannot be produced than 2022");
        } else
            yearIsValid = true;

        return yearIsValid;


    }

    private boolean monthCheck(int month) {
        boolean isValidMonth;
        if (month <= 0) {
            isValidMonth = false;
            System.out.println("Month cannot be 0 or negative");
        } else if (month > 12) {
            isValidMonth = false;
            System.out.println("Month cannot be > 12");
        } else
            isValidMonth = true;


        return isValidMonth;
    }

    //dayRangeCheck for day checker
    private boolean dayRange(int d, int maxDay) {
        if (d > maxDay) {
            System.out.println("Days of this month cannot be more than" + maxDay);
            return false;
        } else
            return true;

    }

    private boolean dayCheck(int day, int month) {
        boolean isValidDay = true;

        if (day <= 0) {
            isValidDay = false;
            System.out.println("The day cannot be 0 or negative");
        } else if (day > 31) {
            isValidDay = false;
            System.out.println("Day cannot be > 31");
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    isValidDay = dayRange(day, 31);
                    break;
                case 2:
                    isValidDay = dayRange(day, 28);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    isValidDay = dayRange(day, 30);
                    break;


            }
        }

        return isValidDay;
    }

    //cars with engine not larger than 15 allowed
    private boolean engineVolumeCheck(double volume) {
        boolean isValid;
        if (volume <= 0) {
            isValid = false;
            System.out.println("Volume cannot be 0 or negative");
        } else if (volume > 15) {
            isValid = false;
            System.out.println("Engine should be less than 15");
        } else
            isValid = true;


        return isValid;
    }

    private boolean enginePowerCheck(double power) {
        boolean isValid;
        if (power <= 0) {
            isValid = false;
            System.out.println("The power cannot be 0 or negative");
        } else
            isValid = true;


        return isValid;
    }

    private boolean priceCheck(int price) {
        boolean isValid;
        if (price <= 0) {
            isValid = false;
            System.out.println("The power cannot be 0 or negative");
        } else
            isValid = true;


        return isValid;
    }

    private boolean fuelCheck(double fuel) {
        boolean isValid;
        if (fuel <= 0) {
            isValid = false;
            System.out.println("Fuel consumption cannot be 0 or negative");
        } else
            isValid = true;


        return isValid;
    }


    //setters

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setProdYear(int prodYear) {
        if (yearCheck(prodYear))
            this.prodYear = prodYear;
    }

    public void setProdMonth(int prodMonth) {
        if (monthCheck(prodMonth))
            this.prodMonth = prodMonth;
    }

    public void setProdDay(int prodDay) {
        if (dayCheck(prodDay, prodMonth))
            this.prodDay = prodDay;

    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolumeCheck(engineVolume))
            this.engineVolume = engineVolume;
    }

    public void setEnginePower(double enginePower) {
        if (enginePowerCheck(enginePower))
            this.enginePower = enginePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (fuelCheck(fuelConsumption))
            this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(int price) {
        if (priceCheck(price))
            this.price = price;
    }

    //getters

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColor() {
        return color;
    }

    public int getProdYear() {
        return prodYear;
    }

    public int getProdMonth() {
        return prodMonth;
    }

    public int getProdDay() {
        return prodDay;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }


    public void print() {
        System.out.println("Car model: " + getManufacturer() + " " + getCarModel());
        System.out.println("Color: " + getColor());
        System.out.println("Production date: " + getProdDay() + "." + getProdMonth() + "." + getProdYear());
        System.out.println("Engine characteristics: ");
        System.out.println("Volume: " + getEngineVolume() + "L");
        System.out.println("Power: " + getEnginePower() + " HP");
        System.out.println("Fuel consumption: " + getFuelConsumption() + " L/100 km");
        System.out.println("-------------------------");
        System.out.println("Price: " + getPrice() + "$");

    }

}








































