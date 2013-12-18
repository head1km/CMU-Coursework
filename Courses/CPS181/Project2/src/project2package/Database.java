package project2package;

import edu.cmich.head1km.homework2.Person;

//@author Kyle Head
//assignment 2
//creates databases
public class Database {
	//declare variables
	private Person[] people = new Person[100];
	private int size = 0;
	
	//report method displays the persons in the array and how many there are
		String report(boolean inMetric) {
			if(true){
				String Report = "Report:\n " + Person.report(inMetric) + "\n" + size + "\n";
				return Report;
			}
			else {
				String Report = "Report:\n " + Person.report(false) + "\n" + size + "\n";
				return Report;
			}
		}
	
		//addPerson checks to see if a person can be added and then adds one
	public boolean addPerson(String name, int year, double weight, char sex) {
		if((size >= 100) || (sex != 'M' && sex != 'F')); {
			return false;
		}
			else {
				people[size] = new Person(name, year,weight, sex);
				size++;
				return true; 
		}
	}
	
	//searches the database for people of between certain ages
	public Database query(int minyear, int maxyear) {
		Database DB = new Database();
		for (int i=0; i<size; i++) {
			if (this.people[i].getYear() >= minyear || this.people[i].getYear() <= maxyear)
				DB.people[DB.size] = new Person(this.people[i]);
		}
		return DB; 
	}
//searches database for people of certain sex
	public Database query(char sex) {
		Database DB = new Database();
		for (int i=0; i<size; i++) {
			if (this.people[i].getSex() == 'M'){
				DB.people[DB.size] = new Person(this.people[i]);
				return DB; 
			}
			else if(this.people[i].getSex() == 'F'){
				DB.people[DB.size] = new Person(this.people[i]);
				return DB; 
			}
		
		}
	}
	//anonomizes the names
	public void anonomizeName() {
		for (int i=0; i<size; i++) {
			people[i].setName("anon");
		}
	}
	//anonomizes sex
	void anonomizeSex() {
		for (int i=0; i<size; i++) {
			people[i].setSex('?');
		}
	}
	//anonomizes age
	void anonomizeAge() {
		for (int i=0; i<size; i++) {
			people[i].setYear(2011);
		}
	}
	//anonomizes weight
	void  anonomizeWeight() {
		for (int i=0; i<size; i++) {
			people[i].setWeight(0);
		}
	}
	//getters and setters
	public Person[] getPeople() {
		return people;
	}
	public void setPeople(Person[] people) {
		this.people = people;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
