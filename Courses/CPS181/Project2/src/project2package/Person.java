package project2package;

import edu.cmich.head1km.homework2.Weight;

//@author Kyle Head
//assignment 2
//creates people to fill databases
public class Person {
	//declares variables
	private String name;
	private int year;
	private double height;
	private double weight;
	private char sex;
	private int age;
	
	//creates a string to send to report
	public String report(boolean inMetric){
		age = 2011 - this.year;
		if(true){
			String person = (name + ", " + age + ", " + sex + ", " + weight);
			return person;
		}
		else {
			weight = Weight.getStd();
			String person = (name + ", " + age + ", " + sex + ", " + weight);
			return person;
		}
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	//constructors
	public Person(String name, int year, double weight, char sex) {
		super();
		this.name = name;
		this.year = year;
		this.weight = weight;
		this.sex = sex;
	}
	public Person(Person person) {
		this.name = getName();
		this.year = getYear();
		this.weight = getWeight();
		this.sex = getSex();
	}
	
}
