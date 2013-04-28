package javax.microedition.lcdui;
import javax.microedition.midlet.MIDlet;
import com.spacepirates.meapplet.MEApplet;

public class Display
{

  static private Display display;
  static protected MEApplet applet;
  private Displayable displayable;
  
  public static void setApplet(MEApplet applet)
  {
    Display.applet = applet;
  }


  public int getBestImageHeight(int type)
  {
    return applet.getHeight();
  }
  public int getBestImageWidth(int type)
  {
    return applet.getWidth();
  }  
  static public Display getDisplay(MIDlet m)
  {
    if (display == null)
    {
      display = new Display();
    }
    return display;
  }
  public void setCurrent(Displayable nextDisplayable)
  {
    nextDisplayable.sizeChanged(this.getBestImageWidth(0),
                                this.getBestImageHeight(0));
    displayable = nextDisplayable;
    applet.setDisplayable(displayable);
  }
  public Displayable getCurrent()
  {
    return displayable;
  }
  public void showImage(Image image)
  {
      applet.copyBuffer(image);
  }
  
}
