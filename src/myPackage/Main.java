package myPackage;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
	Student student1 = new Student("Tamas ","Denis", " anul III", " specializarea Informatica", " facultatea de Tehnologie a informatiei ", "Universitatea Oradea");
	Grupa grupa1 = new Grupa(111);
	ArrayList<Student> myArrGrupa1 = new ArrayList<Student>();
	grupa1.addStudent(myArrGrupa1, student1);
	grupa1.afisareAll(myArrGrupa1);
	
	Student student2 = new Student("Dancila ", "Viorica ", "anul I de studiu ", "Forajul Sondelor si Exploatarea Zacamintelor de Hidrocarburi ", "Scoala Nationala de Studii Politice si Administrative ", "Institutul de Petrol si Gaze Ploiesti");
	Grupa grupa2 = new Grupa(222);
	ArrayList<Student> myArrGrupa2 = new ArrayList<Student>();
	grupa1.addStudent(myArrGrupa2, student2);
	grupa1.afisareAll(myArrGrupa2);
	}
}
