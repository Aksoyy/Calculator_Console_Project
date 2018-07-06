package com.hsoft.calculator;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Calculator 
{
	public static void main(String[] args)
	{
		double number1,number2,result;
		double numbers[] = new double[2];
		int menu,faktoriyel,limit;
	
		/* Kullanıcının veri girişi ile hesap makinesini 'Çıkış' 
		 * seçeneğine basana kadar işlemin devam edeceği bölümdür. */
		do
		{	
			menu = MenuPrefer(); /* İlk başta menu ekranının konsolda gösterileceği ve seçimin yaplacağı yerdir. */
			switch(menu)
			{
				case 1:
					System.out.println("1. sayiyi giriniz : "); number1 = GetDecimalNumber();
					System.out.println("2. sayiyi giriniz : "); number2 = GetDecimalNumber();                                                 
					result = Addition(number1,number2);
					ResultDisplay(result);		
					break;
				case 2:
					for( int i=0;i<2;i++ )                               //sayi1 = OndalikSayiAl();
					{                                                    //sayi2 = OndalikSayiAl();
						System.out.println((i+1)+" . sayiyi giriniz : ");  //sonuc = Cikar(sayi1,sayi2);
						numbers[i] = GetDecimalNumber();                    //SonucGoster(sonuc);
					}	                                                 
					result = Subtraction(numbers[0],numbers[1]);
					ResultDisplay(result);
					break;
/*	*/			case 3:
					for( int i=0;i<2;i++ )                               //sayi1 = OndalikSayiAl();
					{                                                    //sayi2 = OndalikSayiAl();
						System.out.println(i+1+" . sayiyi giriniz : ");  //sonuc = Carpim(sayi1,sayi2);
						numbers[i] = GetDecimalNumber();                    //SonucGoster(sonuc);
					}	                                                 
					result = Multiplication(numbers[0],numbers[1]);
					ResultDisplay(result);
					break;
				case 4:
					for( int i=0;i<2;i++ )                               //sayi1 = OndalikSayiAl();
					{                                                    //sayi2 = OndalikSayiAl();
						System.out.println(i+1+" . sayiyi giriniz : ");  //sonuc = Bolme(sayi1,sayi2);
						numbers[i] = GetDecimalNumber();                    //SonucGoster(sonuc);
					}	                                                 
					result = Division(numbers[0],numbers[1]);
					ResultDisplay(result);
					break;
				case 5:
					System.out.println("Lutfen bir tam sayi giriniz : ");
					faktoriyel = TamSayiAl();
					result = Fakto(faktoriyel);
					ResultDisplay(result);
					break;
				case 6:
					System.out.println("Rastgele sayi uretimi icin siniri belirleyiniz : ");
					limit = TamSayiAl();
					result = GetRandomIntNumber(limit);
					ResultDisplay(result);
					break;
				case 7:
					System.out.println("Lutfen modunu alacağımız sayiyi giriniz : ");
					number1 = GetDecimalNumber();
					System.out.println("Lutfen mod değerini giriniz : ");
					number2 = GetDecimalNumber();
					result = Mode(number1,number2);
					ResultDisplay(result);
					break;
				case 8:
					System.out.println("Lutfen kuvvetini alacağımız sayiyi giriniz : ");
					number1 = GetDecimalNumber();
					System.out.println("Lutfen sayinin derecesini giriniz (Tam sayi) : ");
					limit = TamSayiAl();
					result = GetUpper(number1,limit);
					ResultDisplay(result);
					break;
				case 9:
					System.out.println("Cikis islemi basladi.");
					break;
				default: // Kullanıcıya enter'a basma mesajının gözükmesinden sonra döngünün devam ettiği yerdir.
					Scanner goster = new Scanner(System.in);
					System.out.println("-Belirlenen aralikta bir deger giriniz-");
					System.out.println("Tekrar secim yapmak icin enter'a basiniz");
					goster.nextLine(); 
					break;
			}
		}
		while( menu!=9 );
		System.out.println("Cikis yapıldi");
	}
	
	/* MenuSecim metodunun içinde çağırılır ve konsolda görülen ilk çıktıdır. */
	public static void MenuOpen()
	{
		System.out.println("---YAPILACAK ISLEMI SECINIZ---\n"+
				 	"1-Toplama islemi\n"+
					"2-Cikarma islemi\n"+
					"3- Carpma islemi\n"+
					"4- Bolme islemi\n"+
					"5- Faktoriyel islemi\n"+
					"6- Rastgele sayi uretimi\n+"+
					"7- Mod islemi \n"+
					"8- Ust kuvvetini alma islemi \n"+
					"9- Cikis islemi \n");
	}
	
	/* Bu metod içinde seçim için kullanıcıdan bir tam sayi girişi beklenir.
	 * Kullanıcının girdiği veri kontrol edilir.
	 * Eğer girilen veri bir tam sayı değilse kullanıcıya hata mesajı gösterilir.
	 * Bu işlem while döngüsü içerisinde olduğu için; tam sayi girilene kadar kullanıcıdan veri girişi alınır.*/
	public static int MenuPrefer()
	{
		int sayi; 
		MenuOpen();
		System.out.println("Lutfen seciminizi yapiniz : ");
		while (true)    		
		{
			try
            {
                Scanner scan = new Scanner(System.in);
                sayi = scan.nextInt();
                return sayi;
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Hata: Lütfen int tipinde bir sayı giriniz!");
            }
       }
	}

	/* Burada kullanıcıdan Ondalikli bir sayi girişi istenir.
	 * Kullanıcının girdiği veri eğer istenilen veri tipinde değilse hata mesajı gönderilir.
	 * While döngüsü kullanılarak istenilen veri tipinde bir giriş yapılana kadar işlem devam eder. */
	public static double GetDecimalNumber()
	{
		 double sayi;				//Scanner open = new Scanner(System.in);
			while (true)    		//double sayi = open.nextDouble();
			{	                    //return sayi;*/
				try
	            {
	                Scanner scan = new Scanner(System.in);
	                sayi = scan.nextDouble();
	                return sayi;
	            } 
	            catch (InputMismatchException e) 
	            {
	                System.out.println("Hata: Lütfen double tipinde bir sayı giriniz!");
	            }
	       }
	}
	
	/* Burada kullanıcıdan tam sayi girişi istenir.
	 * Kullanıcının girdiği veri eğer istenilen veri tipinde değilse hata mesajı gönderilir.
	 * While döngüsü kullanılarak istenilen veri tipinde bir giriş yapılana kadar işlem devam eder. */
	public static int TamSayiAl()
	{
	        int sayi;
			while (true) 
	        {
	            try
	            {
	                Scanner scan = new Scanner(System.in);
	                sayi = scan.nextInt();
	                if(sayi<1)
	                {
	                	return 0;
	                }
	                return sayi;
	            } 
	            catch (InputMismatchException e) 
	            {
	                System.out.println("Hata: Lütfen integer tipinde bir sayı giriniz!");
	            }
	       }
	}
	
	/* Belirtilen 4 tane metodda girilen 2 değer arasındaki işlemi belirttir. */
	public static double Addition(double param1,double param2)
	{
		return param1+param2;
	}
	public static double Subtraction(double param1,double param2)
	{
		return param1-param2;
	}
	public static double Division(double param1,double param2)
	{
		return param1/param2;
	}
	public static double Multiplication(double param1,double param2)
	{
		return param1*param2;
	}
	
	public static int Mode(double param1, double param2)
	{
		int sonuc = (int)param1 % (int)param2;
		return sonuc;
	}
	
	public static double GetUpper(double param1, int degree)
	{
		double result=param1;
		for (int i = 1; i < degree; i++)
		{
			result *= param1;
		}
		return result;
	}
	
	/* Kullanıcıdan alınan değerle faktoriyel hesabının yapıldığı metodu belirtir. */
	public static int Fakto(int alinan_deger)
	{
		if(alinan_deger<1) return 0;
		int fakt=1;
		for(int i=1; i<=alinan_deger; i+=1 )
		{
			fakt *= i;
		}
		return fakt;
	}

	/* Burada kullanıcıdan alınan sınır değer ile 1 arasında bir tam sayinin giretildiği yerdir.*/
	public static int GetRandomIntNumber(int num)
	{
		Random randomNum = new Random();
		return randomNum.nextInt(num)+1;
	}
	
	/* Yapılan işlemin sonucunu gösteren metoddur.
	 * Bu metoddan sonra kullanıcıdan tekrardan veri girişi istenmektedir.*/
	public static void ResultDisplay( double param)
	{
		Scanner goster = new Scanner(System.in);
		System.out.println("Islemin sonucu : "+param);
		System.out.println("Islemlerin devam etmesi icin enter'a basiniz");
		goster.nextLine();
	}
}