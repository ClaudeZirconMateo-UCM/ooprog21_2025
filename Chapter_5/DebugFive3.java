// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department

import java.util.Scanner;
class DebugFive3 // Took out 'public'
{
   public static void main (String[] args)
   {
      int item;
      String output = ""; // initialized the variable with an empty string
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter item number >> ");
      item = input.nextInt();
      if(item < LOW) // changed this to use '<'
         output = "Item number too low";
      else
        if(item > HIGH) // corrected 'HIGHH' to 'HIGH' and used '>'
           output = "Item number too high";
        else
           if(item < CUTOFF) // switched this to use '<'
              output = "Valid - Item in Automotive Department";
           else
              output = "Valid - Item in Housewares Department";
      System.out.println(output);
   }
}

