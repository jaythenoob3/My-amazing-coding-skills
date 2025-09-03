import java.util.Scanner;
public class PersonalExpenseTracker
{
    public static void main(String[] args)
    {
        Scanner idkwhattocallthis = new Scanner(System.in);
        System.out.println("Welcome to your friendly monthly Personal Expense Tracker! ");
        System.out.print("How much do you make per month? ");
        double monthly = idkwhattocallthis.nextDouble();
        idkwhattocallthis.nextLine();

        // Ask for 5 expenses
        System.out.print("what is your first expense (im only doing 5 so pick your top 5): ");
        String var_1 = idkwhattocallthis.nextLine();

        System.out.print("How do you spend on " + var_1 + ":");
        double expense_1 = idkwhattocallthis.nextDouble();
        idkwhattocallthis.nextLine();

        System.out.print("What is your 2nd expense: ");
        String var_2 = idkwhattocallthis.nextLine();


        System.out.print("How do you spend on " + var_2 + ":");
        double expense_2 = idkwhattocallthis.nextDouble();
        idkwhattocallthis.nextLine();

        System.out.print("What is your 3rd expense: ");
        String var_3 = idkwhattocallthis.nextLine();

        System.out.print("How do you spend on " + var_3 + ":");
        double expense_3 = idkwhattocallthis.nextDouble();
        idkwhattocallthis.nextLine();

        System.out.print("What is your 4th expense: ");
        String var_4 = idkwhattocallthis.nextLine();

        System.out.print("How do you spend on " + var_4 + ":");
        double expense_4 = idkwhattocallthis.nextDouble();
        idkwhattocallthis.nextLine();

        System.out.print("What is your 5th expense: ");
        String var_5 = idkwhattocallthis.nextLine();

        System.out.print("How do you spend on " + var_5+ ":");
        double expense_5  = idkwhattocallthis.nextDouble();
        idkwhattocallthis.nextLine();

        // Calculate remaining balance
        double expenses = expense_1 + expense_2 + expense_3 + expense_4 + expense_5;
        double remaining = monthly - expenses;

        // Display results
        System.out.println("\nThanks for using the Personal Expense Tracker!");
        System.out.println("\n--- Expense Summary ---");
        System.out.println(var_1 + ": $" + expense_1);
        System.out.println(var_2 + ": $" + expense_2);
        System.out.println(var_3 + ": $" + expense_3);
        System.out.println(var_4 + ": $" + expense_4);
        System.out.println(var_5 + ": $" + expense_5);
        System.out.println("Total Expenses: $" + expenses);
        System.out.println("Remaining Balance: $" + remaining);





        // This was my brainstorming part of how I was going to do it
         /*
        System.out.print("How much money have you spent on food so far? ");
        int food = idkwhattocallthis.nextInt();
        idkwhattocallthis.nextLine();

        System.out.print("How much is your house payment?");
        int house = idkwhattocallthis.nextInt();

        System.out.print("You have this much remaining this month: " + (monthly - food - house));
        */


    }



}
