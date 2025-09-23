class DebugCircle // changed from public to default so that it can be run in JGRASP IDE
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }
   public int getRadius()// removed the semicolon
   {
      return radius; // fixed the word 'radiuss' to 'radius'
   }
   public int getDiameter() // fixed return type from void to int
   {
      return diameter;
   }
   public double getArea()
   {
      return area;
   }
}