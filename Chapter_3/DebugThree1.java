
// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
class DebugThree1
{
public static void main(String args[])
{
double check1;
double check2;
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount of your check >> ");
check1 = input.nextDouble(); //changed the 'nextInt' to 'nextDouble'
System.out.print("Enter the amount of your friend's check >> ");
check2 = input.nextDouble(); //changed the 'nextInt' to 'nextDouble'
calcTip(check1);
calcTip(check2);
}

public static void calcTip(double bill)
{
final double RATE = 0.15; // changed the 'doubel RATE' to 'dounble RATE'
double tip;
tip = bill * RATE; // changed the '/' to '*'
System.out.println("The tip should be at least $" + tip);
}
}