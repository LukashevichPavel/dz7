package by.htp.dz7.matrix3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Main {

	public static void main(String[] args) throws IOException {
		//������� �� ��� ���. 51 ������� C ������ 3
		Matrix matrix;
		int max, min;
		System.out.println("c 51, ������� � ������ 3");
		System.out.println("������ � ������� n-����������� ������� a[n] [n].");
		System.out.println("������ �������� ������-��� ������� � ��������� �������� �� -n �� n � ������� ������� ��������� �����.");
		System.out.println("����� � ������� ���������� ����� ������������ (���������) ������-��� �������, ������ ������.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� ����������� ������� ");
		int n=Integer.parseInt(reader.readLine());
		matrix=new Matrix(n);	
		matrix.printMatrix();
		matrix.findMaxUp();
		matrix.findMaxDown();
		
		System.out.println("c 51, ������� � ������ 12");
		System.out.println("� ������� ����� ����������� ������� � ����������� ��� �� ����� �������-�� �������� ����� ������������ ����� � ��������.");
		matrix.findMin();
		System.out.println("���� ����������� �������? ������� ����� ������: ");
		int j=Integer.parseInt(reader.readLine());
		System.out.println("������� ����� ������� � ������: ");
		int i=Integer.parseInt(reader.readLine());
		matrix.moveElement(i, j);
	}
}
