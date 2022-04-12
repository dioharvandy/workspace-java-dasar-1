import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class LatihanEmpat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Alamat File :");
		String alamatFile = scan.nextLine();
		try {
			File file = new File(alamatFile);
			Scanner isiFile = new Scanner(file); 	
			System.out.println("Besar File = "+file.length()+" Bytes"); 
			
			String seluruhKata = "";
			int konter = 0;
            while(isiFile.hasNextLine()){
            	if(konter==0) {
            		seluruhKata = seluruhKata+isiFile.nextLine();	
            	}
            	else {
            		seluruhKata = seluruhKata+"\n"+isiFile.nextLine();
            	}
            	konter++;
            }
            System.out.println(seluruhKata);
            String[] kataKata = seluruhKata.split(" ");
            System.out.println("Jumlah Kata = "+kataKata.length+" Kata");
            
    		System.out.println("Masukkan Kata Yang Mau Di Replace :");
    		String kataMauReplace = scan.nextLine();
    		System.out.println("Dengan Kata :");
    		String kataReplace = scan.nextLine();
    		
    		seluruhKata = seluruhKata.replace(kataMauReplace, kataReplace);
    		
            try {
                FileWriter fileWriter = new FileWriter(alamatFile);
                fileWriter.write(seluruhKata);
                fileWriter.close();
                System.out.println("File Saved!!");
            } catch (IOException e) {
            	System.out.println("Terjadi kesalahan karena: " + e.getMessage());
            }
            isiFile.close();
    		scan.close();
		}
		catch (IOException e) {
            System.out.println("File Tidak Ditemukan");
        }
		
		
	}	
}
