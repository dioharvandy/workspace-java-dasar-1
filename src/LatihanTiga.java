import java.util.Scanner;
public class LatihanTiga {
    static String[][] bangkuKelas = {
	          {"Anto",  "Ria",   "Wahyu"},
	          {"X",     "Ani",   "Edi"},
	          {"Andri", "X",     "X"},
	          {"Wira",  "Sinta", "X"}};
	/*
	 * Jumlah kolom = 3; Jumlah baris = 4; 
	 * Pilih bangku kolom ( 1-3 )? 1 
	 * Pilih bangku baris ( 1-4 )? 2
	 * Kalau not X -> Maaf sudah terisi oleh Anto; 
	 * Kalau "X" -> OK!
	 */

	  public static void main(String[] args) {
		  	Scanner scan = new Scanner(System.in);
		  	int jumlahKolom = cariJumlahKolom(bangkuKelas);
		  	int jumlahBaris = cariJumlahBaris(bangkuKelas);
		    System.out.println("Jumlah Kolom = "+jumlahKolom);
		    System.out.println("Jumlah Baris = "+jumlahBaris);
		    
		    System.out.print("\nPilih bangku baris ( 1-"+jumlahBaris+")? : ");
		    int noBaris = scan.nextInt();
		    System.out.print("Pilih bangku kolom ( 1-"+jumlahKolom+" )? : ");
		    int noKolom = scan.nextInt();
		    System.out.println("\n"+cekTempatKosong(bangkuKelas,noBaris,noKolom));
		    
		    scan.close();
		  }
	  static int cariJumlahKolom(String[][] arr) {
		  Integer jumlahKolom = 0;
		  for(String dimSatu[] : arr) {
			  jumlahKolom = 0;
			  for(int i = 0; i<dimSatu.length; i++) {
				  jumlahKolom++;
			  }
		  }
		  return jumlahKolom;
	  }
	  static int cariJumlahBaris(String[][] arr) {
		  Integer jumlahBaris = 0;
			  for(int i = 0; i<arr.length; i++) {
				  jumlahBaris++;
			  }
		  return jumlahBaris;
	  }
	  
	  static String cekTempatKosong(String[][] arr,int a, int b) {
		  String pesan = null;
		  String nilai = arr[a-1][b-1];
		  if(nilai=="X") {
			  pesan = "OK!";
			  return pesan;
		  }
		  else {			  
			  pesan = "Maaf udah terisi oleh "+nilai;
			  return pesan;
		  }
	  }

		}

