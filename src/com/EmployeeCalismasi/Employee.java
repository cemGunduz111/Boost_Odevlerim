package com.EmployeeCalismasi;

import java.util.Scanner;

public class Employee {
	static Scanner scanner = new Scanner(System.in);

	public String name;
	public String surname;
	public String jobTitle;
	public int maas;
	public String tip;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJobTitle() {
		if (this.getTip() == "Mühendis") {
			this.setEngineerJobTitle(maas);
		} else {
			this.setOfficeJobTitle(maas);
		}
		return this.jobTitle;
	}

	public void setEngineerJobTitle(int maas) {
		if (maas > 17000)
			this.jobTitle = "Uzman Mühendis";
		else if (maas > 10000 && maas < 17000)
			this.jobTitle = "Kýdemli Mühendis";
		else if (maas == 10000)
			this.jobTitle = "Stajyer Mühendis";
	}

	public void setOfficeJobTitle(int maas) {
		if (maas >= 8000 && maas < 12000)
			this.setJobTitle("Çalýþan");
		else if (maas >= 12000 && maas < 15000)
			this.setJobTitle("Kýdemli Çalýþan");
		else if (maas < 8000)
			this.setJobTitle("Stajyer Çalýþan");
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {

		this.maas = maas;
	}

	public Employee() {

	}

	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;

	}

	public Employee(String name, String surname, int maas) {
		super();
		this.name = name;
		this.surname = surname;
		this.maas = maas;
	}

	public void maasZam() {
		// dýþarýdan bir oran alcak, 10 girildi ise %10 zam alcak vs.
		// mühendis ise zam oraný + 250tl bonus, deðilse oran kadar.

		int zamOrani;
		System.out.print("Zam oranýný girin: ");
		zamOrani = scanner.nextInt();
		System.out.println(getJobTitle());
		if (getJobTitle().contains("Mühendis"))
			setMaas(this.maas = this.maas + 250 + (this.maas * zamOrani / 100));
		else if (getJobTitle().contains("Çalýþan"))
			setMaas(this.maas + (this.maas * zamOrani / 100));
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
}
