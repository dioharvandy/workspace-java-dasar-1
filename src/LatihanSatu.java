
public class LatihanSatu {
	static Double[] nilaiSiswa = {3.2, 6.0, 7.4, 8.2, 9.0, 4.0, 8.0, 5.4, 6.0, 5.2, 5.6};
	
	public static void main(String[] args) {
		/* Cari dan tampilkan nilai tertinggi dari array "nilaiSiswa"; */
		System.out.println("Nilai Tertinggi : "+cariNilaiTertinggi(nilaiSiswa));
		
		/* Cari dan tampilkan nilai terendah dari array "nilaiSiswa"; */
		System.out.println("Nilai Terendah : "+ cariNilaiTerendah(nilaiSiswa));
		
		/* Hitung dan tampilkan nilai rata2 dari semua angka dari "array yang baru" */
		Double[] arrayBaruDiurut = seleksiUrutArrayBaru(nilaiSiswa);
		System.out.println("Rata-Rata : "+cariRataRata(arrayBaruDiurut));
		
		/* Tampilkan "array yang baru" ke layar */
		System.out.print("Hasil Sorting : ");
		for(Double nilai : arrayBaruDiurut) {
			System.out.print(nilai+" ");
		}

	}
	
	static Double cariNilaiTertinggi(Double[] totalnilaiSiswa) {
		Double nilaiTertinggi = 0.0;
		for(Double nilaiSiswa : totalnilaiSiswa) {
			if(nilaiTertinggi<nilaiSiswa) {
				nilaiTertinggi = nilaiSiswa;
			}			
		}
		return nilaiTertinggi;
	}
	static Double cariNilaiTerendah(Double[] totalnilaiSiswa) {
		Double nilaiTerendah = 10.0;
		for(Double nilaiSiswa : totalnilaiSiswa) {
			if(nilaiTerendah>nilaiSiswa) {
				nilaiTerendah = nilaiSiswa;
			}			
		}
		return nilaiTerendah;
	}
	
	 static Double[] seleksiUrutArrayBaru(Double[] totalnilaiSiswa) {
		/*
		* Gunakan Switch case untuk membuang nilai 6.0, 8.0, 9.0 dari array dan
		* menyalinnya ke "array yang baru"
		*/
		int panjangIndexArrayBaru = 0;
		for(Double x : totalnilaiSiswa) {
			switch(Double.toString(x)) {
			case "6.0":
				continue;
			case "8.0":
				continue;
			case "9.0":
				continue;
			}
			panjangIndexArrayBaru++;
		}		
		Double arrayBaru[] = new Double[panjangIndexArrayBaru];
		int indexArrayBaru = 0;
		for(Double x : totalnilaiSiswa) {
			switch(Double.toString(x)) {
			case "6.0":
				continue;
			case "8.0":
				continue;
			case "9.0":
				continue;
			}
			arrayBaru[indexArrayBaru] = x;
			indexArrayBaru++;
		}
		
		/* Mengurutkan Array Baru Secara Descending */
		Double temp = 0.0;
		for(int i=0; i<arrayBaru.length; i++) {
			for(int j=i+1; j<arrayBaru.length; j++) {
				if(arrayBaru[i]<arrayBaru[j]) {
					temp = arrayBaru[i];
					arrayBaru[i] = arrayBaru[j];
					arrayBaru[j] = temp;
				}
			}
		}
		return arrayBaru;
	}
	 
	static Double cariRataRata(Double[] totalnilaiSiswa) {
		int totalIndeks = 0;
		Double nilaiTotalArray = 0.0, rataRata = 0.0;
		for (Double x : totalnilaiSiswa) {
			nilaiTotalArray+=x;
			totalIndeks++;
		}		
		rataRata = nilaiTotalArray/totalIndeks;
		return rataRata;
	}
}
