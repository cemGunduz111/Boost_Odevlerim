package com.cem.market;

import java.util.Scanner;

public class Atistirmalik extends Urun {

	double kalori;

	public static Atistirmalik atistirmalikEkle() {
		Atistirmalik atistirmalik = new Atistirmalik();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ürün adý gir: ");
		String ad = scanner.nextLine();
		System.out.print("Ürün fiyatý gir: ");
		double fiyat = scanner.nextDouble();
		System.out.print("Ürün stoðu gir: ");
		int stok = scanner.nextInt();
		System.out.print("Ürün kalorisini gir: ");
		double litre = scanner.nextDouble();

		atistirmalik.birimFiyat = fiyat;
		atistirmalik.urunAdi = ad;
		atistirmalik.stok = stok;
		atistirmalik.kalori = litre;
		atistirmalik.kategori = "Atýþtýrmalýk";

		return atistirmalik;
	}
}
