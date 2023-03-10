package CS5800HW1.polymorphism;

public class CruiseShip extends Ship
{
    private int maxPassengers;

    public CruiseShip(String sName, String sYearBuilt, int maxPassengers)
    {
        super(sName, sYearBuilt);
        this.maxPassengers = maxPassengers;
    }
    public int getMaxPassengers()
    {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
    }
    
    @Override
    public void display()
    {
        System.out.println("Ship Name: "+ getShipName() + "Year Built: "+ getYearBuilt() + "Max Passengers: " + maxPassengers);
    }
}
