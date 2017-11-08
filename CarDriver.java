public class CarDriver {
    public static void main(String[] args) {
        Car ColbyCar = new Car(65, "Toyota");
        System.out.print(ColbyCar);
        
        Car yourCar = new Car (2000, "Saturn");
        System.out.println(ColbyCar.equals(yourCar));
    }
    
}