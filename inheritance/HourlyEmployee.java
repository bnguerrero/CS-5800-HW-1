package CS5800HW1;

public class HourlyEmployee extends Employee
{
    private String wage;
    public HourlyEmployee(String firstName, String lastName, String sSNumber, String wage)
    {
        super(firstName, lastName, sSNumber);
        this.wage = wage;
    }
    public String getWage()
    {
        return wage;
    }
    
}