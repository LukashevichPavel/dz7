package by.htp.dz7.string;

public class Main {

public static void main(String[] args) {
	//Задание в классе 1 
	System.out.println("В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.");
	String s="В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.";
	int k=5; //каждый к символ будет заменяться
	String s2=""; //итоговоая строка будет храниться здесь 
char sInsert='1'; //на какой символ будем заменять
if (k>s.length()){System.out.println("k>s.length");}//проверяем не больше ли к длины строки
else{
	int i=1;
s2=s2+s.charAt(0);
while (i<s.length()){
	if (i%k==0) {s2=s2+sInsert;}
	else{s2=s2+s.charAt(i);}
	i++;
}
System.out.println(s2);
}
	//Задание в классе 2
	System.out.println("Удалить из текста его часть, заключенную между двумя символами,");
	System.out.println("которые вводятся (например, между скобками «(» и «)» или между звездочками «*» и т. п.).");
	String s3="Проверочный (11111)т()екст";
	String ch1="(";
	String ch2=")";
	int posStart,posEnd;
	String s4="";
	int j=0;
	System.out.println(s3);
	boolean check=checkForContains(s3,ch1,ch2);
	while (check){
		posStart=search(s3,ch1);
		posEnd=search(s3,ch2);
		s3=cut(s3,posStart,posEnd);
		if (checkForContains(s3,ch1,ch2)==false){check=false; break;}
	}
	System.out.println(s3);
	/*
	StringBuilder b = new StringBuilder("First");
	StringBuilder b2 = new StringBuilder("Second");
	StringBuilder b3 = new StringBuilder("Third");
	System.out.println(b3.append(b2)); //Не зоздает новый объект типа строка
	*/
	
	
	
	System.out.println("Подсчитать сколько объектов и сколько ссылок было создано в процессе работы программы, + c168, контрольная работа Вариант А");
	System.out.println("Стр. 90 задача 1, 6, 9, решить тестовое задание на стр. 51, вариант А задача 8");
	System.out.println("Посмотреть реализацию String.replace, StringBuilder, StringBuffer(потокобезопасный). Вопросы по String на джава собеседованиях ");
	}


public static boolean checkForContains(String s,String ch1,String ch2){
	boolean check=false;
	if (s.contains(ch1)&&s.contains(ch2)){check=true;}
	return check;
} 	
	
public static int search(String s,String ch){
	int pos=0;
	for (int i=0;i<s.length();i++){
		if (ch.charAt(0)==s.charAt(i)){pos=i;}
	}
	return pos;
}

public static String cut(String s,int posStart, int posEnd){
	String tempS="";
	for (int i=0;i<posStart;i++){tempS=tempS+s.charAt(i);}
	for (int i=posEnd+1;i<s.length();i++){tempS=tempS+s.charAt(i);}
	return tempS;
}



}
