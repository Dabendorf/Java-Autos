package autos;

import java.awt.Color;

/**
 * Diese Klasse repraesentiert ein Auto.<br>
 * Als Eigenschaften enthaelt sie die (x,y)-Koordinaten eines Punktes, ausserdem die Farbe, Groesse, Reifengroesse und Angaben zum Modell.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class Auto {

	private String hersteller;
	private String modellname;
	private String modelltyp;
	private int groesse;
	private int reifengroesse;
	private Color farbe;
	private int x, y;
	
	public Auto(String hersteller, String modellname, String modelltyp, int groesse, int reifengroesse, Color farbe, int x, int y) {
		this.hersteller = hersteller;
		this.modellname = modellname;
		this.modelltyp = modelltyp;
		this.groesse = groesse;
		this.reifengroesse = reifengroesse;
		this.farbe = farbe;
		this.x = x;
		this.y = y;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	
	public String getModellname() {
		return modellname;
	}
	
	public void setModellname(String modellname) {
		this.modellname = modellname;
	}
	
	public String getModelltyp() {
		return modelltyp;
	}
	
	public void setModelltyp(String modelltyp) {
		this.modelltyp = modelltyp;
	}
	
	public int getGroesse() {
		return groesse;
	}
	
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	
	public int getReifengroesse() {
		return reifengroesse;
	}
	
	public void setReifengroesse(int reifengroesse) {
		this.reifengroesse = reifengroesse;
	}
	
	public Color getFarbe() {
		return farbe;
	}
	
	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}