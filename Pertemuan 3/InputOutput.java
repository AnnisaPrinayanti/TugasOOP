import java.util.Scanner;    //memanggil scanner di folder java.util

class InputOutput{ 
	public static void main (String [] args) {
		String data;
		
		Scanner scan = new Scanner (System.in);  
		
		System.out.print("Masukkan data : ");
		data = scan.nextLine();  //nextLine berfungsi untuk menerima inputan berupa string
		System.out.println ("Data yang dimasukkan adalah " + data); 
		}
}