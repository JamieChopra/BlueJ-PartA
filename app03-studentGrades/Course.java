
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

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNumber)
    {
       this.title = title;
       this.codeNumber = codeNumber;
    }

    public void print()
    
    { System.out.println("Course:" + title + "" + codeNumber);
    }
}
