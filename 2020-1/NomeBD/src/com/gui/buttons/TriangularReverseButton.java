package com.gui.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JButton;

public class TriangularReverseButton extends JButton {

	public TriangularReverseButton(String label) {
		super(label);
		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);
		setPreferredSize(size);
		setContentAreaFilled(false);
	}
	
	  protected void paintComponent(Graphics g) {
		    if (getModel().isArmed()) {
		        g.setColor(Color.green);
		    } else {
		    	g.setColor(Color.lightGray);
		        
		    }
		    int xPoints[] = {getWidth(), getWidth(), 0};
		    int yPoints[] = {0, getHeight(), getHeight()/2};
		    g.fillPolygon(xPoints, yPoints, xPoints.length);
		    super.paintComponent(g);
		}
		 
		protected void paintBorder(Graphics g) {
		    g.setColor(getForeground());
		    int xPoints[] = {getWidth(), getWidth(), 0};
		    int yPoints[] = {0, getHeight(), getHeight()/2};
		    g.drawPolygon(xPoints, yPoints, xPoints.length);
		}
		 
		Polygon polygon;
		public boolean contains(int x, int y) {
		    if (polygon == null ||
		            !polygon.getBounds().equals(getBounds())) {
		        int xPoints[] = {getWidth(), getWidth(), 0};
		        int yPoints[] = {0, getHeight(), getHeight()/2};
		        polygon = new Polygon(xPoints,yPoints,xPoints.length);
		    }
		    return polygon.contains(x, y);
		}

}
