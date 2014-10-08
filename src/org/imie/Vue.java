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
				
				// partie haute : joueurs
				JPanel panelHaut = new JPanel();
				JLabel labelJoueur1 = new JLabel("Joueur 1");
				labelJoueur1.setPreferredSize(new Dimension (100,20));
				JLabel labelJoueur2 = new JLabel("Joueur 2");
				labelJoueur2.setPreferredSize(new Dimension (100,20));
				panelHaut.add(labelJoueur1);
				panelHaut.add(labelJoueur2);
				frame.add(panelHaut, BorderLayout.NORTH);
				
				// partie basse : jeu et historique des parties en cours
				JPanel panelBas = new JPanel();
				
				// jeu
				JPanel panelJeu = new JPanel();
				panelBas.add(panelJeu);
				
				// historique des parties
				JPanel panelHisto = new JPanel();
				panelHisto.setLayout(new BoxLayout(panelHisto, BoxLayout.Y_AXIS));
				panelBas.add(panelHisto);
				
				frame.add(panelHaut, BorderLayout.CENTER);
				
				frame.pack();
				frame.setVisible(true);
				
				
				
				
			}
			
		});
	}
}
