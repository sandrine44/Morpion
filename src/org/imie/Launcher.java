package org.imie;

import org.imie.model.Model;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Model modeleMorpion = new Model();
	  
	  Vue vueMorpion = new Vue(modeleMorpion);
	  vueMorpion.start();
	}

}
