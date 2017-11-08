public class Grape
{
    // instance variables - replace the example below with your own
    private String name;
    private int iDnumber;
    private Student bestFriend;

    /**
     * Constructor for objects of class Student
     */
    public Grape()
    {
        // initialise instance variables
    }
    public Grape(int num, String nm) {
        this.iDnumber = num;
        this.name = nm;
    }
    public int combineIDnumbers() {
        return this.iDnumber + bestFriend.iDnumber;
    }
    public Student newStudent(Student other) {
        Student temp = new Student(other.iDnumber, this.name);
        return temp;
    }
    public int getID() {
        return this.iDnumber;
    }
    public String toString() {
        return "The student's name is: " + this.name;
    }
}
