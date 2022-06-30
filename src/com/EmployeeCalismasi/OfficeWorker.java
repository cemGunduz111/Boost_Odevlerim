package com.EmployeeCalismasi;

import java.util.Scanner;

public class OfficeWorker extends Employee {
	Scanner scanner = new Scanner(System.in);

	public OfficeWorker() {

	}

	public OfficeWorker(String name, String surname) {
		super(name, surname);
		this.tip = "Çalýþan";
		this.maas = 8000;
	}

	public OfficeWorker(String name, String surname, int maas) {
		super(name, surname, maas);
		this.tip = "Çalýþan";
	}

	public void zam() {
		int zamOrani;
		System.out.print("Zam oranýný girin: ");
		zamOrani = scanner.nextInt();
		maas = maas + (maas * zamOrani / 100);

	}
}