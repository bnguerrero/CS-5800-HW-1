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
        return instructor;
    }

    public Textbook getTextbook()
    {
        return textbook;
    }

    public String toString()
    {
        String statement = "\nCourse name: " + courseName + "\nInstructor info: " + instructor.toString() + "\nTextbook info: " + textbook.toString();

        return statement;
    }

}