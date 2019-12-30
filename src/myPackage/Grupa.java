package myPackage;

import java.util.ArrayList;

public class Grupa {
	private int nr_grupa;
	public int getNr_grupa() {
		return nr_grupa;
	}
	public void setNr_grupa(int nr_grupa) {
		this.nr_grupa = nr_grupa;
	}
	public Grupa(int nr_grupa) {
		super();
		this.nr_grupa = nr_grupa;
	}
	
	ArrayList<Student> myArr = new ArrayList<Student>(); 
	
	public void addStudent(ArrayList<Student> myArr, Student student1) {
		myArr.add(student1);
		student1.toString();
	}
	public void afisareAll(ArrayList<Student> myArr) {
		for (Student student : myArr) {
			System.out.println(student);
		}
	}
}
