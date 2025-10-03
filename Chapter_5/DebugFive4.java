// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
class DebugFive4 // class declaration (no public)
{
   public static void main (String[] args) 
   {
      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt(); // read first number from user
      System.out.print("Enter an integer >> ");
      two = input.nextInt(); // read second number from user
      System.out.print("Enter an integer >> ");
      three = input.nextInt(); // read third number from user
      System.out.print("Enter an integer >> ");
      four = input.nextInt(); // read fourth number from user
      
     if (one >= two && one >= three && one >= four) { // check if first number is the largest
         highest = one;
      }
      else if(two >= one && two >= three && two >= four) { // check if second number is the largest
         highest = two;
      }
      else if(three >= one && three >= two && three >= four) { // check if third number is the largest
         highest = three;
      }
      else {
         highest = four; // if none above, fourth number is the largest
      }
      
      System.out.println("The highest number is " + highest); // display the largest number
   }
}
