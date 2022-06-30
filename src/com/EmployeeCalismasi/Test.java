package com.EmployeeCalismasi;

public class Test {

	static Employee employee = new Employee();
	static Engineer engineer = new Engineer();
	static OfficeWorker officeWorker = new OfficeWorker();

	public static void main(String[] args) {

		officeWorker = new OfficeWorker("Cem", "Gündüz");

		System.out.println(officeWorker.getName() + " " + officeWorker.getSurname());
		System.out.println(officeWorker.getMaas());
		System.out.println(officeWorker.getJobTitle());
		System.out.println("-----------------------------");

		officeWorker.maasZam();

		System.out.println(officeWorker.getName() + " " + officeWorker.getSurname());
		System.out.println(officeWorker.getMaas());
		System.out.println(officeWorker.getJobTitle());

		System.out.println("========================");

		engineer = new Engineer("Emre", "Gündüz", 12000);
		System.out.println(engineer.getName() + " " + engineer.getSurname());
		System.out.println(engineer.getMaas());
		System.out.println(engineer.getJobTitle());

		System.out.println("-----------------------------");

		engineer.maasZam();

		System.out.println(engineer.getName() + " " + engineer.getSurname());
		System.out.println(engineer.getMaas());
		System.out.println(engineer.getJobTitle());
	}

}
