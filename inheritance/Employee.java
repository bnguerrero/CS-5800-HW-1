package CS5800HW1.inheritance;

public class Employee 
{
    private String firstName, lastName, sSNumber;
    /**
     * Constructor
     * @param firstName first name of employee
     * @param lastName last name of employee
     * @param sSNumber social security number of employee
     */
    public Employee(String firstName, String lastName, String sSNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sSNumber = sSNumber;
    }
    /**
     * The getFirstName method returns the employees first name.
     * @return string in the firstName field.
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * The setFirstName method takes the parameter firstName and assigns it to 
     * the firstName variable.
     * @param firstName new name to change it to.
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    /**
     * The getLastName method returns the employees last name. 
     * @return string in the lastName field.
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * The setLastName method takes the parameter lastName and assigns it to
     * the lastName variable.
     * @param lastName new name to change it to.
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    /**
     * The getSSNumber method returns the employees social security number.
     * @return string in the sSNumber field.
     */
    public String getSSNumber()
    {
        return sSNumber;
    }
    public void setSSNumber(String sSNumber)
    {
        this.sSNumber = sSNumber;
    }
}