package sal.Em.Jv;

public class Employ {
  private String nom;
  private String prenom;
  private String  date;
  double salaire;
  public Employ (String nom,String prenom,String date) {
  this.nom = nom;
  this.prenom = prenom;
  this.date = date;
 
  }
  public Double CalSalaire(Double sal){
		 return sal;
	 }
//getter 
  public String getName() {
	  return nom;
	  
  }
  public String getPrenom() {
	  return prenom;
	  
  }
   
 public String getDate() {
	 return date;
 }
 
 
 public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public void setDate(String date) {
	this.date = date;
}
public String toString() {
	return "nom=" + nom + ", prenom=" + prenom + ", date=" + date;
}


	 
	 
 

}
