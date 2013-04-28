package javax.microedition.lcdui.game;

import javax.microedition.lcdui.*;

public class GameCanvas extends Canvas {

    static public int DOWN_PRESSED = 1 << Canvas.DOWN;
    static public int FIRE_PRESSED = 1 << Canvas.FIRE;
    static public int GAME_A_PRESSED = 1 << Canvas.GAME_A;
    static public int GAME_B_PRESSED = 1 << Canvas.GAME_B;
    static public int GAME_C_PRESSED = 1 << Canvas.GAME_C;
    static public int GAME_D_PRESSED = 1 << Canvas.GAME_D;
    static public int LEFT_PRESSED = 1 << Canvas.LEFT;
    static public int RIGHT_PRESSED = 1 << Canvas.RIGHT;
    static public int UP_PRESSED = 1 << Canvas.UP;
    private int keyStates;
    
    public GameCanvas(boolean suppressKeyEvents) {
        buffer = Image.createImage(Display.getDisplay(null).getBestImageWidth(0),
                Display.getDisplay(null).getBestImageHeight(0));
        System.err.println("GameCanvas.buffer: " + buffer.getHeight() + " " + buffer.getWidth());
        buffer.getGraphics().drawLine(0, 0, 320, 240, 0);
    }

    public void flushGraphics() {
        Display.getDisplay(null).showImage(buffer);
    }

    public void flushGraphics(int x, int y, int width, int height) {
    }

    protected Graphics getGraphics() {
        return buffer.getGraphics();
    }

    public int getKeyStates() {
        return keyStates;
    }

    @Override
    public void keyPressed(int keycode) {
        System.err.println("key pressed");
        if (keycode == 'E'){
            keyStates |= UP_PRESSED;
        }
        if (keycode == 'F'){
            keyStates |= RIGHT_PRESSED;
         }
    }

    @Override
    public void keyReleased(int keycode) {
        if (keycode == 'E'){
            keyStates &= ~UP_PRESSED;
        }
        if (keycode == 'F'){
            keyStates &= ~RIGHT_PRESSED;
        }
    }

    public void paint(Graphics g) {
    }
}
