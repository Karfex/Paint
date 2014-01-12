package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import control.RectangleListener;
import control.FermerListn;
import control.PaintControl;

public class PaintView extends JFrame implements Observer{
	private PaintControl c;
	Container containHaut= new Container();
	Container containGauche= new Container();
	JComboBox formes= new JComboBox();
	JComboBox couleurs = new JComboBox();
	public JPanel dessin = new JPanel();
	ActionListener listnerUn = new FermerListn(this);
	MouseListener rect = new RectangleListener();
	
	public PaintView(PaintControl c){
		this.c=c;
		parametresAff();
	}
	
	public void parametresAff(){
		this.setTitle("Gros Paint");
		this.setSize(800,400);
		this.setLayout(new BorderLayout());
		orgaFenetre();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void orgaFenetre(){
		//MENU HAUT
		containHaut.setLayout(new GridLayout(1,5));
		JButton fermer = new JButton("Fermer");
		fermer.addActionListener(listnerUn);
		
		containHaut.add(fermer);
		
		//MENU GAUCHE
		containGauche.setLayout(new GridLayout(5,1));
		formes.addItem("Rectangle");
		formes.addItem("Ovale");
		formes.addItem("Triangle");
		formes.addItemListener(new FormesListn());
		
		couleurs.addItem("Noir");
		couleurs.addItem("Bleu");
		couleurs.addItem("Rouge");
		couleurs.addItem("Vert");
		couleurs.addItem("Jaune");
		couleurs.addItem("Rose");
		couleurs.addItemListener(new CouleurListn());
		
		containGauche.add(formes);
		containGauche.add(couleurs);
		
		//dessin
		dessin.setBackground(Color.white);
		dessin.addMouseListener(rect);
		
		//on ajoute le tout au JFrame
		this.getContentPane().add(containHaut, BorderLayout.NORTH);
		this.getContentPane().add(containGauche, BorderLayout.WEST);
		this.getContentPane().add(dessin, BorderLayout.CENTER);
	}
	
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	class FormesListn implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if(e.getItem().equals("Rectangle")){
				c.setForme("Rectangle");
			}
			if(e.getItem().equals("Ovale")){
				c.setForme("Ovale");
			}
			if(e.getItem().equals("Triangle")){
				c.setForme("Triangle");
			}
		}
	}

	


	class CouleurListn implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if(e.getItem().equals("Noir")){
				c.setCouleur(Color.black);
			}
			if(e.getItem().equals("Bleu")){
				c.setCouleur(Color.blue);
			}
			if(e.getItem().equals("Rouge")){
				c.setCouleur(Color.red);
			}
			if(e.getItem().equals("Vert")){
				c.setCouleur(Color.green);
			}
			if(e.getItem().equals("Jaune")){
				c.setCouleur(Color.yellow);
			}
			if(e.getItem().equals("Rose")){
				c.setCouleur(Color.pink);
			}
		}

	}
}
