package companie;

import java.time.LocalDate;

public class Superior extends Angajat {
	private Departament departament;
	private String nume;
	private LocalDate data_angajarii;

	public Superior(LocalDate data_angajarii, String nume, Departament d) {
		super(data_angajarii, nume);
		this.data_angajarii=data_angajarii;
		this.nume=nume;
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
