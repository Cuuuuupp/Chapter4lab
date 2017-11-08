
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author {
    private String name;
    private int ages;
    public Author(int ag, String nm) {
        this.name = nm;
        this.ages = ag;
  }
  public String toString() { 
      return "Authors name is " + name + " and the author is " + ages + " years old";
    }
}
