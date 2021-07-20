package companie;

import java.time.LocalDate;
import java.util.ArrayList;

public class Angajat {
	private String nume;
	private LocalDate data_angajarii;
	private Functie functie_ocupata;
	//deoarece poate avea superiori diferiti daca face parte din mai multe departamente
	private ArrayList<Superior> superior_direct;
	private Concediu concediu;
	private ArrayList<Proiect> proiecte;

	public Angajat(LocalDate data_angajarii, String nume) {
		this.data_angajarii = data_angajarii;
		this.nume=nume;
	}

	public Functie getFunctie_ocupata() {
		return functie_ocupata;
	}

	public void setFunctie_ocupata(Functie functie_ocupata) {
		this.functie_ocupata = functie_ocupata;
	}
	
	public LocalDate getData_angajarii() {
		return data_angajarii;
	}

	public void setData_angajarii(LocalDate data_angajarii) {
		this.data_angajarii = data_angajarii;
	}

	public ArrayList<Superior> getSuperior_direct() {
		return superior_direct;
	}

	public void setSuperior_direct(ArrayList<Superior> superior_direct) {
		this.superior_direct = superior_direct;
	}

	public Concediu getConcediu() {
		return concediu;
	}

	public void setConcediu(Concediu concediu) {
		this.concediu = concediu;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ArrayList<Proiect> getProiecte() {
		return proiecte;
	}

	public void setProiecte(ArrayList<Proiect> proiecte) {
		this.proiecte = proiecte;
	}

	//calcul salariu
	public float calculeazaSalariu() {
		int nr_ani = LocalDate.now().getYear() - this.data_angajarii.getYear();
		return nr_ani*this.functie_ocupata.getSalariu_baza();
	}

	@Override
	public String toString() {
		return "Angajat [nume=" + nume + "]";
	}
	
	
}
