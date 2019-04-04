/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.fpmi.educational_practice;

/**
 *
 * @author Lenovo
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;

public class Rectangle extends Canvas{
    protected int width;
    protected int height;
    protected Color color;
    
    public Rectangle(int w, int h, Color c) {
        this.width = w;
        this.height = h;
        this.color = c;
    }
    
    public Rectangle( ){
        width = 100;
        height = 100;
        color = Color.getHSBColor(255,0,255);
    }
    
    public void setWidth(int w) {
        this.width = w;
        repaint(); 
    }
    
    public void setHeight(int h) {
        this.height = h;
        repaint(); 
    }
    
    public void setColor(Color c) {
        this.color = c;
        repaint(); 
    }
    
    @Override
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    
    public Color getColor() {
        return color;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }
    
    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize(); 
    }
    public Dimension getMaximumSize() {
        return new Dimension(1500, 1500); 
    }
    @Override
    public void paint( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fillRect(0, 0, width, height);
    }
}