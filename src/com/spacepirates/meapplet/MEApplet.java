package com.spacepirates.meapplet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Canvas;
public class MEApplet extends Applet implements KeyListener {

    protected MediaTracker mt;
    protected URL base;
    protected java.awt.Image content;
    protected Displayable displayable;

    public void setDisplayable(Displayable d){
        System.err.println("got displayable");
        displayable = d;
    }
    
    public void trackImage(java.awt.Image image) {
        mt.addImage(image, 1);
    }

    public void waitForImage(java.awt.Image image) {
        mt.addImage(image, 1);
        try {
            mt.waitForID(1);
        } catch (InterruptedException e) {
            System.err.println("Interrupted exception while waiting for Image");
        }

    }

    @Override
    public void init() {
        this.addKeyListener(this);
        content = createImage(getWidth(), getHeight());
        javax.microedition.lcdui.Display.setApplet(this);
        mt = new MediaTracker(this);
    }

    @Override
    public void update(java.awt.Graphics g) {
        paint(g);
    }

    @Override
    public void paint(java.awt.Graphics g) {
        g.drawImage(content, 0, 0, this);

    }

    public void copyBuffer(Image buffer) {
        javax.microedition.lcdui.Graphics mug = new javax.microedition.lcdui.Graphics(content.getGraphics());
        mug.drawImage(buffer, 0, 0, 0);
        repaint();
    }

    public void keyTyped(KeyEvent event) {

    }

    public void keyPressed(KeyEvent event) { 
      ((Canvas) displayable).keyPressed(event.getKeyCode());
    }

    public void keyReleased(KeyEvent event) {
      ((Canvas) displayable).keyReleased(event.getKeyCode());
    }
}
