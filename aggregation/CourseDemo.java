package CS5800HW1.aggregation;

public class CourseDemo 
{
    public static void main(String[] args) 
    {
        // create instructor object.
        Instructor myInstructor = new Instructor("Nima", "Davarpanah", "office 3-2636");
        // create textbook object
        Textbook myTextbook = new Textbook("Clean Code", "Robert Martin", "Pearson");
        // create a course object
        Course myCourse = new Course("Advanced Software Engineering", myInstructor, myTextbook);
        // print course info.
        System.out.println(myCourse);

        // my second course info
        Instructor myInstructor2 = new Instructor("Brianne", "Guerrero", "office 369");
        Textbook myTextbook2 = new Textbook("The Burn Book", "Cady Heron", "Pearson");

        Course myCourse2 = new Course("Mean Girls 101", myInstructor2, myTextbook2);

        System.out.println(myCourse2);
    }
}