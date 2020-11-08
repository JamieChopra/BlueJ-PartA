
/**
 * This class contains university courses via course codes and course titles.
 *
 * @author Jamie Chopra
 * @version 0.1
 */
public class Course
{
    //Courses title
    private String title;
    //Courses code number
    private String codeNumber;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    private boolean courseComp = false;
    
    private int finalMark;
    //Courses credits
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
    
    
    /**
     * Method for creating a new module, a maximum of four modules can be created and assigned to a course.
     */
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
        
            {this.module1 = module;}
        else if(moduleNumber == 2)    
            {this.module2 = module;}
        else if(moduleNumber == 3)
            {this.module3 = module;}
        else if(moduleNumber == 4)
            {this.module4 = module; 
        }
    }
    
    /**
     * Method for calculating and printing the final mark between all modules of a course
     */
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
    
    /**
     * Method for determining whether the student is successful or not in completing a course.
     */
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
    
    /**
     * Method for setting and awarding a mark.
     */
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
    
    /**
     * Prints all details of modules along with the final mark, grade and credit
     */
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
    
    /**
     * Method for converting marks into grades, refers to enumeration for grades.
     */
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
