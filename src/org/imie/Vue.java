package org.imie;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.imie.model.Model;
import org.imie.view.ViewInfos;
import org.imie.view.ViewMap;
import org.imie.view.ViewScore;

public class Vue implements Observer {

	private Model modele;
	
	public Vue(Model unModele) {
		super();
		this.modele = unModele;
	}

	
	public void start () {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run () {
				
				//Configuration de la vue
				JFrame frame = new JFrame("Jeu du Morpion");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(500,500));
				frame.getContentPane().setLayout(new BorderLayout());
				
				ViewInfos panelInfos = new ViewInfos();
				ViewMap panelMap = new ViewMap();
				ViewScore panelScore = new ViewScore();
				
				frame.add(panelInfos, BorderLayout.NORTH);
				frame.add(panelMap, BorderLayout.CENTER);
				frame.add(panelScore, BorderLayout.EAST);
				
				frame.pack();
				frame.setVisible(true);
			}
		});
	}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
