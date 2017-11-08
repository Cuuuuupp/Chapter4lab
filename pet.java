public class pet{
    String typeOfDog;
    String nameOfDog;
    int ageOfDog;
    public pet(int year, String name, String type) {
        this.typeOfDog = type;
        this.ageOfDog = year;
        this.nameOfDog = name;
    }
    public String giveName() {
        return ("The dog's name is: ") + this.nameOfDog;
    }
}