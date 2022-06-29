package com.cem.market;

import java.util.Scanner;

public class Urun {
	String urunAdi = "";
	int stok = 0;
	double birimFiyat = 0;
	String kategori;

	public static Urun urun_ekle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("Kategori seçin");
		System.out.println("1- Ýçecek");
		System.out.println("2- Atýþtýrmalýk");
		System.out.println("================================");
		System.out.print("Seçim : ");
		int secim = scanner.nextInt();
		switch (secim) {
		case 1:
			Icecek yeniIcecek = Icecek.icecekEkle();
			return yeniIcecek;
		case 2:
			Atistirmalik yeniAtistirmalik = Atistirmalik.atistirmalikEkle();
			return yeniAtistirmalik;
		}
		return null;
	}
}
