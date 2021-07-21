package companie;

import java.util.ArrayList;
import java.util.Date;

public class Companie {
	private ArrayList<Angajat> angajati = new ArrayList<Angajat>();	
	private ArrayList<Departament> departamente = new ArrayList<Departament>();
	
	public void setAngajati(ArrayList<Angajat> ang) {
		this.angajati=ang;
	}
	
	public ArrayList<Angajat> getAngajati(){
		return this.angajati;
	}
	
	public ArrayList<Departament> getDepartamente() {
		return departamente;
	}

	public void setDepartamente(ArrayList<Departament> departamente) {
		this.departamente = departamente;
	}

	//atribuire angajati pe proiect
	public ArrayList<Angajat> setProiect(ArrayList<Angajat> angajati_proiect, Proiect p) {
		ArrayList<Angajat> ang_indisponibili = new ArrayList<Angajat>();
		angajati_proiect.forEach(a->{
			if((a.getConcediu().getData_inceput().isAfter(p.getData_start()) && a.getConcediu().getData_inceput().isBefore(p.getData_final())) ||
			(a.getConcediu().getData_final().isAfter(p.getData_start()) && a.getConcediu().getData_final().isBefore(p.getData_final())
					)) {
				ang_indisponibili.add(a);
			}
			else {
				ArrayList<Proiect> proiecte_ang = a.getProiecte();
				if(proiecte_ang==null) {
					proiecte_ang = new ArrayList<Proiect>();
				}
				proiecte_ang.add(p);
				a.setProiecte(proiecte_ang);
				}
		});
		return ang_indisponibili;
	}
	
	//returnare departamente din proiect
	public ArrayList<Departament> getDepByProiect(Proiect p){
		ArrayList<Departament> depart = new ArrayList<Departament>();
		this.getAngajati().forEach(ang->{
			if(ang.getProiecte()!=null) {
				if(ang.getProiecte().contains(p)) {
					this.getDepartamente().forEach(dep->{
						if(dep.getAngajati().contains(ang)) {
						if(!depart.contains(dep))
							depart.add(dep);
					}});
				}
			}
		});
		return depart;
	}
	
	//inlocuire angajat
	public void switchAngajati(Angajat a1, Angajat a2) {
		this.getDepartamente().forEach(dep->{
			if(dep.getAngajati().contains(a1)) {
				ArrayList<Angajat> angajati_existenti = dep.getAngajati();
				angajati_existenti.add(a2);
				angajati_existenti.remove(a1);
				dep.setAngajati(angajati_existenti);
			}
		});
		a2.setProiecte(a1.getProiecte());
		a2.setFunctie_ocupata(a1.getFunctie_ocupata());
		a2.setSuperior_direct(a1.getSuperior_direct());
		a2.setConcediu(a1.getConcediu());
		this.angajati.add(a2);
		this.angajati.remove(a1);
	}
	
}
