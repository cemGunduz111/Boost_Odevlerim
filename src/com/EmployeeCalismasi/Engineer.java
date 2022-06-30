package com.EmployeeCalismasi;

import java.util.Scanner;

public class Engineer extends Employee {
	Scanner scanner = new Scanner(System.in);

	public Engineer() {

	}

	public Engineer(String name, String surname) {
		super(name, surname);
		this.tip = "M�hendis";
		this.maas = 10000;
	}

	public Engineer(String name, String surname, int maas) {
		super(name, surname, maas);
		this.tip = "M�hendis";
	}

	public void zam() {

		int zamOrani;
		System.out.print("Zam oran�n� girin: ");
		zamOrani = scanner.nextInt();
		maas = maas + 250 + (maas * zamOrani / 100);

	}

}
