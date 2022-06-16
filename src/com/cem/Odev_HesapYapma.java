package com.cem;

import java.util.Scanner;

public class Odev_HesapYapma {
	public static void main(String[] args) {

//		System.out.println((int) '1' - 48);
//      System.out.println((int) '2' - 48);
//      System.out.println((int) '3' - 48);

		System.out.println("Enter text ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int sayi1 = 0;
		int sayi2 = 0;
		int sonuc = 0;
		String islem = "";

		for (String cumle : text.split(" ")) {
			if (cumle.contains("topla")) {
				islem = "topla";
			} else if (cumle.contains("çıkar")) {
				islem = "çıkar";
			} else if (cumle.contains("çarp")) {
				islem = "çarp";
			} else if (cumle.contains("böl")) {
				islem = "böl";
			}

			String stringSayi = "";
			for (int i = 0; i < cumle.length(); i++) {
				if (Character.isDigit(cumle.charAt(i))) {
					stringSayi = stringSayi + cumle.charAt(i);
				}
			}

			if (stringSayi != "") {
				int sayi = 0;

				for (int i = 0; i < stringSayi.length(); i++) {
					int index = (int) stringSayi.charAt(i);
					if (index > 46 && index < 58)
						sayi = sayi * 10 + index - 48;

				}
				if (sayi1 == 0) {
					sayi1 = sayi;
				} else {
					sayi2 = sayi;
				}
			}
		}

		switch (islem) {
		case "topla":
			sonuc = sayi1 + sayi2;
			break;
		case "çıkar":
			sonuc = sayi1 - sayi2;
			break;
		case "çarp":
			sonuc = sayi1 * sayi2;
			break;
		case "böl":
			sonuc = sayi1 / sayi2;
			break;
		default:
			break;
		}

//		if (islem == "topla") {
//			sonuc = sayi1 + sayi2;
//		} else if (islem == "çıkar") {
//			sonuc = sayi1 - sayi2;
//		} else if (islem == "çarp") {
//			sonuc = sayi1 * sayi2;
//		} else if (islem == "böl") {
//			sonuc = sayi1 / sayi2;
//		}

		System.out.println("Seçilen 1. sayı : " + sayi1);
		System.out.println("Seçilen 2. sayı : " + sayi2);
		System.out.println("Seçilen işlem : " + islem);

		System.out.println("Sonuç : " + sonuc);

	}
}
