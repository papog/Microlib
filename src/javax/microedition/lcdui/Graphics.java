package javax.microedition.lcdui;

public class Graphics
{
   private java.awt.Graphics g;

   static int  BASELINE = 64;
   static int  BOTTOM = 32;
   static int  DOTTED = 1;
   static int  HCENTER = 1;
   static int  LEFT = 4;
   static int  RIGHT = 8;
   static int  SOLID = 0;
   static int  TOP = 16;
   static int  VCENTER = 2;

   public Graphics(java.awt.Graphics g)
   {
     this.g = g;
   }

   public void clipRect(int x, int y, int width, int height)
   {
     g.clipRect(x,y,width, height);
   }   
   public void copyArea(int x_src, int y_src, int width, int height, int x_dest, int y_dest, int anchor)
   { 
     //TODO handle anchor
     g.copyArea(x_src, y_src, width, height, x_dest, y_dest);
   }
   public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
   {
     g.drawArc(x, y, width, height, startAngle, arcAngle);
   }

   public void drawChar(char character, int x, int y, int anchor)
   {
     //g.drawChar(character, x, y, anchor);
   }

   public void drawChars(char[] data, int offset, int length, int x, int y, int anchor)
   { 
     //TODO handle anchor
     g.drawChars(data, offset, length, x, y);
   }
   public void drawImage(Image img, int x, int y, int anchor)
   {
     g.drawImage(img.image, x, y, (java.awt.image.ImageObserver) null);
   }
   
   public void drawLine(int x1, int y1, int x2, int y2, int anchor)
   {
     g.drawLine(x1, y1, x2, y2);
   }
   public void drawRect(int x, int y, int width, int height)
   {
     g.drawRect(x, y, width, height);
   }
  
   public void drawRegion(Image src, int x_src, int y_src, int width, int height, int transform, int x_dest, int y_dest, int anchor)
   {
      g.drawImage(src.image ,
              x_dest,
              y_dest,
              x_dest + width,
              y_dest + height,
              x_src,
              y_src,
              x_src + width,
              y_src + height,
              null);
   }
   public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height, boolean processAlpha)
   {
   }
   public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
   {
     
   }

   public void drawString(String str, int x, int y, int anchor)
   {
     //TODO g.drawString(str, x, y, anchor);
   }
   public void drawSubstring(String str, int offset, int len, int x, int y, int anchor)
   {
     //g.drawSubstring(str, offset, len, x, y, anchor);
   }
   public void   fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
   {
     g.fillArc(x, y, width, height, startAngle, arcAngle);
   }
   public void   fillRect(int x, int y, int width, int height)
   {
     g.fillRect(x, y, width,height);
   }
   public void   fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
   {
     //TODO g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
   }
   public void   fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
   {
     //TODO g.fillTriangle(x1, y1, x2, y2 , x3, y3);
   }
   public int    getBlueComponent()
   {
     return 0; //TODO return g.getBlueComponent();
   }
   public int    getClipHeight()
   {
     return 0;//TODO return g.getClipHeight();
   }
   public int    getClipWidth()
   {
     return 0; //TODO return g.getClipWidth();
   }
   public int    getClipX()
   {
     return 0; //TODO return g.getClipX();
   }
 
   public int    getClipY()
   {
    return 0; //TODO return g.getClipY();
   }
   public int    getColor()
   {
     return 0;//TODO return g.getColor();
   }

   public int    getDisplayColor(int color)
   {
     return 0;//TODO return g.getDisplayColor(color);
   }
   
   public int    getGrayScale()
   {
     return 0;//TODO return g.getGrayScale();
   }
   public int    getGreenComponent()
   {
     return 0; //TODOreturn g.getGreenComponent();
   }
   public int    getRedComponent()
   {
     return 0; //TODO return g.getRedComponent();
   }
   public int    getStrokeStyle()
   {
     return 0; //TODO return g.getStrokeStyle();
   }
   public int    getTranslateX()
   {
     return 0; //TODO g.getTranslateX();
   }
   public int    getTranslateY()
   {
     return 0; //TODO g.getTranslateY();
   }
   public void   setClip(int x, int y, int width, int height)
   {
     g.setClip(x, y, width, height);
   }
   public void   setColor(int RGB)
   {
     g.setColor(new java.awt.Color(RGB));
   }
   public void   setColor(int red, int green, int blue)
   {
     g.setColor(new java.awt.Color(red, green, blue));
   }
   public void   setGrayScale(int value)
   {

     g.setColor(new java.awt.Color(value, value, value));
   }
   public void   setStrokeStyle(int style)
   {
     //TODO g.setStrokeStyle(style);
   }
   public void   translate(int x, int y)
   {
     g.translate(x, y);
   } 
}
