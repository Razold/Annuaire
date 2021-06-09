package fr.eni.annuaire;

import java.util.ArrayList;
import java.util.List;

public class Annuaire {

	private static List<Employe> employes= new ArrayList<Employe>();
	
	public Annuaire(){
	}
	
	
	/**
	 * Description : Ajoute un employe à l'annuaire
	 * @param c
	 */
	public static void ajouterEmploye(Employe c){
		employes.add(c);
	}
	
	/**
	 * Description : Rechere un employe dans l'annuaire par son numéro d'employé
	 *               et le retourne en résultat.
	 * @param no
	 * @return
	 * 	 * @throws AnnuaireException 
	 */
	public Employe getEmployeParNo(Integer no) throws AnnuaireException{		
		
		Employe employeTrouve = null;
		try {
			for(int indiceListeEmployes = 0;indiceListeEmployes < employes.size(); indiceListeEmployes++) {
				if(no.equals(employes.get(indiceListeEmployes).getNoEmploye())) {//Comme no est un integer et donc vu comme l'objet int et non le type int on compare les objets pas les types
					employeTrouve=employes.get(indiceListeEmployes);
					break;
				}
			}
			if(employeTrouve==null) {
				AnnuaireException ae =new AnnuaireException(" Employé inconnu.");
				throw ae;
			}else {
				return(employeTrouve);
			}

		}catch(AnnuaireException ae) {
			System.out.println("\n Une erreur est survenue :"+ae.getMessage());
			
		}
		return employeTrouve;
		
	}
	
	/**
	 * Description : Affiche la liste des employés de l'annuaire sur la console
	 */
	public void afficher(){
		
		System.out.println(employes.toString());

	}

	public void trier(){
		
	}
	
}






