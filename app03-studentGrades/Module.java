
/**
 * This class contains university course modules including their title, code
 * number and mark in a percentage.
 *
 * @author Jamie Chopra
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    
    private String codeNumber;
    
    private int mark;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNumber)
    {
        mark = 0;
        this.title = title;
        this.codeNumber = codeNumber;
    }
    
    public void awardMark(int mark)
    {
            if ((mark >= 0) && (mark <= 100))
            {
                this.mark = mark;
            }
            else
            {
                System.out.println("The mark that has been awarded is invalid.");
            
            }
            
    }
    
    public void print()
    {
        System.out.println("Module: " + title + "" + codeNumber + "Mark" + mark);
    }
}
