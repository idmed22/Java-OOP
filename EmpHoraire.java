package sal.Em.Jv;

public class EmpHoraire extends Employ {
	private int tHoraire;
	private int NbHeures;
	 double salaire;
	
	
	public EmpHoraire(String nom, String prenom, String date, int tHoraire, int nbHeures) {
		super(nom, prenom, date);
		this.tHoraire = tHoraire;
		this.NbHeures = nbHeures;
	}
	
	public double CalSalaire(int tHoraire, int NbHeures){
   	 	int salaire = tHoraire*NbHeures;
   	 	return (double)salaire;
   	 	 
    }
	
	public int gettHoraire() {
		return tHoraire;
	}
	public void settHoraire(int tHoraire) {
		this.tHoraire = tHoraire;
	}
	public int getNbHeures() {
		return NbHeures;
	}
	public void setNbHeures(int nbHeures) {
		NbHeures = nbHeures;
   

	}

}
