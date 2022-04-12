import java.util.Scanner;
import java.util.Arrays;
public class SoalSatuDuaTiga {

	public static void main(String[] args) {
		soalTiga();

	}
	
	static void soalSatu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Angka : ");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print("OKYES ");
			}
			else if(i%3==0) {
				System.out.print("OK ");
			}
			else if(i%4==0) {
				System.out.print("YES ");
			}
			else {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}
	static void soalDua() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Angka : ");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				int k=i;
				System.out.print(k);
			}
			System.out.print("\n");
		}
		scan.close();
		
	}
	static void soalTiga() {
		int[] array = {12,9,13,6,10,4,7,2};
		
		int panjangArrayBaru = 0;
		
		for(int x : array) {
			if(x%3==0) {
				continue;
			}
			panjangArrayBaru++;			
		}	
		
		int[] arrayBaru = new int[panjangArrayBaru];
		
		int indeksArraybaru = 0;		
		for(int x : array) {
			if(x%3==0) {
				continue;
			}
			arrayBaru[indeksArraybaru] = x;
			indeksArraybaru++;			
		}
		Arrays.sort(arrayBaru);
		for(int x : arrayBaru) {
			System.out.print(x+" ");
		}
	}

}
