import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args) 
  {
    System.out.println("Calculator by John Doe");  
    System.out.println("");
    System.out.println("Welcome to my calculator");
    System.out.println("Press [1] for addition");
    System.out.println("Press [2] for substraction");
    System.out.println("Press [3] for multplilication");
    System.out.println("Press [4] for division");
    System.out.println("");

    Scanner input = new Scanner(System.in);

    System.out.print("Select an operation: "); 
    String operation = input.nextLine();

    // This is for addition
    if (operation.equals("1"))
    {
      System.out.println("You have chosen a addition operator");
      System.out.print("Enter the first number: ");
      double firstNumber  = input.nextDouble();
      System.out.print("Enter the second number: "); 
      double secondNumber  = input.nextDouble();
      System.out.println("The sum of "+ firstNumber +" and "+ secondNumber +" is "+ getSum(firstNumber, secondNumber));  
    }

    input.close();
  }

  public static double getSum(double firstNumber, double secondNumber)
  {
    return firstNumber + secondNumber;
  }
}