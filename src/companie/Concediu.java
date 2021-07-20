package companie;

import java.time.LocalDate;

public class Concediu {
	private LocalDate data_inceput;
	private LocalDate data_final;
	
	public Concediu(LocalDate data_inceput, LocalDate data_final) {
		this.data_inceput = data_inceput;
		this.data_final = data_final;
	}
	
	public LocalDate getData_inceput() {
		return data_inceput;
	}
	public void setData_inceput(LocalDate data_inceput) {
		this.data_inceput = data_inceput;
	}
	public LocalDate getData_final() {
		return data_final;
	}
	public void setData_final(LocalDate data_final) {
		this.data_final = data_final;
	}
}
