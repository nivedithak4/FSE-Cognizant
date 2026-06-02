class Car {
    String make;
    String model;
    int year;
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println();
    }
}
public class task17 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X5", 2023);
        Car car2 = new Car("Tesla", "Model 3", 2024);

        car1.displayDetails();
        car2.displayDetails();
    }
}