
/**
 * This class contains university course modules including their title, code
 * number and mark in a percentage.
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class Module
{
    public String moduleTitle;
    
    public String codeNumber;
    
    public int mark;
    
    private int credit;
    
    private boolean completed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String moduleTitle, String codeNumber)
    {
        mark = 0;
        this.moduleTitle = moduleTitle;
        this.codeNumber = codeNumber;
        completed = false;
        credit = 15;
    }
    
    public void awardMark(int mark)
    {
            if ((mark >= 0) && (mark <= 100))
            {
                this.mark = mark;
                if(mark >= 40)completed = true;
                System.out.println("Your mark for this module is: " + mark + "%");
            }
            else
            {
                System.out.println("The mark that has been awarded is invalid.");
            
            }
            if (mark >= 40)
            {
                System.out.println("You have passed this module");
            
            }
            else
            {
                System.out.println("You have failed this module");
            }
    }
    
    public void print()
    {
        System.out.println("Module: " + moduleTitle);
        System.out.println("Code Number: " + codeNumber);
        System.out.println("Mark: " + mark);
    }

    public String getTitle(){
        return this.moduleTitle;
    }

   
    public void setTitle(String moduleTitle)
    {
        this.moduleTitle = moduleTitle;
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
