public class Car{
  private int year;
  private String model;
  public Car(int year, String model) {
        this.year = year;
        this.model = model;
  }
  public String toString() {
        return ("The model of the car is : ") + model + "\nCar year :" + year;
  }
  public int year() {
        return this.year;
  }
  public boolean equals(Car otherCar) {
      if(this.model.equals(otherCar.model) && this.year == otherCar.year) {
          return true;
      }else {
      return false;
     }
  }
}