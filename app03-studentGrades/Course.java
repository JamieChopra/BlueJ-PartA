
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
    private boolean courseComp = false;
  
    private int finalMark;
    private int credit;
    private Grades finalGrade = null;
    /**;
     * Constructor to initialize the strings title and codeNumber
     */
    public Course(String title, String codeNumber)
    {
       this.title = title;
       this.finalMark = 0;
       this.credit = 0;
       this.finalGrade = null;
       this.codeNumber = codeNumber;
       System.out.println("A new course has been created");
       System.out.println("Course: " + title);
       System.out.println("Course code: " + codeNumber);
       createModule();
    }
    
    
    private void createModule()
    {
       module1 = new Module("Programming Concepts", " CO452");
       module2 = new Module("Web Development", " CO456");
       module3 = new Module("Computer Architectures", "CO450");
       module4 = new Module("Digital Technologies", "CO454");
    }
    
    /**
     * Method for adding modules
     */
    public void addModule(Module module, int moduleNumber)
    {
        if(moduleNumber == 1)
        {
            this.module1 = module1;
            this.module2 = module2;
            this.module3 = module3;
            this.module4 = module4; 
        }
    }
    
    public void calculateFinalMark()
    {
        if(courseCompleted())
        {
            int totalMark = module1.getMark() + module2.getMark() + 
            module3.getMark() + module4.getMark();
            
            finalMark = totalMark / 4;
            
            credit = module1.getCredit() + module2.getCredit() + 
                module3.getCredit() + module4.getCredit();
            
            printCourseInfo();
    }
    else 
    {
        
    }
    }
    
    public boolean courseCompleted()
    {   
        if((module1.isCompleted()) && (module2.isCompleted()) &&
            ((module3.isCompleted()) && (module4.isCompleted())))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public void setMark(int mark, String codeNo)
    {
        if(module1.getCodeNumber() == codeNumber)
        {
            module1.awardMark(mark);
        }
    }
    
    /**
     * Prints the course details out
     */
     public void printCourseInfo()
    
    { //createCourse();
      System.out.println("Course: " + title);
      System.out.println("Course Code: " + codeNumber);
    }
    
    public void printModules()
    {
            System.out.println("Modules enrolled on: ");
            System.out.println();
            module1.print();
            System.out.println();
            module2.print();
            System.out.println();
            module3.print();
            System.out.println();
            module4.print();
            System.out.println();
            System.out.println("Final Mark= " + finalMark);
            System.out.println();
            System.out.println("Final Grade= " + convertToGrade(finalMark));
            System.out.println();
            System.out.println("Final Credit= " + credit);
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
