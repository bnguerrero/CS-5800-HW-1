package CS5800HW1.inheritance;

public class HourlyEmployee extends Employee
{
    private String wage;
    private double hours;
    /**
     * 
     * @param firstName first name of employee
     * @param lastName last name of employee
     * @param sSNumber social security of employee
     * @param wage wage of HourlyEmployee
     * @param hours number of hours worked 
     */
    public HourlyEmployee(String firstName, String lastName, String sSNumber, String wage, double hours)
    {
        super(firstName, lastName, sSNumber);
        this.wage = wage;
        this.hours = hours;
    }
    /**
     * The getWage method returns the wage of the HourlyEmployee.
     * @return string in wage field.
     */
    public String getWage()
    {
        return wage;
    }
    public void setWage(String wage)
    {
        this.wage = wage;
    }
    
    public double getHours()
    {
        return hours;
    }
    public void setHours(double hours)
    {
        this.hours = hours;
    }
}