import java.util.Scanner;

public class TestCondition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int exit = 1;
		do {
		System.out.print("coba pilih: ");
		int nilai = scan.nextInt();
		switch(nilai) {
		case 1:
			System.out.println("lanjut 1");
			break;
		case 2:
			System.out.println("lanjut 2");
			break;
		case 3:
			System.out.println("lanjut 3");
			break;
		case 4:
			exit = 0;
			System.out.println("stopped");
			break;
		default:
			System.out.println("salah");
		}}
		while(exit == 1);
		scan.close();

	}
	

}
