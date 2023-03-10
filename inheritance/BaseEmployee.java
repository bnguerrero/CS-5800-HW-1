package CS5800HW1.inheritance;

public class BaseEmployee extends Employee
{
    private double baseSalary;
    public BaseEmployee(String firstName, String lastName, String sSNumber, double baseSalary)
    {
        super(firstName, lastName, sSNumber);
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }
}
