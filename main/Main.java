package main;

import view.PaintView;
import control.PaintControl;
import model.PaintModel;

public class Main {
	public static void main (String [] args ){
		PaintModel paint = new PaintModel();
		PaintControl control = new PaintControl(paint);
		PaintView view = new PaintView(control);
		
	}
}
