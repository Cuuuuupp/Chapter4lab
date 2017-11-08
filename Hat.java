public class Hat
{
    // instance variables - replace the example below with your own
    private boolean coolHat;
    private String colorOfHat;
    public Hat(boolean cool, String color) {
        this.coolHat = cool;
        this.colorOfHat = color;
    }
    public boolean getCoolHat() {
        return this.coolHat;
    }
    public String colorOfHat() {
        return ("The hat's color is: ") + this.colorOfHat; 
    }
}