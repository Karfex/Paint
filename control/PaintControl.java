package control;

import java.awt.Color;

import model.PaintModel;

public class PaintControl {
	private PaintModel p;
	
	public PaintControl (PaintModel p){
		this.p = p;
	}
	
	public void setCouleur(Color c){
		p.setCouleur(c);
	}
	
	public Color getCouleur(){
		return p.getCouleur();
	}
	
	public void setForme(String forme){
		p.setForme(forme);
	}
	
	public String getForme(){
		return p.getForme();
	}
}
