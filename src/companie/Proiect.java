package companie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Proiect {
	private LocalDate data_start;
	private LocalDate data_final;
	
	public Proiect(LocalDate data_start, LocalDate data_final) {
		this.data_start = data_start;
		this.data_final = data_final;
	}
	public LocalDate getData_start() {
		return data_start;
	}
	public void setData_start(LocalDate data_start) {
		this.data_start = data_start;
	}
	public LocalDate getData_final() {
		return data_final;
	}
	public void setData_final(LocalDate data_final) {
		this.data_final = data_final;
	}
}
