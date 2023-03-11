package CS5800HW1.aggregation;

public class Course 
{
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;
    
    public Course(String courseName, Instructor instructor, Textbook textbook)
    {
        this.courseName = courseName;
        this.instructor = new Instructor(instructor);
        this.textbook = new Textbook(textbook);
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public Instructor geInstructor()
    {
        return new Instructor(instructor);
    }

    public Textbook getTextbook()
    {
        return new Textbook(textbook);
    }

    public void display()
    {
        System.out.println("Course name: " + courseName + "\nInstructor info: " + instructor + "\nTextbook info: " + textbook);
    }

}
