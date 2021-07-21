package companie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Test {
	public static void main(String[]args) {
		Companie com = new Companie();
		
		//CREARE ANGAJATI//
		 Angajat ang1 = new Angajat(LocalDate.of(2012,8,6),"Pop Ana");
		 Angajat ang2 = new Angajat(LocalDate.of(2016,2,18), "Ilie Andrei");
		 Angajat ang3 = new Angajat(LocalDate.of(2013,5,28), "Vaida Marcu");
		 Angajat ang4 = new Angajat(LocalDate.of(2019,10,20), "Dumitru Ioana");
		 Angajat ang5 = new Angajat(LocalDate.of(2017,3,17), "Iancu Alexa");
		
		 Functie programator = new Functie(2500);
		 Functie manager = new Functie(3000);
		
		Concediu c1 = new Concediu(LocalDate.of(2021,8,1),LocalDate.of(2021,8,31));
		Concediu c2 = new Concediu(LocalDate.of(2021,5,1),LocalDate.of(2021,5,30));
		Concediu c3 = new Concediu(LocalDate.of(2021,6,5),LocalDate.of(2021,7,4));
		Concediu c4 = new Concediu(LocalDate.of(2021,11,1),LocalDate.of(2021,11,30));
		Concediu c5 = new Concediu(LocalDate.of(2021,8,16),LocalDate.of(2021,9,15));
		ang1.setFunctie_ocupata(programator);
		ang2.setFunctie_ocupata(manager);
		ang3.setFunctie_ocupata(programator);
		ang4.setFunctie_ocupata(programator);
		ang5.setFunctie_ocupata(manager);
		
		ang1.setConcediu(c1);
		ang2.setConcediu(c2);
		ang3.setConcediu(c3);
		ang4.setConcediu(c4);
		ang5.setConcediu(c5);
		
		
		ArrayList<Angajat> angajati = new ArrayList<Angajat>();
		angajati.add(ang1);angajati.add(ang2);angajati.add(ang3);
		angajati.add(ang4);angajati.add(ang5);
		com.setAngajati(angajati);
		
		///SALARIU////
		com.getAngajati().forEach(ang->{
			System.out.println("Salariul angajatului "+ang.getNume()+" este: "+ang.calculeazaSalariu());
		});
		
		///PROIECT///
		ArrayList<Proiect> proiecte = new ArrayList<Proiect>();
		Proiect p1 = new Proiect(LocalDate.of(2021,8,4),LocalDate.of(2021,10,8));
		proiecte.add(p1);
		
		Proiect p2 =  new Proiect(LocalDate.of(2021,5,20),LocalDate.of(2021,7,20));
		proiecte.add(p2);
		
		System.out.println("Persoanele indisponibile pentru proiect1: "+com.setProiect(angajati,p1));
		System.out.println("Persoanele indisponibile pentru proiect2: "+com.setProiect(angajati,p2));
		
		//ANGAJATII UNUI DEPARTAMENT///
		ArrayList<Departament> dep = new ArrayList<Departament>();
		Departament dep1 = new Departament("Java",ang2);
		Departament dep2 = new Departament("Baze de date",ang5);
		dep.add(dep1); dep.add(dep2);
		com.setDepartamente(dep);
		
		ArrayList<Superior> superior_Java = new ArrayList<Superior>();
		ArrayList<Superior> superior_BD = new ArrayList<Superior>();
		Superior sup_Java = new Superior(ang2,dep1);
		Superior sup_BD = new Superior(ang5,dep2);
		superior_Java.add(sup_Java); superior_BD.add(sup_BD);	
				
		ArrayList<Angajat> angajati_dep1 = new ArrayList<Angajat>();
		angajati_dep1.add(ang1);angajati_dep1.add(ang2);angajati_dep1.add(ang4);
		ang1.setSuperior_direct(superior_Java);
		ang4.setSuperior_direct(superior_Java);
		dep1.setAngajati(angajati_dep1);
		System.out.println("Angajatii departamentului "+dep1.getNume()+" sunt: "+dep1.getAngajati());
		
		ArrayList<Angajat> angajati_dep2 = new ArrayList<Angajat>();
		angajati_dep2.add(ang5);angajati_dep2.add(ang3);
		ang3.setSuperior_direct(superior_BD);
		dep2.setAngajati(angajati_dep2);
		System.out.println("Angajatii departamentului "+dep2.getNume()+" sunt: "+dep2.getAngajati());
		com.getAngajati().forEach(ang->{
			System.out.println(ang.getNume()+"-"+ang.getSuperior_direct());
		});
		
		//DEPARTAMENTE DIN PROIECT//
		System.out.println("Departamentele din proiect1 sunt: "+com.getDepByProiect(p1));
		System.out.println("Departamentele din proiect2 sunt: "+com.getDepByProiect(p2));
		
		///SCHIMBARE ANGAJATI///
		Angajat angaj1 = new Angajat(LocalDate.now(),"Indrescu Alina");
		com.switchAngajati(com.getAngajati().get(0), angaj1);
		System.out.println(dep1.getAngajati());
		
	}
		
}
