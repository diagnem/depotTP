package Test;


import java.util.ArrayList;

import java.util.List;

import ressources.Licence;
import ressources.Logiciel;
import ressources.Machine;
import secretaires.Secretaire;

public class Test {

	
/*____________________________________________________________________________________________________	
/*__________________________________________________PARTIE 2 _________________________________________*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Les machines */
		Machine pc0 = new Machine("PC0");		
		Machine pc1 = new Machine("PC1");		
		Machine pc2 = new Machine("PC2");		
		Machine pc3 = new Machine("PC3");		
		Machine pc4 = new Machine("PC4");
		
		/* Les logiciels */
		Logiciel word = new Logiciel("Word");
		Logiciel excel = new Logiciel("Excel");
		Logiciel access = new Logiciel("Access");
		
		/* Les licences */
		Licence licenceWord1 = new Licence("licenceWord",pc0,word);
		Licence licenceWord2 = new Licence("licenceWord",pc1,word);
		Licence licenceWord3 = new Licence("licenceWord",pc2,word);
		Licence licenceWord4 = new Licence("licenceWord",pc3,word);
		
		Licence licenceExcel1 = new Licence("licenceExcel",pc0,excel);
		Licence licenceExcel2 = new Licence("licenceExcel",pc3,excel);
		Licence licenceExcel3 = new Licence("licenceExcel",pc4,excel);

		Licence licenceAccess1 = new Licence("licenceAccess",pc0,access);
		Licence licenceAccess2 = new Licence("licenceAccess",pc2,access);
		Licence licenceAccess3 = new Licence("licenceAccess",pc4,access);

		
		/* Les secretaires */
		Secretaire yvonne = new Secretaire("Yvonne", "secretaire courrier", pc3);
		Secretaire simone = new Secretaire("Simone", "secretaire fournitures", pc4);
		Secretaire josiane = new Secretaire("Josiane", "secretaire direction", pc0);
		Secretaire clemente = new Secretaire("Clémente", "secretaire auxiliaire", pc2);		

		
		
		
		/* Affectation de licences aux machines*/
		pc0.addLicence(licenceWord1);
		pc0.addLicence(licenceExcel1);
		pc0.addLicence(licenceAccess1);

		pc1.addLicence(licenceWord2);
		
		pc2.addLicence(licenceWord3);
		pc2.addLicence(licenceAccess2);

		pc3.addLicence(licenceWord4);
		pc3.addLicence(licenceExcel2);
		
		/* Affectation de machines aux secretaires*/
		yvonne.addMachine(pc3);
		simone.addMachine(pc4);
		josiane.addMachine(pc0);
		clemente.addMachine(pc2);

		/*Affectation de secretaires aux machines*/
		pc0.addSecretaire(josiane);
		pc3.addSecretaire(yvonne);
		pc4.addSecretaire(simone);
		pc2.addSecretaire(clemente);
		
		/*Affectation des licences aux les logiciels*/
		word.addLicence(licenceWord1);
		word.addLicence(licenceWord2);
		word.addLicence(licenceWord3);
		word.addLicence(licenceWord4);

		excel.addLicence(licenceExcel1);
		excel.addLicence(licenceExcel2);
		excel.addLicence(licenceExcel3);


		access.addLicence(licenceAccess1);
		access.addLicence(licenceAccess2);
		access.addLicence(licenceAccess3);
				
		/*Affectation de secretaires aux logiciels*/
		word.addSecretaire(yvonne);
		word.addSecretaire(josiane);
		word.addSecretaire(clemente);
		
		excel.addSecretaire(yvonne);
		excel.addSecretaire(simone);
		excel.addSecretaire(josiane);
		
		access.addSecretaire(simone);
		access.addSecretaire(josiane);
		
		/* affichage */
		Test test = new Test();		
		test.getListeLogiciels(yvonne);
		test.getListeSecretaires(access);		
		test.getMachine(yvonne);
		test.getSecretaire(pc2);
	}
	
	/**
	 * Affichage de la liste des logiciels utilisés par une secrétaire donnée
	 * @param secretaire la secretaire
	 */
	public void getListeLogiciels(Secretaire secretaire){
		List<Logiciel> resultats = new ArrayList<Logiciel>();
		Machine machine=secretaire.getMachine();
		List<Licence> licences = machine.getLesLicences();
		for(Licence licence : licences){
			Logiciel logiciel = licence.getLogiciel();
			resultats.add(logiciel);			
		}
		System.out.print(secretaire.getNom() + " xxx ");
		for(Logiciel logiciel : resultats){
			System.out.print(logiciel.getNomLogiciel() + " ");
		}
		System.out.println("Ajout dans github");
	}
	
	/**
	 * Affichage de la liste des secretaires pour un logiciel donné
	 * @param le logiciel
	 */
	public void getListeSecretaires(Logiciel logiciel){
		List<Secretaire> resultats = logiciel.getLesSecretaires();
		System.out.print(logiciel.getNomLogiciel() + " : ");
		for(Secretaire secretaire : resultats){
			System.out.print(secretaire.getNom() + " ");
		}
		System.out.println();
	}
	
	/**
	 * Affichage de la machine utilisée par une secretaire donnée
	 * @param secretaire la secretaire
	 */
	public void getMachine(Secretaire secretaire){
		Machine machine = secretaire.getMachine();
		System.out.println(secretaire.getNom() + " : " + machine.getIdMachine());
	}
	
	/**
	 * Affichage de la secretaire utilisant une machine donnée
	 * @param machine la machine
	 */
	public void getSecretaire(Machine machine){
		Secretaire secretaire = machine.getSecretaire();
		System.out.println(machine.getIdMachine() + " : " + secretaire.getNom());
	}
	
	
	
	
	
