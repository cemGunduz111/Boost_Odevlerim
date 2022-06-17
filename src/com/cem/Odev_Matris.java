package com.cem;

import java.util.Scanner;

public class Odev_Matris {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir tek sayı giriniz: ");
		int sayi = sc.nextInt();
		System.out.println("Matrisin satır sayısını giriniz: ");
		int satir = sc.nextInt();
		System.out.println("Matrisin sütun sayısını giriniz: ");
		int sutun = sc.nextInt();

		int[][] dizi = new int[satir][sutun];

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					System.out.print((sayi / 2) + 1 + " ");
				}

				else if (j >= i) {
					System.out.print(sayi + " ");
				}

				else if (i >= j)
					System.out.print((sayi - sayi + 1) + " ");
			}
			System.out.println();
		}
	}
}
