package CS5800HW1.inheritance;


public class EmployeeChart 
{
    public static void main(String[] args) 
    {
        SalariedEmployee employee = new SalariedEmployee("Joe", "Jones", "111-11-1111", "$2,500");

        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", "$25", 32);

        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", "$19", 47);

        CommisionEmployee employee4 = new CommisionEmployee("Nicole", "Dior", "444-44-4444", "15%", "$50,000");

        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", "$1,700");

        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", "$95,000");

        CommisionEmployee employee7 = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", "22%", "$40,000");

        
        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n" , "First name", "Last name", "Social Sec #", "Weekly Salary", "Wage", "Hours worked", "Com rate", "Gross salary", "Base salary") ;
        
        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee.getFirstName(), employee.getLastName(), employee.getSSNumber(), employee.getWeeklySalary(), " ", " ", " ", " ", " ");

        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee2.getFirstName(), employee2.getLastName(), employee2.getSSNumber(), " ", employee2.getWage(),employee2.getHours(), " ", " ", " ");

        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee3.getFirstName(), employee3.getLastName(), employee3.getSSNumber(), " ", employee3.getWage(),employee3.getHours(), " ", " ", " ");

        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee4.getFirstName(), employee4.getLastName(), employee4.getSSNumber(), " ", " ", " ", employee4.getCommisionRate(),employee4.getGrossSales()," ");

        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee5.getFirstName(), employee5.getLastName(), employee5.getSSNumber(), employee5.getWeeklySalary(), " "," ", " ", " ", " ");

        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee6.getFirstName(), employee6.getLastName(), employee6.getSSNumber(), " ", " "," ", " ", " ", employee6.getBaseSalary());

        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s %-14s\n",employee7.getFirstName(), employee7.getLastName(), employee7.getSSNumber(), " ", " "," ", employee7.getCommisionRate(), employee7.getGrossSales(), " ");
    }
}