/*____________________________________________________________________________________________________	
/*__________________________________________________PARTIE 1 _________________________________________*/
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//
//		/* Les machines */
//		Machine pc0 = new Machine("PC0");		
//		Machine pc1 = new Machine("PC1");		
//		Machine pc2 = new Machine("PC2");		
//		Machine pc3 = new Machine("PC3");		
//		Machine pc4 = new Machine("PC4");
//		
//		
//		/* Les logiciels */
//		Logiciel word = new Logiciel("Word");
//		Logiciel excel = new Logiciel("Excel");
//		Logiciel access = new Logiciel("Access");
//
//		
//		/* Les licences */
//		Licence licenceWord1 = new Licence("licenceWord",pc0,word);
//		Licence licenceWord2 = new Licence("licenceWord",pc1,word);
//		Licence licenceWord3 = new Licence("licenceWord",pc2,word);
//		Licence licenceWord4 = new Licence("licenceWord",pc3,word);
//		
//		Licence licenceExcel1 = new Licence("licenceExcel",pc0,excel);
//		Licence licenceExcel2 = new Licence("licenceExcel",pc3,excel);
//		Licence licenceExcel3 = new Licence("licenceExcel",pc4,excel);
//
//		Licence licenceAccess1 = new Licence("licenceAccess",pc0,access);
//		Licence licenceAccess2 = new Licence("licenceAccess",pc2,access);
//		Licence licenceAccess3 = new Licence("licenceAccess",pc4,access);
//
//		
//		/* Affectation des licences pour les machines*/
//		pc0.addLicence(licenceWord1);
//		pc0.addLicence(licenceExcel1);
//		pc0.addLicence(licenceAccess1);
//
//		pc1.addLicence(licenceWord2);
//		
//		pc2.addLicence(licenceWord3);
//		pc2.addLicence(licenceAccess2);
//
//		pc3.addLicence(licenceWord4);
//		pc3.addLicence(licenceExcel2);
//
//		
//		
//		/*Affectation des licences pour les logiciels*/
//		word.addLicence(licenceWord1);
//		word.addLicence(licenceWord2);
//		word.addLicence(licenceWord3);
//		word.addLicence(licenceWord4);
//
//		excel.addLicence(licenceExcel1);
//		excel.addLicence(licenceExcel2);
//		excel.addLicence(licenceExcel3);
//
//
//		access.addLicence(licenceAccess1);
//		access.addLicence(licenceAccess2);
//		access.addLicence(licenceAccess3);
//		
//		Test test = new Test();
//		test.getListeMachines(access);
//		test.getListeLogiciels(pc3);
//		
//	}
//
//	public void getListeMachines(Logiciel logiciel){
//		List<Machine> resultats = new ArrayList<Machine>();
//		
//		List<Licence> licences = logiciel.getLesLicences();
//		for(Licence licence : licences){
//			Machine machine = licence.getMachine();
//			resultats.add(machine);			
//		}
//		for(Machine machine : resultats){
//			System.out.println(machine.getIdMachine());
//		}
//	}
//	
//	public void getListeLogiciels(Machine machine){
//		List<Logiciel> resultats = new ArrayList<Logiciel>();
//		
//		List<Licence> licences = machine.getLesLicences();
//		for(Licence licence : licences){
//			Logiciel logiciel = licence.getLogiciel();
//			resultats.add(logiciel);			
//		}
//		for(Logiciel logiciel : resultats){
//			System.out.println(logiciel.getNomLogiciel());
//		}
//		
//	}

//	public void getListeMachines(Logiciel logiciel){
//		List<Machine> resultats = new ArrayList<Machine>();
//		
//		List<Licence> licences = logiciel.getLesLicences();
//		for(Licence licence : licences){
//			Machine machine = licence.getMachine();
//			resultats.add(machine);			
//		}
//		for(Machine machine : resultats){
//			System.out.println(machine.getIdMachine());
//		}
//	}
//	
//	public void getListeLogiciels(Machine machine){
//		List<Logiciel> resultats = new ArrayList<Logiciel>();
//		
//		List<Licence> licences = machine.getLesLicences();
//		for(Licence licence : licences){
//			Logiciel logiciel = licence.getLogiciel();
//			resultats.add(logiciel);			
//		}
//		for(Logiciel logiciel : resultats){
//			System.out.println(logiciel.getNomLogiciel());
//		}
//		
//	}
	
	
}
