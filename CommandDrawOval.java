 

import java.awt.Graphics2D;

/**
 *  A command representing the outline of an oval. The result is a circle or
 *  ellipse that is centered around location <code>x</code>, <code>y</code>
 *  and fits in a bounding rectangle specified by the <code>width</code>,
 *  and <code>height</code>.
 *
 *  The left and right edges of the bounding rectangle are at
 *  <code>x - recWidth/2</code> and <code>x + recWidth/2</code>.
 *  The top and bottom edges are at <code>y - recHeight/2</code> and 
 *  <code>y + recHeight/2</code>.
 *
 *  @author George Peck
 *  @version 10 June 2003
 */

public class CommandDrawOval extends DrawingToolCommand
{
  private double x, y, width, height;
  
  public CommandDrawOval(double x, double y, double width, double height)
  {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  
  public void doCommand(Graphics2D g, int winWidth, int winHeight)
  {
    g.drawOval(round(adjustX(x, winWidth) - width/2),
               round(adjustY(y, winHeight) - height/2),
               round(width),
               round(height));
  }
}
