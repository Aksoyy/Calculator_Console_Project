import java.util.Scanner;

public class Calculater
{
	public static void main(String[] args)
	{
		Scanner tarama = new Scanner(System.in);
		System.out.println("Programin baslangici");
		double x,y,toplam,carpim;
		System.out.println("Ilk sayiyi giriniz:");
		x = tarama.nextDouble();
		System.out.println("Ikıncı sayıyı giriniz");
		y = tarama.nextDouble();
		toplam = x+y;
		carpim = x*y;
		System.out.println("Girilen sayiların toplamı : "+toplam);
		System.out.println("Girilen sayiların carpimi : "+carpim);
	}
}
