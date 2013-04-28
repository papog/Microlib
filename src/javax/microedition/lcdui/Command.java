package javax.microedition.lcdui;

public class Command
{
  public final static int EXIT = 7;
  public final static int ITEM = 8;

  private final int type;
  private final int priority;
  private final String shortLabel;
  private final String longLabel;

  public Command(String shortLabel,
                 String longLabel,
                 int commandType,
                 int priority)
  {
    this.shortLabel = shortLabel;
    this.longLabel = longLabel;
    type = commandType;
    this.priority = priority;
  }
  public Command(String shortLabel,
                 int commandType,
                 int priority)
  {
    this.shortLabel = shortLabel;
    this.longLabel = shortLabel;
    type = commandType;
    this.priority = priority;
  }
       
  public int getCommandType()
  {
     return type;
  }
  
}
