package com.EmployeeCalismasi;

import java.util.Scanner;

public class Engineer extends Employee {
	Scanner scanner = new Scanner(System.in);

	public Engineer() {

	}

	public Engineer(String name, String surname) {
		super(name, surname);
		this.tip = "Mühendis";
		this.maas = 10000;
	}

	public Engineer(String name, String surname, int maas) {
		super(name, surname, maas);
		this.tip = "Mühendis";
	}

	public void zam() {

		int zamOrani;
		System.out.print("Zam oranýný girin: ");
		zamOrani = scanner.nextInt();
		maas = maas + 250 + (maas * zamOrani / 100);

	}

}
