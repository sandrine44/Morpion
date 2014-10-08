package org.imie.view;

import java.awt.Graphics;

import javax.swing.JPanel;


public class ViewMap extends JPanel {

	public ViewMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawRect(0, 0, 500, 500);
		
		g.drawLine(0, 50, 500, 50);
		g.drawLine(0, 150, 500, 150);
		
		g.drawLine(100, 0, 100, 250);
		g.drawLine(200, 0, 200, 250);

		g.drawRect(30, 30, 250, 250);

		}
		
	
}
