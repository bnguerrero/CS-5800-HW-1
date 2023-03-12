package CS5800HW1.aggregation;

public class Course 
{
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;
    
    public Course(String courseName, Instructor instructor, Textbook textbook)
    {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public Instructor geInstructor()
    {
        return new Instructor(instructor);
    }

    public Textbook getTextbook()
    {
        return new Textbook(textbook);
    }

    public String display()
    {
        String statement = "Course name: " + courseName + "\nInstructor info: " + instructor.display() + "\nTextbook info: " + textbook.display();

        return statement;
    }

}