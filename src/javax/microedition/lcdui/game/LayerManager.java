package javax.microedition.lcdui.game;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class LayerManager {

    Vector layers;
    int viewX;
    int viewY;
    int viewWidth;
    int viewHeight;

    public LayerManager() {
        layers = new Vector();
        viewX = 0;
        viewY = 0;
        viewWidth = 0;
        viewHeight = 0;
    }

    public void append(Layer l) {
        layers.addElement(l);
    }

    public Layer getLayerAt(int index) {
        return (Layer) layers.elementAt(index);
    }

    public int getSize() {
        return layers.size();
    }

    public void insert(Layer l, int index) {
        layers.insertElementAt(l, index);
    }

    public void paint(Graphics g, int x, int y) {
        g.translate(-viewX, -viewY);

       
        for (int i = layers.size() - 1; i >= 0; i--) {
            Layer layer = getLayerAt(i);
            layer.paint(g);

        }
        g.translate(viewX, viewY);
    }

    public void remove(Layer l) {
        boolean found = layers.removeElement(l);

    }

    public void setViewWindow(int x, int y, int width, int height) {
        viewX = x;
        viewY = y;
        viewWidth = width;
        viewHeight = height;
    }
}
