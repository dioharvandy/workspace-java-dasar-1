import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class ImportFileDasar {

	public static void main(String[] args) {
        String alamatFile = "file/teks.txt"; 
        
        /*	Baca File*/
		try {
			File file = new File(alamatFile);
			Scanner isiFile = new Scanner(file);
			
            while(isiFile.hasNextLine()){
                String data = isiFile.nextLine();
                System.out.println(data);
            }
            
            
            isiFile.close();
		}
		catch (IOException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
		
	}
	
	static String ubahDataFile(String alamatFile, String konten) {
        try {
            FileWriter fileWriter = new FileWriter(alamatFile);
            fileWriter.write(konten);
            fileWriter.close();
            
            return "File sudah ditulis ulang!";
        } catch (IOException e) {
            return "Terjadi kesalahan karena: " + e.getMessage();
        }
	}


}
