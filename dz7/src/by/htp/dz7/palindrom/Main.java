package by.htp.dz7.palindrom;

public class Main {

	public static void main(String[] args) {
		//Задание на дом стр. 51 Вариант А задача 8
		System.out.println("Среди чисел найти число-палиндром. Если таких чисел больше одного,найти второе.");
		Chislo x=new Chislo();
		Chislo []masChisel; 
		int random=1+(int)(Math.random()*15);
		masChisel = new Chislo [random];
		System.out.println("Создано "+random+" случайных чисел");
		for (int i=0; i<random;i++){
			int random2=1+(int)(Math.random()*10);
			x=new Chislo(random2);
			masChisel[i]=x;
		//	System.out.print("Число "+(i+1)+" из "+random2+" цифр: "); 
			System.out.print("Число "+(i+1)+" :");
			x.print();
			x.isPolindrom();
		}
		//Задать число в ручную ()до 10 цифр включительно
		System.out.println("");
		System.out.println("Числа заданные в ручную");
		Chislo x2=new Chislo (4,1,2,3,2,1,4);
		x2.isPolindrom();
		Chislo x3=new Chislo (1,0,2,2,0,1);
		x3.isPolindrom();
		Chislo x4=new Chislo (0,0,1,2,3,3,2,1,0,0);
		x4.isPolindrom();
		
		
		
			
		
		
		
		
	}
	

}
