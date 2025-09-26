public class DebugPen
{
   private String color;
   private String point;
   
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }
   public DebugPen(String color, String point)
   {
      this.color = color; // added this. to distinguish instance variable from parameter
      this.point = point; // added this. to distinguish instance variable from parameter
   }
   public String getColor()
   {
      return color;
   }
   public String getPoint()
   {
      return point;
   }
}
