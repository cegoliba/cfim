import java.util.Scanner;

public class CFIM {

	public CFIM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullan�c�ya, program�n amac� ve programa ne �ekilde veri girece�i
		// konusunda bilgi verelim.
		System.out.println("Feet boyutundaki bir de�eri metre boyutuna �evirme program�na ho�geldiniz.");
		System.out.println("Metreye �evirilecek, feet boyutunda, ondal�kl� ya da tam say� olan bir de�er girin. '�rne�in: 3,14 veya 123'");

		// Kullan�c�n�n girdi�i veriyi okumak i�in scanner t�r�nden
		// de�i�kenimizi tan�mlayal�m.
		Scanner input = new Scanner(System.in);

		// Kullan�c�n�n girdi�i veriyi saklamak i�in double t�r�nden
		// de�i�kenimizi tan�mlayal�m.
		double feet = 0;

		// Kullan�c�n�n girdi�i verinin t�r�n�n double olup olmad��� kontrol�n�
		// yapal�m.
		if (input.hasNextDouble()) {

			// Kullan�c�n�n girdi�i de�eri saklamak i�in tan�mlad���m�z
			// de�i�kenimizin i�ine atayal�m.
			feet = input.nextDouble();

			/*
			 * Kullan�c�n�n girdi�i feet boyutundaki de�eri metreye �evirme
			 * i�lemimizi ve bu i�lem sonucunda ��kacak de�eri saklayacak double
			 * t�r�nden de�i�kenimizi tan�mlayal�m.
			 */
			double meter = feet * 0.305;

			// Kullan�c�ya girdi�i feet de�erinin metre olarak kar��l���n�
			// g�sterelim.
			System.out.printf(
					"Girmi� oldu�unuz %f feet de�eri %f metre etmektedir.",
					feet, meter);
		}
		// Kullan�c� istedi�imiz veri t�r�nde bir de�er girmezse kullan�c�y�
		// uyaral�m.
		else {
			System.out
					.println("Ge�erli bir de�er girmediniz. Ge�erli girdi �rne�i: '3,14 veya 123'");

		}
	}
}
