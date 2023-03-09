package CS5800HW1.inheritance;
import java.util.Scanner;

public class EmployeeChart 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String eFirstName, eLastName, eSSNumber, eStatus;

        // read employee input
        System.out.println("Please input your first name");
        eFirstName = scan.nextLine();
        System.out.println("Please input your last name");
        eLastName = scan.nextLine();
        System.out.println("Please input your Social Security Number");
        eSSNumber = scan.nextLine();

    }

    public static void printMenu()
    {
        System.out.print("\nPlease select the type of employee.\n"
                   + "-----------------------------------\n"
                   + "a: Salaried Employee\n"
                   + "b: Hourly Employee\n"
                   + "c: Commision Employee\n"
                   + "d: Base Employee\n"
                   + "q: quit this program\n\n");
    }
}
