
public class Employee 
{
    private String firstName, lastName, sSNumber;
    /**
     * Constructor
     * @param firstName first name of employee
     * @param lastName last name of employee
     * @param ssNumber social security number of employee
     */
    public Employee(String firstName, String lastName, String ssNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sSNumber = ssNumber;
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
     * The getLastName method returns the employees last name. 
     * @return string in the lastName field.
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * The getSSNumber method returns the employees social security number.
     * @return string in the sSNumber field.
     */
    public String getSSNumber()
    {
        return sSNumber;
    }
}
