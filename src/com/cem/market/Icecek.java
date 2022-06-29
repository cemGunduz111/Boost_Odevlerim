package com.cem.market;

import java.util.Scanner;

public class Icecek extends Urun {

	double litre;

	public static Icecek icecekEkle() {

		Icecek icecek = new Icecek();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ürün adý gir: ");
		String ad = scanner.nextLine();
		System.out.print("Ürün fiyatý gir: ");
		double fiyat = scanner.nextDouble();
		System.out.print("Ürün stoðu gir: ");
		int stok = scanner.nextInt();
		System.out.print("Ürün litresi gir: ");
		double litre = scanner.nextDouble();

		icecek.birimFiyat = fiyat;
		icecek.urunAdi = ad;
		icecek.stok = stok;
		icecek.litre = litre;
		icecek.kategori = "Ýçecek";

		return icecek;
	}
}
