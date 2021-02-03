import java.util.Scanner;

public class Program1 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your test grade: ");
    int grade = input.nextInt();

    if (grade >= 90) 
    {
      System.out.print("You got an A!");
    }
    else if (grade >= 80)
    {
      System.out.print("You got a B!");
    }
    else if (grade >= 70)
    {
      System.out.print("You got a C!");
    }
    else if (grade >= 60)
    {
      System.out.print("You got a D!");
    }
    else
    {
      System.out.print("You got an F");
    }

    input.close();
    
  }
}