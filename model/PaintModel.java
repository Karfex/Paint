package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;

public class PaintModel extends Observable {
	String forme;
	Color couleur;
	
	public PaintModel(){
		forme = "Rectangle";
		couleur = Color.black;
	}
	
	public void setForme(String f){
		this.forme=f;
	}
	
	public void setCouleur(Color c){
		this.couleur = c;
	}
	
	public Color getCouleur(){
		return this.couleur;
	}
	
	public String getForme(){
		return this.forme;
	}

}
