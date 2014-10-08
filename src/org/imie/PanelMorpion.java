/**
 * 
 */
package org.imie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author imie
 *
 */
public class PanelMorpion extends JPanel {

	public PanelMorpion() {
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
		
		
		
		// partie haute : joueurs
		/*
		JPanel panelHaut = new JPanel();
		panelHaut.setLayout(new BoxLayout(panelhaut, BOXLAYOUT.Y_AXIS));
		
		JLabel labelJoueur1 = new JLabel("Joueur 1");
		labelJoueur1.setPreferredSize(new Dimension (100,20));
		JLabel labelJoueur2 = new JLabel("Joueur 2");
		labelJoueur2.setPreferredSize(new Dimension (100,20));
		
		panelHaut.add(labelJoueur1);
		panelHaut.add(labelJoueur2);
		frame.add(panelHaut, BorderLayout.NORTH);
		*/
		
		// partie basse : jeu et historique des parties en cours
		//JPanel panelBas = new JPanel();
		
		// jeu
		//JPanel panelJeu = new JPanel();
		//panelBas.add(panelJeu);
		
		// historique des parties
		//JPanel panelHisto = new JPanel();
		//panelHisto.setLayout(new BoxLayout(panelHisto, BoxLayout.Y_AXIS));
		//panelBas.add(panelHisto);
	}

}
