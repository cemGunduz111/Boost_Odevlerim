package com.cem.market;

import java.util.Scanner;

public class Atistirmalik extends Urun {

	double kalori;

	public static Atistirmalik atistirmalikEkle() {

		Atistirmalik atistirmalik = new Atistirmalik();
		Scanner scanner = new Scanner(System.in);
		System.out.print("�r�n ad� gir: ");
		String ad = scanner.nextLine();
		System.out.print("�r�n fiyat� gir: ");
		double fiyat = scanner.nextDouble();
		System.out.print("�r�n sto�u gir: ");
		int stok = scanner.nextInt();
		System.out.print("�r�n kalorisini gir: ");
		double kalori = scanner.nextDouble();

		atistirmalik.birimFiyat = fiyat;
		atistirmalik.urunAdi = ad;
		atistirmalik.stok = stok;
		atistirmalik.kalori = kalori;
		atistirmalik.kategori = "At��t�rmal�k";

		return atistirmalik;
	}
}
