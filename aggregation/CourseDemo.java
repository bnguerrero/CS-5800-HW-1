package CS5800HW1.aggregation;

public class CourseDemo 
{
    public static void main(String[] args) 
    {
        // create instructor object.
        Instructor myInstructor = new Instructor("Nima", "Davarpanah", "office 302636");
        // create textbook object
        Textbook myTextbook = new Textbook("Clean Code", "Robert Martin", "Pearson");
        // create a course object
        Course myCourse = new Course("Advanced Software Engineering", myInstructor, myTextbook);
        // print course info.
        System.out.println(myCourse);
    }
}