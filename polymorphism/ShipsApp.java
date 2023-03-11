package CS5800HW1.polymorphism;

public class ShipsApp 
{
    public static void main(String[] args) 
    {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Bubba Gump", "1996");
        ships[1] = new CruiseShip("Queen Mary", "1939", 420);
        ships[2] = new CargoShip("Maersk", "1996", 500);
        for( int index = 0; index< ships.length; index++)
        {
            ships[index].display();

        }

    }
}
