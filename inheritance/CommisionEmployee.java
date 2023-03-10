package CS5800HW1.inheritance;

public class CommisionEmployee extends Employee
{
    private String cRate, gSales;
    public CommisionEmployee(String firstName, String lastName, String sSNumber, String cRate, String gSales)
    {
        super(firstName, lastName, sSNumber);
        this.cRate = cRate;
        this.gSales = gSales;
    }   
    public String getCommisionRate()
    {
        return cRate;
    }
    public void setCommisionRate(String cRate)
    {
        this.cRate = cRate;
    }
    public String getGrossSales()
    {
        return gSales;
    }
    public void setGrossRate(String gSale)
    {
        this.gSales = gSale;
    }
}
