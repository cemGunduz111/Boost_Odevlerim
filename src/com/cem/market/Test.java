package com.cem.market;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);
	static Market market = new Market();

	public static void main(String[] args) {
		System.out.print("Marketin adýný girin:");
		String market_adi = scanner.nextLine();
		market.marketAdi = market_adi;

		ana_menu();

	}

	public static void urun_listele() {
		System.out.println("================================");
		System.out.println(market.marketAdi + " ürünleri");
		for (int i = 0; i < market.urunSayisi; i++) {
			Urun urun = market.urunler[i];
			System.out.println(i + 1 + ")" + "Ad: " + urun.urunAdi);
			System.out.println("  Fiyat: " + urun.birimFiyat);
			System.out.println("  Stok: " + urun.stok);
			System.out.println("  Sýnýf: " + urun.kategori);

		}
		ana_menu();
	}

	public static void urun_ekle() {
		System.out.println("================================");
		System.out.println("Ürün ekleme ekranýna hoþgeldiniz");
		Urun eklenenUrun = Urun.urun_ekle();
		market.urunler[market.urunSayisi] = eklenenUrun;
		market.urunSayisi += 1;
		System.out.println("Ürün eklendi..");
		System.out.println(market.urunSayisi + ")" + "Ad: " + eklenenUrun.urunAdi);
		System.out.println("  Fiyat: " + eklenenUrun.birimFiyat);
		System.out.println("  Stok: " + eklenenUrun.stok);
		System.out.println("  Kategori: " + eklenenUrun.kategori);

		ana_menu();
	}

	public static void ana_menu() {
		System.out.println("================================");
		System.out.println(market.marketAdi);
		System.out.println("1- Ürün ekle");
		System.out.println("2- Ürünleri listele");
		System.out.println("================================");
		int secim = scanner.nextInt();
		switch (secim) {
		case 1:
			urun_ekle();
			break;

		case 2:
			urun_listele();
			break;

		}
	}

}
