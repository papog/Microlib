package javax.microedition.lcdui;

public class Image {

    protected java.awt.Image image;
    protected Graphics graphics;

    private Image(int w, int h) {
        System.err.println("creating blank image");
        this.image = Display.applet.createImage(w, h);
    }

    private Image(String name) {
        java.net.URL base;
        try {
            if (name.charAt(0) == '/') {
                name = name.substring(1);
            }
            // TODO get image from jar file
            base = Display.applet.getDocumentBase();
            this.image = Display.applet.getImage(base, name);
            Display.applet.waitForImage(image);

            System.err.println("Loading image:" + name + " " + image.getWidth(null));


        } catch (Exception e) {
            System.err.println("Error loading image " + name);
        }
    }

    public static Image createImage(int w, int h) {
        return new Image(w, h);
    }

    public static Image createImage(String name) {
        return new Image(name);
    }

    public int getWidth() {
        return image.getWidth(null);
    }

    public int getHeight() {
        return image.getHeight(null);
    }

    public Graphics getGraphics() {
        if (graphics == null) {
            graphics = new Graphics(image.getGraphics());
        }
        return graphics;
    }
}
