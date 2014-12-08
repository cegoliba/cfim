import java.util.Scanner;

public class CFIM {

	public CFIM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullanýcýya, programýn amacý ve programa ne þekilde veri gireceði
		// konusunda bilgi verelim.
		System.out.println("Feet boyutundaki bir deðeri metre boyutuna çevirme programýna hoþgeldiniz.");
		System.out.println("Metreye çevirilecek, feet boyutunda, ondalýklý ya da tam sayý olan bir deðer girin. 'Örneðin: 3,14 veya 123'");

		// Kullanýcýnýn girdiði veriyi okumak için scanner türünden
		// deðiþkenimizi tanýmlayalým.
		Scanner input = new Scanner(System.in);

		// Kullanýcýnýn girdiði veriyi saklamak için double türünden
		// deðiþkenimizi tanýmlayalým.
		double feet = 0;

		// Kullanýcýnýn girdiði verinin türünün double olup olmadýðý kontrolünü
		// yapalým.
		if (input.hasNextDouble()) {

			// Kullanýcýnýn girdiði deðeri saklamak için tanýmladýðýmýz
			// deðiþkenimizin içine atayalým.
			feet = input.nextDouble();

			/*
			 * Kullanýcýnýn girdiði feet boyutundaki deðeri metreye çevirme
			 * iþlemimizi ve bu iþlem sonucunda çýkacak deðeri saklayacak double
			 * türünden deðiþkenimizi tanýmlayalým.
			 */
			double meter = feet * 0.305;

			// Kullanýcýya girdiði feet deðerinin metre olarak karþýlýðýný
			// gösterelim.
			System.out.printf(
					"Girmiþ olduðunuz %f feet deðeri %f metre etmektedir.",
					feet, meter);
		}
		// Kullanýcý istediðimiz veri türünde bir deðer girmezse kullanýcýyý
		// uyaralým.
		else {
			System.out
					.println("Geçerli bir deðer girmediniz. Geçerli girdi örneði: '3,14 veya 123'");

		}
	}
}
