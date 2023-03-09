package CS5800HW1.polymorphism;

public class Ship 
{
    private String sName;
    private String sYearBuilt;
    public Ship(String sName, String sYearBuilt)
    {
        this.sName = sName;
        this.sYearBuilt = sYearBuilt;
    }
    public String getShipName()
    {
        return sName;
    }
    public String getYearBuilt()
    {
        return sYearBuilt;
    }
    public void display()
    {
        System.out.println("Ship Name: "+ sName + "Year Built: "+ sYearBuilt);
    }
}
