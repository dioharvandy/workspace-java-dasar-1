import java.util.Scanner;

public class LuasPersegiPanjang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan panjang persegi panjang");
		double panjang = scan.nextDouble();
		
		System.out.println("Masukkan Lebar persegi panjang");
		double lebar = scan.nextDouble();
		
		/* Hitung */
		double area = panjang * lebar;		
		System.out.println("Luas persegi panjang adalah : " + area);
		
		scan.close();

	}

}
