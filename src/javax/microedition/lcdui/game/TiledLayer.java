package javax.microedition.lcdui.game;
import javax.microedition.lcdui.*;

public class TiledLayer extends Layer
{
  private int columns;
  private int rows; 
  private int tileWidth;
  private int tileHeight;
  private Image image;
  private int cells[][];     
  public TiledLayer(int columns, int rows, Image image, int tileWidth, int tileHeight)
  {
    this.columns = columns;
    this.rows = rows;
    this.image = image;
    this.tileWidth = tileWidth;
    this.tileHeight = tileHeight;
    this.cells = new int[columns][rows];

  }
 
  public void setCell(int x, int y,int c)
  {
  }

  public void paint(Graphics g)
  {
     g.drawImage(image, x, y, 0);
  }
}
