package sal.Em.Jv;

public class EmpFixe extends Employ{
	double salaire;
	
    public EmpFixe (String nom, String prenom, String date, double salaire) {
	       super (nom,prenom,date);
	       this.salaire = salaire;
	       
	}
    public double CalSalaire(double salaire){
		 return super.CalSalaire(salaire);
	 }
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String toString() {
		return super.toString() + " salaire=" + salaire;
	}
    
}
