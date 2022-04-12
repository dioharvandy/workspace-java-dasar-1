
public class TestLoop {
	
	public static void main(String[] args) {	
		forPertama();

	}
	
	static void forPertama() {
		int[] angka = {10,20,30,40,50};
		String[] nama = {"James","larry","Tom","Lacy"};
		for (int x : angka) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		for (String x : nama) {
			System.out.print(x);
			System.out.print(",");
		}		
	}
	static void forKedua() {
		int[] angka = {10,20,30,40,50};
		for (int x : angka) {
			if(x==30) {
				break; //continue; juga bisa 
			}
			System.out.println(x);
		}
	}
	static void whilePertama() {
		int a = 10;
		while(a<20) {
			System.out.println(a);
			a++;
		}
	}
	static void whileKedua() {
		int a = 10;
		do {
			System.out.println(a);
			a++;
		}
		while(a<20);
	}
	
}
