package fr.eni.annuaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class AnnuaireMapImpl {

//clé Integer: n0Employe  valeur:instance d'Employé
	private  Map<Integer,Employe>employes;

	
	public AnnuaireMapImpl(){
		employes= new HashMap<Integer,Employe>();
	}
	/**
	 * Description : Ajoute un employe à l'annuaire
	 * @param c
	 */
	public void ajouterEmploye(Employe emp){
		//j'incremente pour augmenter le noEmploye
		
		//on ajoute une combinaison clé/valeur à la map
		employes.put(emp.getNoEmploye(),emp);
	}
	
	/**
	 * Description : Rechere un employe dans l'annuaire par son numéro d'employé
	 *               et le retourne en résultat.
	 * @param no
	 * @return
	 * 	 * @throws AnnuaireException 
	 */
	public Employe getEmployeParNo(Integer no) throws AnnuaireException{		
		Employe aRetourner = employes.get(no);
		try {
			if(aRetourner==null){
				//Cas d'erreur
				throw new AnnuaireException("Numéro d'employé inconnu");				
			}
		}catch(AnnuaireException ae){
			System.out.println("annuaire exception");
		}

		
		return aRetourner;
	}
	
	/**
	 * Description : Affiche la liste des employés de l'annuaire sur la console
	 */
	public void afficher(){
		//La liste des employés est une liste de valeurs
		System.out.println(employes.values());

	}

	public void trier(){
		
	}

}









