package model;

public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Constructors
	public Employee() {
		setName(name);
		setMonthlySalary(monthlySalary);
		setAge(age);
	}
	
	public Employee(String n, double ms, int a) {
		setName(n);
		setMonthlySalary(ms);
		setAge(a);
	}
	
	public Employee(String n) {
		setName(n);
	}
	
}
