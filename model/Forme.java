package model;

public abstract class Forme {
	protected String name;
	protected Point pointDebut, pointFin;
	
	public Forme(Point pointDebut, Point pointFin) {
		this.pointDebut = pointDebut;
		this.pointFin = pointFin;
	}
}
