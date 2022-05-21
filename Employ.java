package sal.Em.Jv;

public class Empl {
	  String nom;
	  String prenom;
	  String  date;
	  public Empl (String nom,String prenom,String date) {
	  this.nom = nom;
	  this.prenom = prenom;
	  this.date = date;
	 
	  }
	  	  
	  
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
	public String  toString() {
		return  "nom :" + getNom() + "\n prenom :" + getPrenom() + "\n date :" + getDate();

	}

}
