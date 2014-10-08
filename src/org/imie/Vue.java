package org.imie;

import java.awt.BorderLayout;

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
				frame.getContentPane().setLayout(new BorderLayout());
				
				JPanel panelHaut = new JPanel();
				JLabel labelJoueur1 = new JLabel();
				labelJoueur1.setPreferredSize(new Dimension (50,20));
				JLabel labelJoueur2 = new JLabel();
				labelJoueur2.setPreferredSize(new Dimension (50,20));
				panelHaut.add(comp)
				
				
				
				
				
			}
			
		});
	}
}
