import java.util.Scanner;
public class LatihanDua {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Kata-kata Sensor :");
		String kataKataSensor = scan.nextLine();
		String[] kataSensor = kataKataSensor.split(",");
		
		System.out.println("Masukkan Kalimat :");
		String kalimat = scan.nextLine();
		System.out.println(kalimat);
		
		String[] kataKata = kalimat.split(" ");
		System.out.println("Kalimat yang anda masukkan berjumlah "+ kataKata.length+" Kata");
		
		System.out.println("Huruf Duplikat :");
		for(int i = 0; i<kataKata.length; i++) {
			int jumlahKataMuncul = 0;
			for(int j = 0; j<kataKata.length; j++) {
				if(kataKata[i].equals(kataKata[j])) {
					jumlahKataMuncul++;
				}
			}
			int duplikat = 0;
			for(int j = i+1; j<kataKata.length; j++) {
				if(kataKata[i].equals(kataKata[j])) {
					duplikat = 1;
				}
			}
			if(duplikat==0) {
				System.out.print("| "+kataKata[i]+" = "+jumlahKataMuncul+" | ");
			}
		}
		
		System.out.println("");
		System.out.println("Kalimat Setelah Sensor :");
		for(String kata : kataSensor) {
			kalimat = kalimat.replace(kata.trim(),"SENSOR");
		}
		System.out.println(kalimat);
		scan.close();

	}

}
