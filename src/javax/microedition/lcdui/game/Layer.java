package javax.microedition.lcdui.game;
import javax.microedition.lcdui.Graphics;

public abstract class Layer
{
   private boolean visible = true;
   protected int height;
   protected int width;
   protected int x;
   protected int y;


   public boolean isVisible()
   {
     return visible;
   }
   public void move(int dx, int dy)
   {
     x += dx;
     y += dy;
   }
  
   abstract void  paint(Graphics g);

   public void setPosition(int x, int y)
   {
     this.x = x;
     this.y = y;
   }

   public void setVisible(boolean v)
   {
     visible = v;
   }

   public int getHeight()
   {
     return height;
   }
   public int getWidth()
   {
     return width;
   }
   public int getX()
   {
     return x;
   }
   public int getY()
   {
     return y;
   }
 
}
