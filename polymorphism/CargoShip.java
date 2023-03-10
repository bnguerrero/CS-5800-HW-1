package CS5800HW1.polymorphism;

public class CargoShip extends Ship
{
    private int cargoCapacity;
    public CargoShip(String sName, String sYearBuilt,int cargoCapacity)
    {
        super(sName, sYearBuilt);
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public void display()
    {
        System.out.println("Ship Name: "+ getShipName() + "Year Built: "+ getYearBuilt() + "Cargo Capacity: " + cargoCapacity);
    }
}
