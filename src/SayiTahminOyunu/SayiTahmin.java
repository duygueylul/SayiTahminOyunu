package SayiTahminOyunu;


import java.util.Random;
import java.util.Scanner;
public class SayiTahmin {

	
	public static void main(String[] args) {
		
		int tahmin, can = 5, i = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int sayi = rand.nextInt(100);
		boolean oyunDurum = false, hata = false;
		
		
		int[] tahminler = new int[5];
		System.out.println(sayi);
		System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz !!!");
		System.out.println("0-99 Arasında Bir Sayı Tutunuz.");
		
		while(can > 0) {
			System.out.println("Tahmin: ");
			tahmin = scan.nextInt();
			tahminler[i++] = tahmin;
			
			if((tahmin < 0) || (tahmin > 99)) {
				if(hata) {
					System.out.println("Çok fazla hatalı giriş yaptınız 1 can kaybettiniz");
					System.out.println("Kalan Can: " + --can);
				}
				else {
					hata = true;
				System.out.println("Lütfen 0-99 arasında bir sayı giriniz !!");
				}
				continue;
			}
			
			if(tahmin == sayi) {
				oyunDurum = true;
				break;
			}
			else {
				System.out.println("Yanlış Tahmin, tekrar deneyiniz !: " + --can );
			}
		}
		
		if(oyunDurum) {
			System.out.println("Tebrikler doğru tahmin!!");
			System.out.println("Sayımız: " + sayi);
			System.out.println("Kalan Can: " + can);
		}
		else {
			System.out.println("Başaramadınız!!!");
		}
		System.out.println("Tahminleriniz: ");
		for(int value : tahminler) {
			if(value != 0)
			System.out.println(value + ",");
		}
	}

}
