package org.imie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Vue {

	public Vue() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void start () {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run () {
				
				JFrame frame = new JFrame("Jeu du Morpion");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(500,500));
				frame.getContentPane().setLayout(new BorderLayout());
				
				PanelMorpion monPanel = new PanelMorpion();
								
				frame.add(monPanel);
				
				frame.pack();
				frame.setVisible(true);
				
				
				
				
			}
			
		});
	}
}
