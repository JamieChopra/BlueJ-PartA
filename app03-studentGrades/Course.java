
/**
 * This class contains university courses via course codes and course titles.
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class Course
{
    private String title;
    private String codeNumber;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**;
     * Constructor to initialize the strings title and codeNumber
     */
    public Course(String title, String codeNumber)
    {
       this.title = title;
       this.codeNumber = codeNumber;
       
       module1 = new Module("Programming Concepts", " CO452");
       module2 = new Module("Web Development", " CO456");
       module3 = new Module("Computer Architectures", "CO450");
       module4 = new Module("Digital Technologies", "CO454");
    }
    
    /**
     * Method for adding modules together
     */
    public void addModule(Module module, int moduleNumber)
    {
    
    }
    
    /**
     * Prints the course details out
     */
    public void print()
    
    { System.out.println("Course:" + title + "" + codeNumber);
    }
}
