public class SalariedEmployee extends Employee
{
    private String weeklySalary;

    public SalariedEmployee(String weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    public String getWeeklySalary()
    {
        return weeklySalary;
    }

}
