package by.htp.dz7.palindrom;

public class Main {

	public static void main(String[] args) {
		//������� �� ��� ���. 51 ������� � ������ 8
		System.out.println("����� ����� ����� �����-���������. ���� ����� ����� ������ ������,����� ������.");
		Chislo x=new Chislo();
		Chislo []masChisel; 
		int random=1+(int)(Math.random()*15);
		masChisel = new Chislo [random];
		System.out.println("������� "+random+" ��������� �����");
		for (int i=0; i<random;i++){
			int random2=1+(int)(Math.random()*10);
			x=new Chislo(random2);
			masChisel[i]=x;
		//	System.out.print("����� "+(i+1)+" �� "+random2+" ����: "); 
			System.out.print("����� "+(i+1)+" :");
			x.print();
			x.isPolindrom();
		}
		//������ ����� � ������ ()�� 10 ���� ������������
		System.out.println("");
		System.out.println("����� �������� � ������");
		Chislo x2=new Chislo (4,1,2,3,2,1,4);
		x2.isPolindrom();
		Chislo x3=new Chislo (1,0,2,2,0,1);
		x3.isPolindrom();
		Chislo x4=new Chislo (0,0,1,2,3,3,2,1,0,0);
		x4.isPolindrom();
		
		
		
			
		
		
		
		
	}
	

}
