package test.fr.eni.annuaire;

import java.util.HashMap;
import java.util.Map;

import fr.eni.annuaire.AnnuaireException;
import fr.eni.annuaire.AnnuaireMapImpl;
import fr.eni.annuaire.Employe;

public class AnnuaireMapImplTest {

	public static void main(String[] args) throws AnnuaireException {
		System.out.println("Partie 1 - Instanciation de 4 employés.");
		Employe e1 = new Employe(1, "Bob",  "bob@campus-eni.fr");
		Employe e2 = new Employe(2, "Charles",  "charles@campus-eni.fr");
		Employe e3 = new Employe(3, "Geraldine",  "geraldine@campus-eni.fr");
		Employe e4 = new Employe(4, "Anne",  "anne@campus-eni.fr");

		System.out.println("e1 : " + e1);
		System.out.println("e2 : " + e2);
		System.out.println("e3 : " + e3);
		System.out.println("e4 : " + e4);
		
		System.out.println("\nPartie 2 - Test de l'AnnuaireMapImpl de type Map");
		AnnuaireMapImpl AnnuaireMapImpl =  new AnnuaireMapImpl();
	
		//Ajout des employés
		AnnuaireMapImpl.ajouterEmploye(e1);
		AnnuaireMapImpl.ajouterEmploye(e2);
		AnnuaireMapImpl.ajouterEmploye(e3);
		AnnuaireMapImpl.ajouterEmploye(e4);
		
		//Affichage de l'AnnuaireMapImpl
		AnnuaireMapImpl.afficher();
		
		System.out.println("Recherche d'un employé existant : ");
		Employe emp = AnnuaireMapImpl.getEmployeParNo(2);
		System.out.println("Employé trouvé : " + emp.toString());
		System.out.println("Recherche d'un employé inexistant : ");
		Employe empInconnu = AnnuaireMapImpl.getEmployeParNo(5);
		//System.out.println("Employé trouvé : " + empInconnu.toString());
	}

}
