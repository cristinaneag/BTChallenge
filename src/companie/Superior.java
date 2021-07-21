package companie;

import java.time.LocalDate;

public class Superior extends Angajat {
	private Departament departament;
	private String nume;
	private LocalDate data_angajarii;

	public Superior(Angajat a, Departament d) {
		super(a.getData_angajarii(), a.getNume());
		this.data_angajarii=a.getData_angajarii();
		this.nume=a.getNume();
		this.departament=d;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	@Override
	public String toString() {
		return "Superior [departament=" + departament + ", nume=" + nume + "]";
	}

	
}
