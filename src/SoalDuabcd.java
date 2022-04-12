import java.util.Scanner;
public class SoalDuabcd {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Masukkan Angka : ");
	int n = scan.nextInt();
	//duaD(n);	Panggil Fungsi
	
	scan.close();
	}
	
	static void duaB(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
	static void duaC(int n) {
		int a = 1, nilaiAkhir=1;
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(nilaiAkhir+" ");
				if(nilaiAkhir==n) {
					a=-1;
				}
				else if(nilaiAkhir==1) {
					a=1;
				}
				nilaiAkhir+=a;
			}
			System.out.println("");
		}
		
	}
	static void duaD(int n) {
		int nilaiAkhir;
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j%2==0) {
					nilaiAkhir =(n*j)+i+1;
					System.out.print(nilaiAkhir+" ");
				}
				else {
					nilaiAkhir=(n*(j+1)-i);
					System.out.print(nilaiAkhir+" ");
				}
				
			}
			
			System.out.println("");
		}	
	}

}
