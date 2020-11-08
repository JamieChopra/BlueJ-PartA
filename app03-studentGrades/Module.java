
/**
 * This class contains university course modules including their title, code
 * number and mark in a percentage.
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class Module
{
    //Modules title
    public String moduleTitle;
    //Modules code number
    public String codeNumber;
    //Module mark
    public int mark;
    //Modules credits
    private int credit;
    //True or false statement for whether the course is completed
    private boolean completed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String moduleTitle, String codeNumber)
    {
        mark = -1;
        this.moduleTitle = moduleTitle;
        this.codeNumber = codeNumber;
        completed = false;
        credit = 15;
    }
    
    /**
     * Method for awarding marks to a module in which 40% is the pass mark 
     * It also prints whether the student has passed or failed the module.
     */
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
                completed = false;
                System.out.println("The mark that has been awarded is invalid.");
            }
            if (mark >= 40)
            {
                completed = true;
                System.out.println("You have passed this module");
            
            }
            else
            {
                completed = false;
                System.out.println("You have failed this module");
            }
    }
    
    /**
     * Print method for the module, module code and mark for the module
     */
    public void print()
    {
        System.out.println("Module: " + moduleTitle);
        System.out.println("Module Code: " + codeNumber);
        System.out.println("Mark: " + mark + "%");
    }
       
    /**
     * Print method for the creation of a new module
     */
    public void printCreation(){
        System.out.println("A new module has been created");
        System.out.println("Module: " + moduleTitle);
        System.out.println("Module Code: " + codeNumber);
    }
    
    /**
     * Method for returning the modules title
     */
    public String getTitle(){
        return this.moduleTitle;
    }
    
    /**
     * This will return whether the module is compelted
     */
    public boolean isCompleted()
    {
        if (mark>=0)
        {
        return completed = true;
    }
    else{
        return completed = false;
    }
    }
    
     /**
     * Method for setting the module title
     */
    public void setTitle(String moduleTitle)
    {
        this.moduleTitle = moduleTitle;
    }
    
    /**
     * Method for returning the modules credits
     */
    public int getCredit()
    {
        return credit;
    }
   
     /**
     * Method for returning the modules code number
     */
     public String getCodeNumber()
    {
         return this.codeNumber;
    }

    /**
     * Method for setting the modules code number
     */
     public void setCodeNumber(String codeNumber)
    {
        this.codeNumber = codeNumber;
    }

    /**
     * Method for returning the modules mark
     */
    public int getMark()
    {
        return this.mark;
    }

    /**
     * Method for setting the modules mark
     */
    public void setMark(int mark)
    {
        this.mark = mark;
    }

    /**
     * Method for returning whether the module has been completed
     */
    public boolean getCompleted()
    {
        return this.completed;
    }
    
    /**
     * Method for setting the module as completed.
     */
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    
}
