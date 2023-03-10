package CS5800HW1.inheritance;

public class SalariedEmployee extends Employee
{
    private String weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String sSNumber, String weeklySalary)
    {
        super(firstName, lastName, sSNumber);
        this.weeklySalary = weeklySalary;
    }
    /**
     * The getWeeklySalary method returns the SalariedEmployees weekly salary.
     * @return string in the weeklySalary field.
     */
    public String getWeeklySalary()
    {
        return weeklySalary;
    }

    public void setWeeklySalary(String weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }
}
