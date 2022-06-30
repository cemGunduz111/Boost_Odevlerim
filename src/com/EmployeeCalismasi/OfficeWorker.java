package com.EmployeeCalismasi;

import java.util.Scanner;

public class OfficeWorker extends Employee {
	Scanner scanner = new Scanner(System.in);

	public OfficeWorker() {

	}

	public OfficeWorker(String name, String surname) {
		super(name, surname);
		this.tip = "�al��an";
		this.maas = 8000;
	}

	public OfficeWorker(String name, String surname, int maas) {
		super(name, surname, maas);
		this.tip = "�al��an";
	}

	public void zam() {
		int zamOrani;
		System.out.print("Zam oran�n� girin: ");
		zamOrani = scanner.nextInt();
		maas = maas + (maas * zamOrani / 100);

	}
}