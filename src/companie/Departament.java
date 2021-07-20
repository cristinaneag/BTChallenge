package companie;

import java.util.ArrayList;

public class Departament {
	private String nume;
	private Angajat director;
	private ArrayList<Angajat> angajati;
	
	public Departament(String nume, Angajat director) {
		this.nume = nume;
		this.director = director;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Angajat getDirector() {
		return director;
	}
	public void setDirector(Angajat director) {
		this.director = director;
	}
	
	//afisare angajati din departament
	public ArrayList<Angajat> getAngajati() {
		return angajati;
	}
	public void setAngajati(ArrayList<Angajat> angajati) {
		this.angajati = angajati;
	}
	
	public void setSuperior(Angajat ang, Angajat superior) {
		
	}
	
	@Override
	public String toString() {
		return "Departament [nume=" + nume + "]";
	}
}
