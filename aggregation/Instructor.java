package CS5800HW1.aggregation;

public class Instructor 
{
    private String firstName, lastName, officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getOfficeNumber()
    {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }
}
