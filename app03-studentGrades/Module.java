
/**
 * This class contains university course modules including their title, code
 * number and mark in a percentage.
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class Module
{
    private String title;
    
    private String codeNumber;
    
    private int mark;
    
    private boolean completed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNumber)
    {
        mark = 0;
        this.title = title;
        this.codeNumber = codeNumber;
        completed = false;
    }
    
    public void awardMark(int mark)
    {
            if ((mark >= 0) && (mark <= 100))
            {
                this.mark = mark;
                if(mark >= 40)completed = true;
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

    public String getTitle(){
        return this.title;
    }

   
    public void setTitle(String title)
    {
        this.title = title;
    }

   
    public String getCodeNumber()
    {
        return this.codeNumber;
    }

    
    public void setCodeNumber(String codeNumber)
    {
        this.codeNumber = codeNumber;
    }

    
    public int getMark()
    {
        return this.mark;
    }

    
    public void setMark(int mark)
    {
        this.mark = mark;
    }

    
    public boolean getCompleted()
    {
        return this.completed;
    }

    
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    
}
