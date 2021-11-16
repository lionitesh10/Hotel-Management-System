package Views.style;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GradientStyle extends JPanel{
    public GradientStyle() {
        super();
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g1) {// Rewrite the appearance of drawing components
        Graphics2D g = (Graphics2D) g1;
        super.paintComponent(g);// Execute super class method
        int width = getWidth();// Get component size
        int height = getHeight();
        GradientPaint paint = new GradientPaint(0, 0,Color.decode("#aa076b"), 0, height,
                Color.decode("#61045f"));
        g.setPaint(paint);// Set the fill mode of the drawing object
        g.fillRect(0, 0, width, height);// Draw a rectangle to fill the control interface
    }
}