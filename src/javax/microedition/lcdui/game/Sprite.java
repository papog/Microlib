package javax.microedition.lcdui.game;

import javax.microedition.lcdui.*;

public class Sprite extends Layer {

    private Image image;
    private int frameWidth;
    private int frameHeight;
    private int frame;
    private int refX;
    private int refY;

    public Sprite(Image image, int frameWidth, int frameHeight) {
        this.image = image;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.frame = 0;
        this.refX = 0;
        this.refY = 0;
    }

    public Sprite(Image image) {
        this.image = image;
        this.frameWidth = image.getWidth();
        this.frameHeight = image.getHeight();
    }

    public boolean collidesWith(Sprite s, boolean pixelLevel) {
        java.awt.Rectangle r1 = new java.awt.Rectangle(this.getX(), this.getY(), getWidth(), getHeight());
        java.awt.Rectangle r2 = new java.awt.Rectangle(s.getX(), s.getY(), s.getWidth(), s.getHeight());
        return r1.intersects(r2);
    }

    public void defineReferencePixel(int x, int y) {
        refX = x;
        refY = y;
    }

    public int getFrame() {
        return frame;
    }

    public final void paint(Graphics g) {
        //g.drawImage(image, x, y, 0);
        //TODO draw frame
        if (this.isVisible()) {
            int nbFramesPerLine = image.getWidth() / frameWidth;
            int frameX = (frame % nbFramesPerLine) * frameWidth;
            int frameY = (frame / nbFramesPerLine) * frameHeight;
            g.drawRegion(image, frameX, frameY, frameWidth, frameHeight, 0, x, y, 0);
        }
    }

    public void setFrame(int sequenceIndex) {
        this.frame = sequenceIndex;
    }

    public void setRefPixelPosition(int x, int y) {
        this.x = x - refX;
        this.y = y - refY;
    }

    public boolean collidesWith(Image image, int x, int y, boolean pixelLevel) {
        return false;
    }

    public boolean collidesWith(TiledLayer t, boolean pixelLevel) {
        return false;
    }

    public void defineCollisionRectangle(int x, int y, int width, int height) {
    }

    public int getFrameSequenceLength() {
        return 0;
    }

    public int getRawFrameCount() {
        return 0;
    }

    public int getRefPixelX() {
        return 0;
    }

    public int getRefPixelY() {
        return 0;
    }

    public void nextFrame() {
    }

    public void prevFrame() {
    }

    public void setFrameSequence(int[] sequence) {
    }

    public void setImage(Image img, int frameWidth, int frameHeight) {
    }

    public void setTransform(int transform) {
    }

    @Override
    public int getWidth() {
        return frameWidth;
    }

    @Override
    public int getHeight() {
        return frameHeight;
    }
}
