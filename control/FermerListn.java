package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.PaintView;

public class FermerListn implements ActionListener{
	protected PaintView p;
	
	public FermerListn(PaintView p){
		this.p = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Fermer")){
			p.dispose();
		}	
	}
	
}
