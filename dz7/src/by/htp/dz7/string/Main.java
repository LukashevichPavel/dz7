package by.htp.dz7.string;

public class Main {

public static void main(String[] args) {
	//������� � ������ 1 
	System.out.println("� ������ ����� ������ k-� ����� �������� �������� ��������. ���� k ������ ����� �����, ������������� �� ���������.");
	String s="� ������ ����� ������ k-� ����� �������� �������� ��������. ���� k ������ ����� �����, ������������� �� ���������.";
	int k=5; //������ � ������ ����� ����������
	String s2=""; //��������� ������ ����� ��������� ����� 
char sInsert='1'; //�� ����� ������ ����� ��������
if (k>s.length()){System.out.println("k>s.length");}//��������� �� ������ �� � ����� ������
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
	//������� � ������ 2
	System.out.println("������� �� ������ ��� �����, ����������� ����� ����� ���������,");
	System.out.println("������� �������� (��������, ����� �������� �(� � �)� ��� ����� ����������� �*� � �. �.).");
	String s3="����������� (11111)�()����";
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
	System.out.println(b3.append(b2)); //�� ������� ����� ������ ���� ������
	*/
	
	
	
	System.out.println("���������� ������� �������� � ������� ������ ���� ������� � �������� ������ ���������, + c168, ����������� ������ ������� �");
	System.out.println("���. 90 ������ 1, 6, 9, ������ �������� ������� �� ���. 51, ������� � ������ 8");
	System.out.println("���������� ���������� String.replace, StringBuilder, StringBuffer(����������������). ������� �� String �� ����� �������������� ");
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
