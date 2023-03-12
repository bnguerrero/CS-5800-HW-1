package CS5800HW1.aggregation;

public class Instructor 
{
    
    private String firstName, lastName, officeNumber;

    /**
     * Constructor initializes the first name, last name, and office number.
     * @param firstName the instructor's first name.
     * @param lastName the instructor's last name.
     * @param officeNumber the instructor's office number. 
     */
    public Instructor(String firstName, String lastName, String officeNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }
    /**
     * The copy constructor initializes the object as a copy of another instructor object. 
     * @param instructor the object to copy.
     */
     
    public Instructor(Instructor instructor)
    {
        this.firstName = instructor.firstName;
        this.lastName = instructor.lastName;
        this.officeNumber = instructor.officeNumber;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }

    public String toString()
    {
        String statement =  firstName + " " + lastName + "\nOffice number: " + officeNumber;

        return statement;

    }
}
