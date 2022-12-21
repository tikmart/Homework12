public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();

        Nissan armada = new Nissan(true, "Armada", "White", 2006, 7, 10, 5.6, 400, 12.4, 25000);
        Mercedes gle = new Mercedes();
        Ford f150 = new Ford("diesel", "F-150", "Gray", 2008, 5, 22, 3.5, 430, 13.1, 41790);
        Audi TT = new Audi("AWD", "TT","Green",2009,9,30, 3.2, 250, 10.6,55000);
        BMW xFive = new BMW(true,"X5", "White", 2017,12,2,3.0,300,10.4,50000);
        Toyota camry = new Toyota("Camry","Red",2014, 4, 30, 2.5,178,6,23740);


        gle.setCarModel("GLE 53 Coupe");
        gle.setAMG(true);
        gle.setColor("Black");

        gle.setProdYear(2020);
        gle.setProdMonth(3);
        gle.setProdDay(4);

        gle.setEngineVolume(3.0);
        gle.setEnginePower(429);
        gle.setFuelConsumption(9.3);

        gle.setPrice(95200);

//        camry.print();

        Car[] carsArr = {gle,xFive,camry,f150,TT,armada};



        //find the newest car
        findNewest(carsArr);

        System.out.println("------------------------------------------");

        //find the most expensive
        findMostExpensive(carsArr);

        System.out.println("------------------------------------------");

        //find the car with most powerful engine
        findMostPow(carsArr);

        System.out.println("------------------------------------------");

        //find the car with largest engine volume
        findLargestVol(carsArr);

    }



    static void findNewest(Car[] array){
        Car newest = array[0];

        for (Car c : array){
            //checking by year
            if (newest.getProdYear() < c.getProdYear()){
                newest = c;

            }
            //if are of same year check by month
            else if (newest.getProdYear() == c.getProdYear()) {
                if (newest.getProdMonth() < c.getProdMonth()){
                    newest = c;
                } //if month is the same check by day
                else if (newest.getProdMonth() == c.getProdMonth()) {
                    if (newest.getProdDay() < c.getProdDay()){
                        newest = c;
                    }
                }
            }
        }
        System.out.println("The newest car is: ");
        newest.print();
    }


    static void findMostExpensive(Car[] array){
        Car mostExp = array[0];
        for (Car c : array){
            if (mostExp.getPrice() < c.getPrice()){
                mostExp = c;
            }
        }

        //print the most expensive car
        System.out.println("The most expensive car is");
        mostExp.print();
    }


    static void findMostPow(Car[] cars){
        Car mostPow = cars[0];
        for (Car c : cars){
            if (mostPow.getEnginePower() < c.getEnginePower())
                mostPow = c;
        }

        System.out.println("The car with most powerful engine");
        mostPow.print();
    }

    static void findLargestVol(Car[] cars){
        Car largest = cars[0];
        for (Car c : cars){
            if (largest.getEngineVolume() < c.getEngineVolume())
                largest = c;
        }

        //print the car
        System.out.println("The car with largest engine volume is");
        largest.print();
    }
}
