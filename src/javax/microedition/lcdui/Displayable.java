package javax.microedition.lcdui;

public class Displayable
{
 private int height;
 private int width;


 public void addCommand(Command cmd)
 {
 }

 public int getHeight()
 {
   return height;  
 }



 public String getTitle()
 {
   return "TITLE TODO";
 }
 public int getWidth()
 {
   return width;
 }
 public boolean isShown()
 {
   return true;
 }
 public void removeCommand(Command cmd)
 {
 }
 public void setCommandListener(CommandListener l)
 {
 }



 public void setTitle(String s)
 {
 }

 protected void sizeChanged(int w, int h)
 {
     width = w;
     height = h;
 }
}
