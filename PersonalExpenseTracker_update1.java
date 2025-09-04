import java.util.Scanner;
import java.util.ArrayList;
public class PersonalExpenseTracker_update1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your friendly monthly Personal Expense Tracker! ");
        System.out.println("----------------------------------------------------------");
        System.out.print("How much do you make per month: $");
        int monthly = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> expensesName = new ArrayList<>();
        ArrayList<Double> expensesAmount = new ArrayList<>();

        boolean itsloopingtime = true;

        while (itsloopingtime)
        {
            boolean addMore = true;

            while(addMore)
            {
                System.out.print("Enter the name of the expense: ");
                String name = scanner.nextLine();
                expensesName.add(name); // store name

                System.out.print("How much do you spend on " + name + ": $");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                expensesAmount.add(amount); // store amount

                System.out.print("Would you like to add another expense? (yes/no): ");
                String answer = scanner.nextLine();

                if (!answer.equalsIgnoreCase("yes")) {
                    addMore = false;
                }
            }

            System.out.println("Okay we are done adding expenses");
            System.out.println("Here is everything i have so for");
            System.out.println("--- Expense Summary ---");

            for(int i = 0; i < expensesName.size(); i++)
            {
                System.out.println((expensesName.get(i) + ": $" + expensesAmount.get(i)));
            }

            System.out.print("Would you like to add anymore expenses (yes/no): ");
            String decision = scanner.nextLine();

            if(!decision.equalsIgnoreCase("yes"))
            {
                itsloopingtime = false;
            }

        }

        double totalExpenses = 0;

        for(int i = 0; i < expensesAmount.size(); i++)
        {
            totalExpenses += expensesAmount.get(i); // add each expense
        }

        double remaining = monthly - totalExpenses;

        int numberOfExpenses = expensesAmount.size();

        double average =  totalExpenses / numberOfExpenses;

        System.out.println("Here is your total monthly average of expenses: $" + average +
                "\nYou will have $" + remaining + " left at the end of the month.");



    }

}
