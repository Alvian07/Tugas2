import java.util.Scanner;
public class lingkaran{
public static void main(String[] args){
	int jarijari;
	double luas;
		Scanner scan = new
		Scanner(System.in);
System.out.ptinrln("Menghitung luas lingkaran");
System.out.print("Masukan jari-jari = ");
	jarijari = scan.nextInt();
	luas = 3.14*(jarijari*jarijari);
System.out.println("luas lingkaran = "+luas);
	}
}