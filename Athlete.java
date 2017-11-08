public class Athlete {
    private String name;
    private int age;
    
    public Athlete(String nme, int ag) {
        this.name = nme;
        this.age = ag;
    }
    public String toString() {
        return "this athlete age is " + this.age + " and their name is " + this.name;
    }
}