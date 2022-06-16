package com.cem;

import java.util.Scanner;

public class Odev_YildizKaydirma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nokta = ".";
		int sayi;
		int yon;

		sayi = scan.nextInt();

		int dikey = sayi / 2;
		int yatay = sayi / 2;

		do {
			for (int i = 0; i < sayi; i++) {
				for (int j = 0; j < sayi; j++) {
					if (i == dikey && j == yatay) {
						System.out.print("* ");
					}

					else {
						System.out.print(nokta + " ");
					}
				}

				System.out.println();
			}

			yon = scan.nextInt();

			switch (yon) {
			case 2:
				if (dikey < sayi - 1)
					dikey++;
				else
					dikey = 0;
				break;

			case 4:
				if (yatay > 0)
					yatay--;
				else
					yatay = sayi - 1;
				break;

			case 6:
				if (yatay < sayi - 1)
					yatay++;
				else
					yatay = 0;
				break;

			case 8:
				if (dikey > 0)
					dikey--;
				else
					dikey = sayi - 1;
				break;
			}

		} while (yon != 0);
	}
}
