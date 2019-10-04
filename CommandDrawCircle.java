
import java.awt.Graphics2D;

/**
 *  A command to draw a circle of radius <code>radius</code> at location
 *  <code>x</code>, <code>y</code>
 *
 *  @author George Peck
 *  @version 10 June 2003
 **/

public class CommandDrawCircle extends DrawingToolCommand
{
  private double x, y, radius;
  
  public CommandDrawCircle(double x, double y, double radius)
  {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
  public void doCommand(Graphics2D g, int width, int height)
  {
    g.drawOval(round(adjustX(x, width) - radius),
               round(adjustY(y, height) - radius),
               round(2*radius),
               round(2*radius));
  }
}
