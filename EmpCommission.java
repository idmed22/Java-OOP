package sal.Em.Jv;

public class EmpCommission extends Employ {
	private int ventes;
	private Double commission;
	private Double salaire;
	
    public EmpCommission(String nom,String prenom, String date, int ventes, Double commission, Double salaire) {
    	super (nom,prenom,date);
	    this.ventes= ventes;
	    this.commission= commission;  
	    this.salaire = salaire;
	     
    }
    public Double CalSalaire(int ventes, Double commission, Double sal){
   	 	return super.CalSalaire(sal);
    }
	public int getVentes() {
		return ventes;
	}
	public void setVentes(int ventes) {
		this.ventes = ventes;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
    
    
   
}
