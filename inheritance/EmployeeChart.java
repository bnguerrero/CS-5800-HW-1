package CS5800HW1.inheritance;
import java.util.Scanner;

public class EmployeeChart 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String eFirstName, eLastName, eSSNumber, eEarnings;
        String choice;
        char command;

        printMenu();

        do
        {
            System.out.println("Please select the type of employee.");
            choice = scan.next().toLowerCase();
            command = choice.charAt(0);
            // read employee input
            System.out.println("Please input the employees first name");
            eFirstName = scan.nextLine();
            System.out.println("Please input the employees last name");
            eLastName = scan.nextLine();
            System.out.println("Please input the employees Social Security Number");
            eSSNumber = scan.nextLine();
            System.out.println("Please input the employees earnings");
            eEarnings = scan.nextLine();

            switch(command)
            {
                case 'a': 
                    SalariedEmployee employee = new SalariedEmployee(eFirstName, eLastName, eSSNumber, eEarnings);
                    break;
                case 'b':
                    HourlyEmployee employee2 = new HourlyEmployee(eFirstName, eLastName, eSSNumber, eSSNumber);
                case 'c':
                    CommisionEmployee employee3 = new CommisionEmployee(eFirstName, eLastName, eSSNumber, eEarnings);
            }
        

    }

    public static void printMenu()
    {
        System.out.print("\nType of employees.\n"
                   + "-----------------------------------\n"
                   + "a: Salaried Employee\n"
                   + "b: Hourly Employee\n"
                   + "c: Commision Employee\n"
                   + "d: Base Employee\n"
                   + "q: quit this program\n\n");
    }
}
