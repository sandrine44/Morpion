package org.imie.view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewInfos extends JPanel {

	public ViewInfos() {
		super();
		// TODO Auto-generated constructor stub
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel labelJoueur1 = new JLabel("Joueur N°1");
		JLabel labelJoueur2 = new JLabel("Joueur N°2");
		
		this.add(labelJoueur1);
		this.add(labelJoueur2);
	}
	
	

}
