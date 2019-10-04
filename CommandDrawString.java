 

import java.awt.Graphics2D;

/**
 *  A command to draw a string at location <code>x</code>, <code>y</code>.
 *
 *  @author George Peck
 *  @version 10 June 2003
 */
public class CommandDrawString extends DrawingToolCommand
{
  private String str;
  private double x, y;
  
  public CommandDrawString(String s, double x, double y)
  {
    str = s;
    this.x = x;
    this.y = y;
  }
  
  public void doCommand(Graphics2D g, int width, int height)
  {
    g.drawString(str, round(adjustX(x, width)), round(adjustY(y, height)));
  }
}
