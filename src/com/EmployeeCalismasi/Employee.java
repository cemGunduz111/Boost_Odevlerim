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
		if (this.getTip() == "M�hendis") {
			this.setEngineerJobTitle(maas);
		} else {
			this.setOfficeJobTitle(maas);
		}
		return this.jobTitle;
	}

	public void setEngineerJobTitle(int maas) {
		if (maas > 17000)
			this.jobTitle = "Uzman M�hendis";
		else if (maas > 10000 && maas < 17000)
			this.jobTitle = "K�demli M�hendis";
		else if (maas == 10000)
			this.jobTitle = "Stajyer M�hendis";
	}

	public void setOfficeJobTitle(int maas) {
		if (maas >= 8000 && maas < 12000)
			this.setJobTitle("�al��an");
		else if (maas >= 12000 && maas < 15000)
			this.setJobTitle("K�demli �al��an");
		else if (maas < 8000)
			this.setJobTitle("Stajyer �al��an");
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
		// d��ar�dan bir oran alcak, 10 girildi ise %10 zam alcak vs.
		// m�hendis ise zam oran� + 250tl bonus, de�ilse oran kadar.

		int zamOrani;
		System.out.print("Zam oran�n� girin: ");
		zamOrani = scanner.nextInt();
		System.out.println(getJobTitle());
		if (getJobTitle().contains("M�hendis"))
			setMaas(this.maas = this.maas + 250 + (this.maas * zamOrani / 100));
		else if (getJobTitle().contains("�al��an"))
			setMaas(this.maas + (this.maas * zamOrani / 100));
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
}
