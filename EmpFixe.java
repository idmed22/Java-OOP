package sal.Em.Jv;

public class EmplFix extends Empl{
      double salair;
	public EmplFix(String nom, String prenom, String date, double salair) {
		super(nom, prenom, date);
		this.salair= salair;
	
	}
	// getter & setter
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSalair() {
		return salair;
	}
	public void setSalair(double salair) {
		this.salair = salair;
	}

	public String  toString() {
		return  " nom :" + getNom() + "\n prenom :" + getPrenom() + "\n date :" + getDate() + " \n salaire mensuel :" + getSalair() + "\n ------------------------------------------------------------";

	}
    
}
