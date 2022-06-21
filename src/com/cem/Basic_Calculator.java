package com.cem;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("==HESAP MAKINESI==");
			System.out.println("1- Topla");
			System.out.println("2- Cikar");
			System.out.println("3- Carp");
			System.out.println("4- Bol");
			System.out.println("5- Faktoriyel");
			System.out.println("6- Us hesaplat");
			System.out.println("7- Asal Kontrolu");
			System.out.println("0- Cikis");
			System.out.println("Bir islem seciniz");
			input = scanner.nextInt();

			switch (input) {
			case 1:
				topla();
				break;
			case 2:
				cikar();
				break;
			case 3:
				carp();
				break;
			case 4:
				bol();
				break;
			case 5:
				faktoriyel();
				break;
			case 6:
				us();
				break;
			case 7:
				asal();
				break;

			case 0:
				System.out.println("Gule gule...");
				break;

			default:
				break;
			}

		} while (input != 0);
	}

	public static void topla() {

		// = girene kadar girilen tüm sayıları toplasın
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayi;
		int toplam = 0;
		do {
			System.out.print("Lutfen bir sayi giriniz: ");
			sayi = scanner.nextInt();
			scanner.nextLine();
			toplam += sayi;
			System.out.println("Islemi sonlandirmak icin = tusuna basin.");
			input = scanner.nextLine();

		} while (!input.equals("="));
		System.out.println("Toplam= " + toplam);

	}

	public static void cikar() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayi;
		int count = 0;
		int toplam = 0;
		do {

			System.out.println("Lutfen bir sayi giriniz: ");
			sayi = scanner.nextInt();
			count++;
			scanner.nextLine();
			if (count == 1) {
				toplam = sayi;
			} else {
				toplam -= sayi;
			}

			System.out.println("Islemi sonlandirmak icin = tusuna basin.");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("Fark= " + toplam);

	}

	public static void carp() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayi;
		int carpim = 1;
		do {
			System.out.println("Lutfen bir sayi girin");
			sayi = scanner.nextInt();
			scanner.nextLine();
			carpim = carpim * sayi;
			System.out.println("Islemi sonlandirmak icin = tusuna basin.");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("Carpim: " + carpim);
	}

	public static void bol() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		double sayi;
		double bolum = 1.0;

		do {
			System.out.println("Lutfen bir sayi girin");
			sayi = scanner.nextDouble();
			scanner.nextLine();
			bolum = bolum / sayi;
			System.out.println("Islemi sonlandirmak icin = tusuna basin.");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("Bolum: " + bolum);
	}

	public static void faktoriyel() {
		int sayi;
		int faktoriyel = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Faktoriyeli alinacak sayiyi girin: ");
		sayi = scanner.nextInt();
		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel * i;
		}
		System.out.println("Faktoriyeli: " + faktoriyel);
	}

	public static void us() {
		Scanner scanner = new Scanner(System.in);
		int sayi1;
		int sayi2;
		System.out.print("Ussu alinacak sayiyi girin: ");
		sayi1 = scanner.nextInt();
		System.out.print("Hangi kuvveti alinsin? :");
		sayi2 = scanner.nextInt();
		System.out.println("Sonuc: " + Math.pow(sayi1, sayi2));
	}

	public static void asal() {
		Scanner scan = new Scanner(System.in);

		int sayi;
		int sayac = 0;
		System.out.print("Sayi girin: ");
		sayi = scan.nextInt();

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}
		}
		if (sayac == 0) {
			System.out.println(sayi + " sayisi asaldir.");
		} else {
			System.out.println(sayi + " sayisi asal degildir.");
		}
	}

}
