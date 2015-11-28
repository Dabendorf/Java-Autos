package autos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Diese Klasse ist die Hauptklasse des AutoZeichnens, welche sowohl Grafik als auch interne Berechnungen umfasst.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class Herstellen {

	private Canvas canvas1 = new Canvas() {
	    public void paint(Graphics stift) {
	    	produktion(stift);
	    }
	};
	private JFrame frame1 = new JFrame("Autoproduktion");
	private ArrayList<Auto> autoliste = new ArrayList<Auto>();
	
	public Herstellen() {
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frame1.setSize(800,500);
	    frame1.setLocationRelativeTo(null);
	    frame1.setResizable(false);
	    Container cp = frame1.getContentPane();
	    cp.setLayout(new GridLayout(1,1));
	    frame1.add(canvas1);
	    frame1.setVisible(true);
		autodefinition();
	}
	
	/**
	 * Diese Methode fuegt Autos nach bestimmten Eigenschaften hinzu.
	 */
	private void autodefinition() {
		Auto dabendorf = new Auto("VEB Dabendorf","Dabendorf","Mittelklasse",150,25,Color.green,20,20);
		Auto berlin = new Auto("Klaus Wowereit","Pleitegeier I.","Kleinwagen",130,30,Color.darkGray,200,200);
		Auto napoleon = new Auto("KLINGER","Grand Armée","Monstertruck",300,50,Color.blue,400,150);
		
		autoliste.add(dabendorf);
		autoliste.add(berlin);
		autoliste.add(napoleon);
	}
	
	/**
	 * Diese Methode produziert alle Autos in der Autoliste nach den genannten Eigenschaften.
	 * @param stift Nimmt das GraphicsElement entgegen.
	 */
	private void produktion(Graphics stift) {
		for(Auto a:autoliste) {
			stift.setColor(a.getFarbe());
			stift.fillRect(a.getX(), a.getY(), a.getGroesse(), a.getGroesse()/3);
			stift.setColor(Color.BLACK);
			stift.drawRect(a.getX(), a.getY(), a.getGroesse(), a.getGroesse()/3);
			stift.fillOval(a.getX()+(a.getGroesse())/15, a.getY()+a.getGroesse()/3, a.getReifengroesse(), a.getReifengroesse());
			stift.fillOval(a.getX()+(a.getGroesse())-a.getReifengroesse()-8, a.getY()+a.getGroesse()/3, a.getReifengroesse(), a.getReifengroesse());
		}
	}
	
	public static void main(String[] args) {
		new Herstellen();
	}
}