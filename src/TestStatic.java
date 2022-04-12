
public class TestStatic {
	
	public static void main(String[] args) {
		Manusia manusiaSatu = new Manusia();
		Manusia manusiaDua = new Manusia();
		
		manusiaSatu.nama = "Anto";
		manusiaSatu.suku = "Jawa";
		
		System.out.println("Nama manusia satu = "+ manusiaSatu.nama);
		System.out.println(manusiaSatu.suku);
		System.out.println("Nama manusia dua = "+ manusiaDua.nama);
		System.out.println(manusiaDua.suku);
	}

}
