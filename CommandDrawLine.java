 

import java.awt.Graphics2D;

/**
 *  A line from at location <code>x1</code>, <code>y1</code> to
 *  location <code>x2</code>, <code>y2</code>
 *
 *  @author George Peck
 *  @version 10 June 2003
 **/
public class CommandDrawLine extends DrawingToolCommand
{
  private double x1, y1, x2, y2;
  
  public CommandDrawLine(double x1, double y1, double x2, double y2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  public void doCommand(Graphics2D g, int width, int height)
  {
    g.drawLine(round(adjustX(x1, width)), round(adjustY(y1, height)),
               round(adjustX(x2, width)), round(adjustY(y2, height)));
  }
}
