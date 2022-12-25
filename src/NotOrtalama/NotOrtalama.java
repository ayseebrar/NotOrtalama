package NotOrtalama;
import java.util.Scanner;
public class NotOrtalama {

	public static void main(String[] args) {
		int guiz;
		int vize;
		int sonSınav;
		double ortalama;
		Scanner input = new Scanner(System.in);
		System.out.println("guiz notunu giriniz:");
		guiz = input.nextInt();
		System.out.println("vize notunu giriniz:");
		vize= input.nextInt();
		System.out.println("sonSınav notunu giriniz:");
		sonSınav =input.nextInt();
		ortalama=(guiz*0.2)+(vize*0.3)+(sonSınav*0.5);
		System.out.println("ortalama:"+ortalama);
		String sonuc=(ortalama>=50) ? "geçtiniz" :"kaldınız";
	
		System.out.println(sonuc);
		

	}

}
