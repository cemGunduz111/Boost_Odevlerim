package com.cem;

import java.util.Scanner;

// 1.metot: dışarıdan girilen harfle başlayan illeri yazdır.
// 2.metot: illeri plaka kodlarıyla yazdıran metot
// 3.metot: girdiğimiz şehrin ismine göre plakayı dönsün
// 4.metot: ilk harf hariç sesli harfleri silip yazdıran fonksiyon
// 5.metot: bir önceki metottan dönen değerlerin ilk 3 harfini alın ve sonuna ... ekleyin
// 6.metot(ödev): bir önceki metottan dönen dizide b ile başlayan illerin başına 1-blk gibi yazdırılsın.
// 7.metot(ödev): ikinci harfi a olanların ilk değeri ve sadece ilk 3 harfini büyük yazdıran
// 7 için örnek: ÇAN, GAZ, KAY, BAY...

public class Odev_Question48 {

	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	public static void main(String[] args) {

		// harf();
		// ilBul("B");
		// plaka();
		// plakaDon();
		// plakaYazdir("Ankara", "Bolu", "Kars", "Batman");
		// sesliHarfSil();
		// ucNokta();
		String[] yeniDizi = sesliHarfleriSil();
		// kisaltma(yeniDizi);
		bIleBaslayan(yeniDizi);
		// ilkUcBuyuk();

	}

	public static void harf() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir harf giriniz: ");
		String harf = scanner.nextLine();
		String liste = "";
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].startsWith(harf.toUpperCase()))
				liste = liste + iller[i] + ", ";
		}
		System.out.println(harf + " ile baslayan iller: " + liste);
	}

	public static void ilBul(String harf) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Bir harf daha girin: "); String harf = scanner.nextLine();
		 * for (int i = 0; i < iller.length; i++) { if
		 * (iller[i].startsWith(harf.toUpperCase().substring(0, 1)))
		 * System.out.println(iller[i]); }
		 */
		for (String il : iller) {
			if (il.startsWith(harf.toUpperCase().substring(0, 1)))
				System.out.println(il);
		}
	}

	public static void plaka() {

		for (int i = 0; i < iller.length; i++) {
			if (i < 9)
				System.out.println("0" + (i + 1) + " - " + iller[i]);
			else
				System.out.println((i + 1) + " - " + iller[i]);

		}
	}

	public static void plakaDon() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Sehir adi girin: ");
		String sehir = scanner.nextLine();

		for (int i = 0; i < iller.length; i++) {
			if (sehir.equalsIgnoreCase(iller[i])) {
				if (i < 10)
					System.out.println("0" + (i + 1));
				else
					System.out.println((i + 1));
			}
		}
	}

	public static void plakaYazdir(String... il) {
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < il.length; j++) {
				if (iller[i].equalsIgnoreCase(il[j].trim())) {
					if (i < 9)
						System.out.println(iller[i] + "-0" + (i + 1));
					else
						System.out.println(iller[i] + "-" + (i + 1));
				}
			}
		}
	}

	public static void sesliHarfSil() {

		String[] sesliler = { "a", "e", "i", "ı", "u", "ü", "o", "ö" };

		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < sesliler.length; j++) {
				if (iller[i].contains(sesliler[j]))
					iller[i] = iller[i].replace(sesliler[j], "");
			}
			System.out.print(iller[i] + ", ");
		}

	}

	public static String[] sesliHarfleriSil() {
		String[] sesliHarfler = { "a", "e", "i", "ı", "u", "ü", "o", "ö" };
		String[] yeniDizi = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < sesliHarfler.length; j++) {
				if (iller[i].contains(sesliHarfler[j]))
					iller[i] = iller[i].replace(sesliHarfler[j], "");
			}
			yeniDizi[i] = iller[i];
		}
		return yeniDizi;
	}

	public static void ucNokta() {

		String[] sesliHarfler = { "a", "e", "i", "ı", "u", "ü", "o", "ö" };

		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < sesliHarfler.length; j++) {
				if (iller[i].contains(sesliHarfler[j]))
					iller[i] = iller[i].replace(sesliHarfler[j], "");
			}
			if (iller[i].length() <= 2)
				System.out.println(iller[i] + "...");
			else
				System.out.println(iller[i].substring(0, 3) + "...");
		}

	}

	public static void kisaltma(String[] dizi) {

		for (int i = 0; i < iller.length; i++) {
			if (dizi[i].length() <= 2)
				System.out.println(iller[i] + "...");
			else
				System.out.println(iller[i].substring(0, 3) + "...");
		}

	}

	public static void bIleBaslayan(String[] dizi) {
		int sayac = 1;
		for (int i = 0; i < iller.length; i++) {
			if (dizi[i].startsWith("B")) {
				System.out.println(sayac + "-" + iller[i]);
				sayac++;
			}
		}
	}

	public static void ilkUcBuyuk() {

		for (int i = 0; i < iller.length; i++) {
			if (iller[i].charAt(1) == 'a')
				System.out.println(iller[i].substring(0, 3).toUpperCase());
		}
	}
}