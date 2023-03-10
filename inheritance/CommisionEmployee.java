package CS5800HW1.inheritance;

public class CommisionEmployee extends Employee
{
    private double cRate, gSales;
    public CommisionEmployee(String firstName, String lastName, String sSNumber, double cRate, double gSales)
    {
        super(firstName, lastName, sSNumber);
        this.cRate = cRate;
        this.gSales = gSales;
    }   
    public double getCommisionRate()
    {
        return cRate;
    }
    public void setCommisionRate(double cRate)
    {
        this.cRate = cRate;
    }
    public double getGrossSales()
    {
        return gSales;
    }
    public void setGrossRate(double gSale)
    {
        this.gSales = gSale;
    }
}
