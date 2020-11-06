
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
    
    private int finalMark;
    
    private Grades finalGrade;
    
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
     * Method for adding marks together
     */
    public void addMark(int mark, int moduleNumber)
    {
        if(moduleNumber == 1)
        {
            module1.awardMark(mark);
        }
    }
    
    /**
     * Prints the course details out
     */
    public void print()
    
    { System.out.println("Course:" + title + "" + codeNumber);
    }
    
    public Grades convertToGrade(int mark)
    {
        if ((mark >=0) && (mark < 40))
        {
            return Grades.F;
        }
        
        if((mark >=40) && (mark <50))
        {
            return Grades.D;
        }
        
        if((mark >=50) && (mark <60))
        {
            return Grades.C;
        }
        
        if((mark >=60) && (mark <70))
        {
            return Grades.B;
        }
        
        if((mark >=70) && (mark <=100))
        {
            return Grades.A;
        }
        return Grades.X;
    }
}
