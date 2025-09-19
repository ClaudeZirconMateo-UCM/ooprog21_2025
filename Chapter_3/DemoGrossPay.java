class DemoGrossPay{
   static double hourRate = 22.75;
public static void main(String[] args){
calculateGross(10.0);
calculateGross(25.0);
calculateGross(37.0);
}

public static void calculateGross(double calculateGross){
   double output = calculateGross * hourRate;
   String display = " hourts at " + hourRate + " per hour is " + output;
   
   System.out.println(display);
   }
 }
