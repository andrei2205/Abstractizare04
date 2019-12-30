package myPackage;

public class Student {
	private String nume, prenume, an_de_studiu, specializare, facultate, universitate;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getAn_de_studiu() {
		return an_de_studiu;
	}

	public void setAn_de_studiu(String an_de_studiu) {
		this.an_de_studiu = an_de_studiu;
	}

	public String getSpecializare() {
		return specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public String getUniversitate() {
		return universitate;
	}

	public void setUniversitate(String universitate) {
		this.universitate = universitate;
	}

	public Student(String nume, String prenume, String an_de_studiu, String specializare, String facultate,
			String universitate) {
		
		this.nume = nume;
		this.prenume = prenume;
		this.an_de_studiu = an_de_studiu;
		this.specializare = specializare;
		this.facultate = facultate;
		this.universitate = universitate;
	}
	public String toString() {
		return nume + prenume + an_de_studiu + specializare + facultate + universitate;
	}
}
